public class main {

    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(5);
        stack.push(6);
        stack.push(2);

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.peek());
        stack.display();
    }
}