package graphs;

import graphs.IGraph.Edge;
import graphs.IGraph.Vertex;

public class LinkedEdge<D,W> implements Edge<D,W> {
    // weight represents DISTANCE/LENGHTH is given to edges assosiating a number with the
    // connection between the two Vertices
    W weight;
    Vertex<D,W> headVertex;

    @Override
    public W getWeight() {
        return this.weight;
    }

    @Override
    public Vertex<D, W> getHeadVertex() {
        return headVertex;
    }
}