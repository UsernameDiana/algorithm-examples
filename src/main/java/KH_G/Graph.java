package KH_G;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kristin
 * 
 * This class models a simple, undirected graph using an incidence list representation. 
 * Vertices are identified uniquely by their labels, and only unique vertices are allowed.
 * At most one Edge per vertex pair, is allowed in this Graph.
 * 
 * Note that the Graph is designed to manage the Edges. You
 * should not attempt to manually add Edges yourself.
 */
public class Graph 
{
    private HashMap<String, Vertex> verticies;
    private HashMap<Integer, Edge> edges;
    
    
    public Graph()
    {
        this.verticies = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
    }
    // This constructor accepts an ArrayList<Vertex> and populates
    // this.vertices. If multiple Vertex objects have the same label,
    // then the last Vertex with the given label is used.
    // @param vertices The initial Vertices to populate this Graph
    public Graph(ArrayList<Vertex> verticies)
    {
       this.verticies = new HashMap<String, Vertex>(); 
       this.edges = new HashMap<Integer, Edge>(); 
       
       for (Vertex v: verticies)
       {
           this.verticies.put(v.getLabel(), v);
       }
    }
       
    //This method adds am edge between Vertices one and two
    //of weight 1, if no Edge between these Vertices already exists in the Graph
    //return true iff no Edge relating one and two exists in the Graph
    public boolean addEdge(Vertex one, Vertex two)
    {
        return addEdge(one, two, 1);
    }
    
    // Accepts two vertices and a weight, and adds the edge
    //({one, two}, weight) iff no Edge relating one and two exists in the Graph.
    //The first Vertex of the Edge
    //The second Vertex of the Edge
    //weight The weight of the Edge
    //return true iff no Edge already exists in the Graph
    public boolean addEdge(Vertex one, Vertex two, int weight)
    {
        if (one.equals(two))
        {
            return false;
        }
        // ensures the Edge is not in the Graph
        Edge e = new Edge(one, two, weight);
        if (edges.containsKey(e.hashCode()))
        {
            return false;
        }
        
        // and that Edge isn't already incedent/an occurance to one of the Veretecies
        else if (one.containsNeightbor(e) || two.containsNeightbor(e))
        {
            return false;
        }
        
        edges.put(e.hashCode(), e);
        one.addNeighbor(e);
        two.addNeighbor(e);
        return true;
    }
    
    public boolean containsEdge(Edge e)
    {
        if (e.getOne() == null || e.getTwo() == null)
        {
            return false;
        }
    
        return this.edges.containsKey(e.hashCode());
    }
    
    public Edge removeEdge(Edge e)
    {
        e.getOne().removeNeighbor(e);
        e.getTwo().removeNeighbor(e);
        return this.edges.remove(e.hashCode());
    }    
    
    public boolean containsVertex(Vertex vertex)
    {
       return this.verticies.get(vertex.getLabel()) != null;
    }

   
    public Vertex getVertex(String label)
    {
        return verticies.get(label);
    }
    
    //This method adds a Vertex to the graph. If a Vertex with the same label
    //as the parameter exists in the Graph, the existing Vertex is overwritten
    //only if overwriteExisting is true. If the existing Vertex is overwritten,
    //the Edges incident to it are all removed from the Graph.
    public boolean addVertex(Vertex vertex, boolean overwriteExisting)
    {
        Vertex current = this.verticies.get(vertex.getLabel());
        if (current != null)
        {
            if (!overwriteExisting)
            {
                return false;
            }
            while (current.getNeighborCount() > 0)
            {
                this.removeEdge(current.getNeighbor(0));
            }
        }
        verticies.put(vertex.getLabel(), vertex);
        return true;
    }
    
    public Vertex removeVertex(String label)
    {
        Vertex v = verticies.remove(label);
        
        while (v.getNeighborCount() > 0)
        {
            this.removeEdge(v.getNeighbor(0));
        }
        return v;
    }
    
    public Set<String> vertexKeys()
    {
        return this.verticies.keySet();
    }

    public Set<Edge> getEdges()
    {
        return new HashSet<Edge>(this.edges.values());
    }
       
}
