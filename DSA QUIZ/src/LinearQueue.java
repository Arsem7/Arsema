public class LinearQueue {
    int SIZE = 5;
    int items[ ] = new int[SIZE];
    int front, rear;

    public LinearQueue( ) {
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }
    boolean isEmpty( ) {
        return front == -1;
    }
    void enQueue(int element) {
        if (isFull( )) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Inserted element is: " + element);
        }
    }
    int deQueue( ) {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted element is: " + element);
            return element;
        }
    }

    void display( ) {
        if (isEmpty( )) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front index is -> " + front);
            System.out.print("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("Rear index is -> " + rear);
        }
    }
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue();
        for (int i = 1; i < 7; i++) {
            q.enQueue(i);
        }
        q.enQueue(6);
        q.display( );
        q.deQueue( );
        q.display( );
    }
}
