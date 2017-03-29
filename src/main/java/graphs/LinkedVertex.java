package graphs;

import graphs.Graph.Edge;
import graphs.Graph.Vertex;
import java.util.Collection;

public class LinkedVertex<D,W> implements Vertex<D,W> {
    D data;
    Collection <Edge<D,W>> edges; // adjacent

    @Override
    public D getData() {
        return this.data;
    }

    @Override
    public Collection<Edge<D, W>> getAdjacentEdges() {
    // returns Collection with the adjacent Edges
        return null;
    }
    
}
