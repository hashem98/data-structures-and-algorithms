# Graphs
>> A graph data structure mainly stores connected data, for example, a network of people or a network of cities. A graph data structure typically consists of nodes or points called vertices. Each vertex is connected to another vertex using links called edges.


## Challenge
>> Implement a Graph data structure from scratch with its main methods


## Approach & Efficiency
* ``addVertex`` Time: O(1), Space: O(1)
* ``addedge`` Time: O(1), Space: O(1)
* ``getVertex`` Time: O(1), Space: O(n): n is the number of nodes
* ``getneighbors`` Time: O(1), Space: O(m) m is the number of the neighbor nodes
* ``size`` , Time: O(n): n is the number of nodes , Space: O(1)


## API
* ``addVertex`` : only to add a new node into the graph without any connection to other nodes
* ``addedge`` : to add a connection between two nodes with the required weight (the weight is optional)
* ``getVertex``: to get all the nodes in the graph as a list
* ``getneighbors`` : to get all the connections of the required node as a list
* ``size`` : to get the size (number) of all the nodes in the graph
---------
 
  # [My Code](https://github.com/hashem98/data-structures-and-algorithms/tree/main/Java/Graphs/lib/src)