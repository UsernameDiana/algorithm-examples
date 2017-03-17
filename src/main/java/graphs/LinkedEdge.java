package graphs;

import graphs.Graph.Edge;
import graphs.Graph.Vertex;

public class LinkedEdge<D,W> implements Edge<D,W> {
    W weight;
    Vertex<D,W> headVertex;

    @Override
    public W getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vertex<D, W> getHeadVertex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
