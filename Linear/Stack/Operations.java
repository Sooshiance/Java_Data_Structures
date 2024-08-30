package Stack;

public class Operations
{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Operations(int size)
    {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value)
    {
        if (isFull())
        {
            System.out.println("Stack is full. Cannot push " + value);
        } 
        else
        {
            stackArray[++top] = value;
        }
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }
        else
        {
            return stackArray[top--];
        }
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }
        else
        {
            return stackArray[top];
        }
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }
}