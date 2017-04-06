package KH_G;

import java.util.ArrayList;

/**
 *
 * @author Kristin
 */
public class Vertex 
{
    private ArrayList<Edge> neighborhood;
    private String label;
    
    // unique lable assosiated with this vertex
    public Vertex(String label)
    {
        this.label = label;
        this.neighborhood = new ArrayList<Edge>();
    }
    
    // adds an Edge to the occurance neighborhood of this graph if the edge is not precent
    public void addNeighbor(Edge edge)
    {
        if (this.neighborhood.contains(edge))
        {
            return;
        }
        this.neighborhood.add(edge);
    }
    
    // The edge for which to search
    public boolean containsNeightbor(Edge other)
    {
        return this.neighborhood.contains(other);
    }
    
    // The index of the edge to retreve 
    public Edge getNeighbor(int index)
    {
        return this.neighborhood.get(index);
    }
    
    // the index of the edge to remove from this.neighborhood

    Edge removeNeighbor(int index)
    {   
        return this.neighborhood.remove(index);
    }
    
    // the edge to remove
    public void removeNeighbor(Edge e)
    {
        this.neighborhood.remove(e);
    }
    
    public int getNeighborCount()
    {
        return this.neighborhood.size();
    }

    public ArrayList<Edge> getNeighborhood() {
        return neighborhood;
    }
    
    public String getLabel()
    {
        return this.label;
    }
    
    @Override
    public String toString()
    {
        return "Vertex " + label;
    }
    
    // the hashcode og this vertex's label
    @Override
    public int hashCode()
    {
        return this.label.hashCode();
    }
    
    //  @param other The object to compare
    // @return true iff other instanceof Vertex and the two Vertex objects have the same label
    @Override
    public boolean equals(Object other)
    {
        if(!(other instanceof Vertex))
        {
            return false;
        }
        Vertex v =(Vertex)other;
        return this.label.equals(v.label);
    }  
}
