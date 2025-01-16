package C02.S03_ArrayStack;

public class App {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();
        // stack.peek(); // underflow Test를 위한 code
        stack.push("apple");
        stack.push("orange");
        stack.push("cherry");
        System.out.println(stack.peek());
        stack.push("pear");
        stack.print();
        stack.pop();
        System.out.println(stack.peek());
        stack.push("grape");
        stack.print();
    }

}
