package airports;

import java.io.IOException;
import utils.FileUtility;

public class Reader 
{
    public static void main(String[] args) throws IOException 
    {
        String[] words = FileUtility.toStringArray("src\\main\\java\\airports\\airports.txt", "[^A-Za-z]");

        for (String word:words)
        {
            if (word.equals("airport"))
            {
                System.out.println(word);
        
            }
        }
    }

}
