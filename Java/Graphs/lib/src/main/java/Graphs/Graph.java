package Graphs;

import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> adjVertices;

    Graph() {
        adjVertices = new HashMap<>();
    }

    void addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(String data1, String data2,int er) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
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


}
