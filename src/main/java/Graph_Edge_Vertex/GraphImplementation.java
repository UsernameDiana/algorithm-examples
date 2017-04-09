package Graph_Edge_Vertex;

// Formally,a graph is an object consisting of a vertex set and an edge set. 
// This is an undirected, simple graph. 
// In this graph, we have edges that relate to two vertices. 
// There is at most one edge per pair of vertices. 

public class GraphImplementation 
{
    public static void main(String[] args)
    {
        Graph graph = new Graph();
        
        // I initialize some verticies and add them to the Graph
        Vertex[] verticies = new Vertex[5];
        for (int i = 0; i < verticies.length; i++)
        {
            verticies[i] = new Vertex("" + i);
            graph.addVertex(verticies[i], true);
        }
        
        for (int i = 0; i < verticies.length; i++)
        {
            for (int j = i; j < verticies.length; j++)
            {
                graph.addEdge(verticies[i], verticies[j]);
                graph.addEdge(verticies[i], verticies[j]);
                graph.addEdge(verticies[j], verticies[i]);
            }
        }
        
        for (int i = 0; i < verticies.length; i++)
        {
            System.out.println(verticies[i]);
            
            for (int j = i; j < verticies[i].getNeighborCount(); j++)
            {
                System.out.println(verticies[i].getNeighbor(j));
            }
            System.out.println();
        }
        
        // overwrite vertex 3
        graph.addVertex(new Vertex("3"), true);
        for (int i = 0; i < verticies.length; i++)
        {
            System.out.println(verticies[i]);
            
            for (int j = 0; j < verticies[i].getNeighborCount(); j++)
            {
                System.out.println(verticies[i].getNeighbor(j));
            }
            System.out.println();
        }
        System.out.println("Vertex 5: " + graph.getVertex("5")); // null
        System.out.println("Vertex 3: " + graph.getVertex("3")); // vertex 3
        
        System.out.println("Graph containd {1, 2}:" + graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));
        
        System.out.println(graph.removeEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));
        
        System.out.println("Graph contains {1, 2} : " + graph.containsEdge(new Edge(graph.getVertex("1"),graph.getVertex("2"))));
       
        System.out.println("Graph contains {2, 3} : " + graph.containsEdge(new Edge(graph.getVertex("2"),graph.getVertex("3") )));
        
        System.out.println(graph.containsVertex(new Vertex("1"))); // true
        System.out.println(graph.containsVertex(new Vertex("3"))); // false
        System.out.println(graph.removeVertex("2")); // vertex 2
        System.out.println(graph.vertexKeys()); // [3,1,0,4]
        
    }
}
