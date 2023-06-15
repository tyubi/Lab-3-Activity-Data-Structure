public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // this is the constructor part
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        // empty stack
        top = -1;
    }

    public void push(int value) { // Add an element
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    public void pop() { // Remove an element
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
        }
    }

    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}