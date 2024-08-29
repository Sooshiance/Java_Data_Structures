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

public class Searching
{
    Node head;

    // Method to add a new node at the end of the list
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

    // Method to display the linked list
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

    // Method to find a node with a specific value
    public boolean find_value(int value)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == value)
            {
                return true; // Value found
            }
            current = current.next;
        }
        return false; // Value not found
    }

    // main method
    public static void main(String[] args)
    {
        Searching search_obj = new Searching();
        
        // Adding elements to the linked list
        search_obj.add(1);
        search_obj.add(2);
        search_obj.add(3);
        
        // Displaying the original linked list
        System.out.println("Original Linked List:");
        search_obj.display();
        
        // Finding a node with specific value
        int searchValue = 2; 

        System.out.println("Finding value " + searchValue + " in the Linked List:");

        boolean isFound = search_obj.find_value(searchValue);

        if(isFound)
        {
          System.out.println("Value " + searchValue + " found in the Linked List.");
        }
        else
        {
          System.out.println("Value " + searchValue + " not found in the Linked List.");
        }
      
        // Displaying the modified linked list (unchanged)
        System.out.println("Modified Linked List:");
        search_obj.display();
   }
}
