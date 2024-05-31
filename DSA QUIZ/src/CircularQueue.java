public class CircularQueue {
        private final int maxSize;
        private final int[] queueArray;
        private int front;
        private int rear;
        public CircularQueue(int Size) {
            maxSize = Size;
            queueArray = new int[maxSize];
            front = -1;
            rear = -1;
        }
        boolean isFull( ) {
            return (front == 0 && rear == maxSize - 1) || (front == rear + 1);
        }
        boolean isEmpty( ) {
            return front == -1;
        }
        void enqueue(int item) {
            if (isFull( )) {
                System.out.println("Queue is full so it cannot add.");
            }
            else {
                if (front == -1) {
                    front = 0;
                }
                rear = (rear + 1) % maxSize;
                queueArray[rear] = item;
                System.out.println("Enqueued element: " + item);
            }
        }
        int  dequeue( ) {
            int item = -1;
            if (!isEmpty( )) {
                item = queueArray[front];
                if (front == rear) {
                    front = -1;
                    rear = -1;
                } else {
                    front = (front + 1) % maxSize;
                }
                System.out.println("Dequeued element: " + item);
            } else {
                System.out.println("Queue is empty so it cannot remove.");
            }
            return item;
        }
        void display( ) {
            if (isEmpty( )) {
                System.out.println("Queue is empty");
            } else {
                System.out.print("Circular Queue element: ");
                int i = front;
                while (i != rear) {
                    System.out.print(queueArray[i] + " ");
                    i = (i + 1) % maxSize;
                }
                System.out.println(queueArray[rear]);
            }
        }
        public static void main(String[] args) {
            CircularQueue circularQueue = new CircularQueue(5);
            circularQueue.enqueue(11);
            circularQueue.enqueue(22);
            circularQueue.enqueue(33);
            circularQueue.enqueue(44);
            circularQueue.display( );
            circularQueue.dequeue( );
            circularQueue.display( );
        }
}


