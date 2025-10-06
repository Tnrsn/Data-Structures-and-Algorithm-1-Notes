public class main {

    public static void main(String[] args) {
        
        MyStack stack = new MyStack(4);

        stack.push('T');
        stack.push('a');
        stack.push('n');
        stack.push('e');
        stack.push('r');
        
        
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}