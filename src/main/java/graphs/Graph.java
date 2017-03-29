package graphs;

import java.io.PrintStream;
import java.util.Collection;

// A graph is a set of vertices and a collection of edges that each connect a pair of vertices.
// GRAPH = VERTEX, EDGE
// G=(V,E)
public interface Graph<D,W> {
  void addVertex(D... data);
  void addEdge(W weight, Vertex<D,W> tail, Vertex<D,W> head, boolean undirected);
  
  default void addEdge(W weight, D tailData, D headData, boolean undirected) {
    addEdge(weight, vertexOf(tailData), vertexOf(headData), undirected);
    }
  
  Vertex<D, W> vertexOf(D data);
  
  Collection<Vertex<D,W>> getVertices();
  Collection<Edge<D,W>> getEdges();
  
  // Implement this method instead of Vertex.getAdjacentEdges()
  Collection<Edge<D,W>> getEdgesFrom(Vertex<D,W> vertex);
  
  default void print(PrintStream out) {
    out.println(toString());
    }
  
  interface Vertex<D,W> {
    D getData();
    
    // Implement this method as a conveinience method
    // using the graps getEdgesFrom(Vertex vertex)
    Collection<Edge<D,W>> getAdjacentEdges();
    }
  
  interface Edge<D,W> {
    W getWeight();
    Vertex<D,W> getHeadVertex();
    }
  
  }