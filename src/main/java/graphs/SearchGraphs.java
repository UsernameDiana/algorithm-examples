package graphs;

import graphs.IGraph.Vertex;
import java.util.HashSet;
import java.util.Set;
import queues.LinkedQueue;
import queues.Queue;

/**
 * Utility class for graph related functions.
 */
public class SearchGraphs 
{  
  public static <D,W> RootedTree<D,W> depthFirst(IGraph<D,W> graph, Vertex<D,W> root) 
  {
    Set<Vertex<D,W>> marked = new HashSet<>();
    RootedTree<D,W> edgesTo = new SimpleRootedTree<>(graph, root);
    
    // TODO: implement
    
    return edgesTo;
    }
  
  public static <D,W> RootedTree<D,W> breadthFirst(IGraph<D,W> graph, Vertex<D,W> root) 
  {
    Set<Vertex<D,W>> marked = new HashSet<>();
    Queue<Vertex<D,W>> queue = new LinkedQueue<>();
    RootedTree<D,W> edgesTo = new SimpleRootedTree<>(graph, root);
    
    // TODO: implement

    return edgesTo;
    }

  }

