package graphs;

import graphs.Graph.Edge;
import graphs.Graph.Vertex;
import java.util.Collection;

public class LinkedVertex implements Vertex<D,W> {
    D data;
    Collection <Edge<D,W>> edges;
    
}
