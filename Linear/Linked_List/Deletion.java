package Linked_List;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;

    // Method to add a node at the end of the list
    public void add(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to remove a node by value
    public void remove(int data)
    {
        if (head == null) return;

        if (head.data == data)
        {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data)
        {
            current = current.next;
        }

        if (current.next != null)
        {
            current.next = current.next.next;
        }
    }
}

public class Deletion {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        // Adding nodes to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        
        // Displaying initial linked list
        System.out.println("Initial Linked List:");
        list.display();
        
        // Removing a node with value 2
        list.remove(2);
        
        // Displaying modified linked list
        System.out.println("Modified Linked List:");
        list.display();
    }
}
