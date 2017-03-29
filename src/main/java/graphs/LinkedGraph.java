package graphs;

import java.util.Collection;

public class LinkedGraph<D, W> implements Graph<D, W> {

    private int myVertices;
    private int myEdges;

    @Override
    public void addVertex(D... data) {

    }

    @Override
    public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean directed) {

    }

    @Override
    public Vertex<D, W> vertexOf(D data) {
        return null;
    }

    @Override
    public Collection<Vertex<D, W>> getVertices() {
        return null;
    }

    @Override
    public Collection<Edge<D, W>> getEdges() {
        return null;
    }

    @Override
    public Collection<Edge<D, W>> getEdgesFrom(Vertex<D, W> vertex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
