package Set;

import java.util.Arrays;

public class CustomSet
{
    private int[] elements;
    private int size;

    public CustomSet()
    {
        elements = new int[10];
        size = 0;
    }

    public void add(int element)
    {
        if (!contains(element))
        {
            if (size == elements.length)
            {
                elements = Arrays.copyOf(elements, size * 2);
            }
            elements[size++] = element;
        }
    }

    public boolean contains(int element)
    {
        for (int i = 0; i < size; i++)
        {
            if (elements[i] == element)
            {
            return true;
            }
        }
        return false;
    }

    public void remove(int element)
    {
        for (int i = 0; i < size; i++)
        {
            if (elements[i] == element)
            {
                elements[i] = elements[size - 1];
                size--;
                return;
            }
        }
    }

    public int size()
    {
        return size;
    }

    public void clear()
    {
        size = 0;
    }

    public static void main(String[] args)
    {
    CustomSet set = new CustomSet();
    set.add(1);
    set.add(2);
    set.add(3);
    System.out.println("Set contains 2: " + set.contains(2));
    set.remove(2);
    System.out.println("Set contains 2: " + set.contains(2));
    System.out.println("Set size: " + set.size());
    }
}