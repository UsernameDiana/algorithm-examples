package utils;


/**
 * 
 * 
 * @author AKA
 */
public class Stopwatch implements AutoCloseable {
  private long millis = System.currentTimeMillis();

  @Override
  public void close() {
    millis = System.currentTimeMillis() - millis;
    System.out.printf("Elapsed time: %5.2f\n", millis/1000.0);
    }
  
  }
