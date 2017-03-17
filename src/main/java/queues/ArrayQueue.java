package queues;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue using a fixed, non-expandable array whose
 * capacity is set in its constructor.
 * @author mbeg
  
 */
public class ArrayQueue<T> implements Queue<T> {
    private final T[] items;
    private int size = 0;
    private int head = 0; // index of the current front item, if one exists
    private int tail = 0; // index of next item to be added

    public ArrayQueue(int capacity) {
      items = (T[])new Object[capacity];
      }

    public void enqueue(T item) {
      if (size == items.length)
          throw new IllegalStateException("Cannot add to full queue");
      items[tail] = item;
      tail = (tail + 1) % items.length;
      size++;
      }

    public T dequeue() {
      if (size == 0)
          throw new NoSuchElementException("Cannot remove from empty queue");
      T item = items[head];
      items[head] = null;
      head = (head + 1) % items.length;
      size--;
      return item;
      }

    public T peek() {
      if (size == 0)
          throw new NoSuchElementException("Cannot peek into empty queue");
      return items[head];
      }

    public int size() {
      return size;
      }
    
    }