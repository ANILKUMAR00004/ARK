public class Stack {
    private int[] stack;
    private int top;
    private int capacity;


    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }


    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }


    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();
        System.out.println("Peek:"+stack.peek());
    }
}
