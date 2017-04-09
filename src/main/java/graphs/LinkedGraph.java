package graphs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LinkedGraph<D, W> implements IGraph<D, W> {

    private int myVertices;
    private int myEdges;
    private Map vertexMap = new HashMap();

    public LinkedGraph(int myVertices, int myEdges) {
        this.myVertices = myVertices;
        this.myEdges = myEdges;
    }

    @Override
    public void addVertex(D... data) {
     Vertex v;
    }

    @Override
    public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean directed) {

    }

    @Override
    public Vertex<D, W> vertexOf(D data) {
        LinkedVertex v = (LinkedVertex) vertexMap.get(data);
        if (v == null) {
            v = new LinkedVertex();
            vertexMap.put(data, v);
        }
        return v;
    }

    @Override
    public Collection<Vertex<D, W>> getVertices() {
        return null;
    }

    @Override
    public Collection<Edge<D, W>> getEdges() {
        return null;
    }

    public Collection<Edge<D, W>> getEdgesFrom(Vertex<D, W> vertex) {
        return null;
    }

}
