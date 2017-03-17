package graphs;

import graphs.Graph.Edge;
import graphs.Graph.Vertex;

public class LinkedEdge implements Edge<D,W> {
    W weight;
    Vertex<D,W> headVertex;
}
