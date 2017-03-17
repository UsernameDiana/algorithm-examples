package queues;

public interface Stack<T> {
  void push(T item);
  T pop();
  T peek();
  int size();
  default boolean isEmpty() { return size() == 0; }
  }
