package Linked_List;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;

    public void iterateAndAccessNodes()
    {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Traversal
{

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        // Add nodes to the linked list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        // Iterate through the list and access each node
        list.iterateAndAccessNodes();
    }
}
