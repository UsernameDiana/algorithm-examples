package graphs;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleRootedTree<D,W> implements RootedTree<D, W>{
  private final Graph<D,W> graph;
  private final Vertex<D,W> root;
  private final Set<Edge<D,W>> edges = new HashSet<>();

  public SimpleRootedTree(Graph<D,W> graph, Vertex<D,W> root) {
    this.graph = graph;
    this.root = root;
    }

  @Override
  public Vertex<D, W> getRoot() {
    return root;
    }

  @Override
  public void add(Edge<D, W> edge) {
    edges.add(edge);
    }

  @Override
  public void addVertex(D... data) {
    throw new UnsupportedOperationException("You can't modify the underlying graph");
    }

  @Override
  public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean undirected) {
    throw new UnsupportedOperationException("You can't modify the underlying graph");
    }

  @Override
  public Vertex<D, W> vertexOf(D data) {
    return graph.vertexOf(data);
    }

  @Override
  public Collection<Vertex<D, W>> getVertices() {
    return graph.getVertices();
    }

  @Override
  public Collection<Edge<D, W>> getEdges() {
    return edges;
    }

  public Collection<Edge<D, W>> getEdgesFrom(Vertex<D, W> vertex) {
    // This piece of code simply filters away edges
    // that is not in the edges set.
    // Unfortunately Java has to convert to stream, and back to set.
    return graph.getEdges().stream()
        .filter(e -> edges.contains(e))
        .collect(Collectors.toSet());
    }

  /**
   * This method will result in a stack overflow if contract is not kept and 
   * the tree contains cycles.
   * @param out The stream to print on
   */
  @Override
  public void print(PrintStream out) {
    print(out, "", root);
    }
  
  private void print(PrintStream out, String indent, Vertex<D,W> vertex) {
    out.println(indent+vertex.getData());
    for (Edge<D,W> edge : getEdgesFrom(vertex))
        print(out, indent+"  ", edge.getHeadVertex());
    }
  
  }