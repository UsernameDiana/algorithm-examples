package graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedGraph<D, W> implements IGraph<D, W> {

    List<LinkedVertex> vertices;
    List<LinkedEdge> edges;
    private int myVertices;
    private int myEdges;
    private Map vertexMap = new HashMap();
    int size;

    public LinkedGraph(List<LinkedVertex> vertices, List<LinkedEdge> edges, int myVertices, int myEdges, int size) {
        this.vertices = vertices;
        this.edges = edges;
        this.myVertices = myVertices;
        this.myEdges = myEdges;
        this.size = size;
    }


    @Override
    public void addVertex(D... data) {
        for (D d : data) {
            //Vertex v = new LinkedVertex(d);
            // I am not sure how to finish this
            size++;
        }
    }

    @Override
    public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean directed) {
        
        // TODO
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
        List<Vertex<D, W>> v = new ArrayList();

        // TODO
        return v;
    }

    @Override
    public Collection<Edge<D, W>> getEdges() {
        List<Edge<D, W>> e = new ArrayList();

        // TODO
        return e;
    }

    public Collection<Edge<D, W>> getEdgesFrom(Vertex<D, W> vertex) {
        Collection<Edge<D, W>> adjacentEdges = null; // setting the near edges to null
        if (vertex.getClass() == LinkedVertex.class) { // if vertex eaquals LinkedVertex
            adjacentEdges = ((LinkedVertex) vertex).getAdjacentEdges(); // then near by edges eaquals method .getAdjacentEdges() from LinkedVertex class
        }
        return adjacentEdges;
    }

}
