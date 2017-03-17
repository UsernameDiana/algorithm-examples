package queues;

import java.util.Scanner;

public class HeapTester {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Heap heap = new Heap(100);
    heap.print();
    
    heap.enqueue(33);
    heap.enqueue(45);
    heap.enqueue(10);
    heap.enqueue(17);
    heap.enqueue(7);
    heap.enqueue(4711);
    heap.enqueue(56);
    heap.print();scanner.next();
    
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    System.out.println(heap.dequeue());
    heap.print(); scanner.next();
    
    }
  
  }
