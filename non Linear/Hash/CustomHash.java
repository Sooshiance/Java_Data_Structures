package Hash;

public class CustomHash
{
    private final int SIZE = 1000;
    private Node[] table;

    public CustomHash()
    {
        table = new Node[SIZE];
    }

    public void put(String key, int value)
    {
        int index = getIndex(key);
        Node newNode = new Node(key, value);

        if (table[index] == null)
        {
            table[index] = newNode;
        }
        else
        {
            Node current = table[index];
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int get(String key)
    {
        int index = getIndex(key);
        
        if (table[index] == null)
        {
            return -1; // Key not found
        }
        else
        {
            Node current = table[index];
            while (current != null)
            {
                if (current.key.equals(key))
                {
                    return current.value;
                }
                current = current.next;
            }
            return -1; // Key not found
        }
    }

    private int getIndex(String key)
    {
        return Math.abs(key.hashCode()) % SIZE;
    }

    private class Node
    {
        String key;
        int value;
        Node next;

        public Node(String key, int value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
