package graphs;

import graphs.Graph.Edge;
import graphs.Graph.Vertex;
import java.util.Collection;

public class LinkedVertex<D,W> implements Vertex<D,W> {
    D data;
    Collection <Edge<D,W>> edges;

    @Override
    public D getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Edge<D, W>> getAdjacentEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
