package searching;

@FunctionalInterface
public interface HashFunction<T> {
  int function(T key);
  }
