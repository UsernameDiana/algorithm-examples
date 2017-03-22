package graphs;

import java.util.Collection;

public class LinkedGraph<D, W> implements Graph<D, W> {

    @Override
    public void addVertex(D... data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean directed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //adj[i].add(j);
    }

    @Override
    public Vertex<D, W> vertexOf(D data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Vertex<D, W>> getVertices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Edge<D, W>> getEdges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
