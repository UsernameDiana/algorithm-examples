package graphs;

public interface RootedTree<D, W> extends Graph<D, W> {

    Vertex<D, W> getRoot();

    void add(Edge<D, W> edge);
}
