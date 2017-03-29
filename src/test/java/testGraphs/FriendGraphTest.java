package testGraphs;

//import static co.unruly.matchers.StreamMatchers.allMatch;
//import static org.hamcrest.CoreMatchers.anyOf;
import graphs.Graph;
import graphs.MatrixGraph;
import java.util.stream.Collectors;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class FriendGraphTest {

    private Graph<String, Integer> friends;

    @Before
    public void setup() {
        friends = new MatrixGraph<>(
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
        //friends.addEdge(2, "Lily", "Carol", false);
        //friends.print(System.out);
    }

    @Test
    public void testAdamsFriends() {
        Graph.Vertex<String, Integer> adam = friends.vertexOf("Adam");
        assertThat(adam.getAdjacentEdges().size(), is(3));
//    assertThat(
//        adam.getAdjacentEdges().stream()
//            .map(e -> e.getHeadVertex().getData()), 
//        allMatch(anyOf(is("Jonnas"),is("Carol"),is("Phillip")))
//        );
        assertThat(
                adam.getAdjacentEdges().stream()
                        .map(e -> e.getHeadVertex().getData())
                        .collect(Collectors.toList()),
                containsInAnyOrder("Jonnas", "Carol", "Phillip")
        );
//    assertThat(
//        adam.getAdjacentEdges(),
//        containsInAnyOrder(
//            where((Graph.Edge<String,Integer> e) -> e.getHeadVertex().getData().equals("Jonnas")),
//            where((Graph.Edge<String,Integer> e) -> e.getHeadVertex().getData().equals("Carol")),
//            where((Graph.Edge<String,Integer> e) -> e.getHeadVertex().getData().equals("Phillip"))
//            )
//        );
    }
}
