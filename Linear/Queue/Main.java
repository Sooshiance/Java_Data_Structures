package Queue;

public class Main<T>
{
    private Node<T> front;
    private Node<T> rear;
    private int size;
    
    private static class Node<T>
    {
        private T data;
        private Node<T> next;
        
        public Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public Main()
    {
    this.front = null;
    this.rear = null;
    this.size = 0;
    }
    
    public void enqueue(T data)
    {
        Node<T> newNode = new Node<>(data);
        if (rear == null)
        {
            front = rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    public T dequeue()
    {
        if (front == null)
        {
            throw new IllegalStateException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null)
        {
            rear = null;
        }
        size--;
        return data;
    }
    
    public T peek()
    {
        if (front == null)
        {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }
    
    public boolean isEmpty()
    {
        return front == null;
    }
    
    public int size()
    {
        return size;
    }
    
    public static void main(String[] args)
    {
        Main<Integer> queue = new Main<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Queue size is: " + queue.size());
    }
}