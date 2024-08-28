package Linked_List;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

public class Add_Node {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding nodes to the linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        
        // Displaying the linked list
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            System.out.println();
            current = current.next;
        }
    }
}
