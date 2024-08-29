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

    // Method to print the linked list
    void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to add a new node at the end for demonstration purposes
    void append(int newData)
    {
        Node newNode = new Node(newData);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null)
        {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to add a node at a specific position
    void insertAtPosition(int position, int newData)
    {
        if (position < 0) throw new IndexOutOfBoundsException("Invalid position");

        Node newNode = new Node(newData);

        if (position == 0)
        { 
            // Insert at the head

            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++)
        {
            if (current == null || current.next == null && i < position - 2)
                throw new IndexOutOfBoundsException("Position out of bounds");
            
            current = current.next;
        }

        if (current == null)
            throw new IndexOutOfBoundsException("Position out of bounds");

        newNode.next = current.next;
        current.next = newNode;
    }
}

public class Insertion
{
    public static void main(String[] args)
    {
        // Create and populate the linked list
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Current Linked List:");
        list.printList();

        // Insert a node at position 2 with value 99
        int positionToInsert = 2; 
        int valueToInsert=99; 
         
        System.out.println("\nInserting " + valueToInsert + " at position " + positionToInsert);
         
        try
        {
            list.insertAtPosition(positionToInsert, valueToInsert);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\nModified Linked List:");
        list.printList();
    }
}
