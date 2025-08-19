public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int value) {
        if (count == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % capacity;
        count--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void printQueue() {
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();
        System.out.println("Peek:"+queue.peek());
    }
}
