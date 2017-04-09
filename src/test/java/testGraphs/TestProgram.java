package testGraphs;

import graphs.SearchGraphs;
import graphs.MatrixGraph;
import graphs.RootedTree;
import graphs.IGraph;

public class TestProgram {

    public static void main(String[] args) {
        IGraph<String, Integer> friends = new MatrixGraph<>(
                "Jonnas",
                "Lily",
                "Carol",
                "Adam",
                "Phillip",
                "Mark",
                "Laura",
                "Peter",
                "Jack",
                "Jacob",
                "Emma",
                "Emil",
                "Mathias",
                "Mikkel"
        );
        friends.addEdge(1, "Lily", "Jack", true);
        friends.addEdge(1, "Peter", "Jack", true);
        friends.addEdge(1, "Emil", "Jack", true);
        friends.addEdge(1, "Carol", "Jack", true);
        friends.addEdge(1, "Mathias", "Jack", true);
        friends.addEdge(1, "Jacob", "Jack", true);
        friends.addEdge(1, "Carol", "Adam", true);
        friends.addEdge(1, "Carol", "Jonnas", true);
        friends.addEdge(1, "Carol", "Laura", true);
        friends.addEdge(1, "Jacob", "Laura", true);
        friends.addEdge(1, "Jacob", "Emma", true);
        friends.addEdge(1, "Jacob", "Mikkel", true);
        friends.addEdge(1, "Jacob", "Mathias", true);
        friends.addEdge(1, "Emma", "Laura", true);
        friends.addEdge(1, "Jonnas", "Adam", true);
        friends.addEdge(1, "Phillip", "Adam", true);
        friends.addEdge(1, "Phillip", "Mark", true);
        friends.addEdge(1, "Mikkel", "Mark", true);

        friends.print(System.out);

        System.out.println("=====================");

        RootedTree<String, Integer> dft = SearchGraphs.depthFirst(friends, friends.vertexOf("Jack"));

        dft.print(System.out);

    }
}
