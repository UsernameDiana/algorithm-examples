package Graph_Edge_Vertex;

/**
 *
 * @author Kristin
 */
public class Edge implements Comparable<Edge>
{
    private Vertex one, two;
    private int weight;
  
    // The first vertex in the Edge
    // The second vertex in the Edge
    public Edge(Vertex one, Vertex two)
    {
        this.one = one;
        this.two = two;
    }
    
    // one The first vertex in the Edge
    // two The second vertex of the Edge
    // weight The weight of this Edge
    public Edge(Vertex one, Vertex two, int weight)
    {
        this.one = (one.getLabel().compareTo(two.getLabel()) <=0) ? one : two;
        this.two = (this.one== one) ? two : one;
        this.weight = weight;
    }
    
    public Vertex getNeighbor(Vertex current)
    {
        if(!(current.equals(one) || current.equals(two)))
        {
            return null;      
        }
        return (current.equals(one)) ? two : one;
    }
    
    public Vertex getOne()
    {
        return this.one;
    }
    
    public Vertex getTwo()
    {
        return this.two;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Edge other)
    {
        return this.weight - other.weight;
    }
    
    @Override
    public String toString()
    {
        return "({" + one + "," + two + "}," + weight + ")";
    }
    
    @Override
    public int hashCode()
    {
        return (one.getLabel() + two.getLabel()).hashCode();        
    } 
    
    // The Object to compare against this
    // return ture iff other is an Edge with the same Vertices as this
    @Override
    public boolean equals(Object other)
    {
        if(!(other instanceof Edge))
        {
            return false;
        }
        
        Edge e = (Edge)other;
        return e.one.equals(this.one) && e.two.equals(this.two);
    }   
}