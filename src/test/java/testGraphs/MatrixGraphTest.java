package testGraphs;

import graphs.MatrixGraph;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import graphs.IGraph;

public class MatrixGraphTest {
  
  @Test
  public void testCreateEmptyGraph() {
    IGraph<String,Integer> graph = new MatrixGraph<>();
    assertTrue(graph.getEdges().isEmpty());
    assertTrue(graph.getVertices().isEmpty());
    }
  
  @Test
  public void testCreateSimpleGraph() {
    IGraph<String,Integer> graph = new MatrixGraph<>("Anders", "Bente");
    assertThat(graph.getEdges().size(), is(0));
    assertThat(graph.getVertices().size(), is(2));
    }
  
  @Test
  public void testCreateSimpleConnectedGraph() {
    IGraph<String,Integer> graph = new MatrixGraph<>("Anders", "Bente");
    graph.addEdge(1, "Anders", "Bente", true);
    assertThat(graph.getEdges().size(), is(2));
    assertThat(graph.getVertices().size(), is(2));
    }
  

  }
