package queues;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue using singly linked nodes. 
 * The queue itself maintains links to both the head and the tail
 * node, so that both enqueuing and dequeuing are O(1).
 */
public class LinkedQueue<T> implements Queue<T> {
    
  private class Node {
    T data;
    Node next;
    Node(T data, Node next) {
      this.data = data;
      this.next = next;
      }
    }

  private Node head = null;
  private Node tail = null;

  public void enqueue(T item) {
    Node node = new Node(item, null);
    if (isEmpty()) head = node;
    else tail.next = node;
    tail = node;
    }

  public T dequeue() {
    if (isEmpty()) throw new NoSuchElementException();
    T item = head.data;
    if (tail == head) tail = null;
    head = head.next;
    return item;
    }

  public T peek() {
    if (head == null) throw new NoSuchElementException();
    return head.data;
    }

  public boolean isEmpty() {
    return head == null;
    }

  public int size() {
    int size = 0;
    for (Node n = head; n != null; n = n.next) size++;
    return size;
    }

  }