package Graphs;

import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> adjVertices;
    private int cost;

    Graph() {
        adjVertices = new HashMap<>();
    }

    Vertex addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
        return vertex;

    }

    void addEdge(String data1, String data2,int er) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }
    public void addEdgesWithWeight(Vertex node1, Vertex node2, int weight) {

        Vertex newNode1 = new Vertex(node1.data,weight);
        Vertex newNode2 = new Vertex(node2.data,weight);

        adjVertices.get(newNode1).add(newNode2);
        adjVertices.get(newNode2).add(newNode1);
    }


    public List<Vertex>  getVertex(String data) {

        if( adjVertices.get(data)==null )
            System.out.println("not found");
        return adjVertices.get(data);
    }


    public List<Vertex> getNeighbors(String node) {
        if (adjVertices.containsKey(node)) {
            return null;
        }

        return adjVertices.get(node);
    }

    void removeVertex(String data ){
        Vertex vertex = new Vertex(data);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(new Vertex(data));
    }

    void removeEdge(String data1, String data2){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        List<Vertex> edgeVertex1= adjVertices.get(vertex1);
        List<Vertex> edgeVertex2= adjVertices.get(vertex2);

        if(edgeVertex1 != null){
            edgeVertex1.remove(vertex2);
        }
        if(edgeVertex2 != null){
            edgeVertex2.remove(vertex1);
        }
    }

    String printGraph() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            stringBuilder.append(vertex);
            stringBuilder.append(adjVertices.get(vertex));
        }
        return stringBuilder.toString();
    }

    int size(){
        return adjVertices.size();
    }
    //    >>>>>>>>>>>>>>>breadth First<<<<<<<<<<<<<<<<<<<><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    Set<String> bft(Graph graph, String root) {

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : graph.getAdjvertices(vertex)) {
                if (!visited.contains(v.data)) {
                    visited.add(v.data);
                    queue.add(v.data);
                }
            }
        }
        return visited;
    }
    private List<Vertex> getAdjvertices(String data) {
        return adjVertices.get(new Vertex(data));
    }
    //    >>>>>>>>>>>>>>>graph-business-trip<<<<<<<<<<<<<<<<<<<><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public int businessTrip(Graph tripGraph, String[] cities) {

     cost = 0;
        int arraySize = cities.length;

        for (int i = 0; i < arraySize - 1; i++) {
            distance(cities[i], cities[i + 1], tripGraph);
        }
        return cost;
    }

    private void distance(String city1, String city2, Graph graph) {
        if (graph.getNeighborss(city1) == null) {
            return;
        }
        for (Vertex nodes : graph.getNeighborss(city1)) {
            if (Objects.equals(city2, nodes.data)) {
                cost = cost + nodes.weight;
            }
        }
    }

    //    >>>>>>>>>>>>>>>graph-depth-first<<<<<<<<<<<<<<<<<<<><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    Set<String> dft(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);

                for (Vertex v : graph.getAdjvertices(vertex)) {
                    stack.push(v.data);
                }
            }
        }

        return visited;
    }

    public List<Vertex> getNeighborss(String data) {
        return adjVertices.get(new Vertex(data));
    }






}
