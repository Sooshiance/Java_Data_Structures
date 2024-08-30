package Stack;

public class Main
{
    public static void main(String[] args)
    {
        Operations stack = new Operations(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Top element after pop is: " + stack.peek());
    }
}