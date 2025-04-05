import java.util.*;
class UsingStack 
{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(40);
        stack.push(60);
        System.out.println("Stack peek value is "+stack.peek());
        System.out.println("Stack popped value is "+stack.pop());
        System.out.println("Stack peeked value is after pop "+stack.peek());
    }
}