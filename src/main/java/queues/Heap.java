package queues;

import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Heap {
  private final Integer[] data;
  private int size = 0;
  
  public Heap(int capacity) {
    data = new Integer[capacity];
    }
  
  private static int parentOf(int n) { return n/2; }
  
  private static int leftOf(int n) { return 2*n; }
  
  private static int rightOf(int n) { return 2*n + 1; }
  
  private void swap(int n, int m) {
    data[0] = data[n];
    data[n] = data[m];
    data[m] = data[0];
    }
  
  public void enqueue(Integer item) {
    int n = ++size;
    data[n] = item;
    do {
      int p = parentOf(n);
      if (p == 0 || item.compareTo(data[p]) > 0) return; 
      swap(n, p);
      n = p;
      }
    while (true);
    }
  
  public Integer dequeue() {
    if (size == 0) throw new NoSuchElementException();
    Integer result = data[1];
    swap(1, size--);
    
    int n = 1;
    int c = 0;

    do {
      int l = leftOf(n);
      int r = rightOf(n);
      if (l > size) return result;

      if (r > size) c = l;
      else if (data[l].compareTo(data[r]) < 0) c = l;
      else c = r;

      if (data[n].compareTo(data[c]) > 0) {
        swap(n, c);
        n = c;
        }
      else return result;
      }
    while (true);
    }
  
  public int size() { return size; }
  
  
  private void print(PrintStream out, int n, String indent) {
    if (n > size) return;
    print(out, rightOf(n), indent+"    ");
    out.println(indent+"("+data[n]+") - "+n);
    print(out, leftOf(n), indent+"    ");
    }
  
  public void print() {
    print(System.out, 1, "");
    }
  
  }
