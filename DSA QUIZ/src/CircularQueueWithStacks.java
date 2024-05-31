import java.util.Stack;
public class CircularQueueWithStacks {
    private Stack<Integer>   stack1;
    private Stack<Integer>  stack2;
     public CircularQueueWithStacks() {
        stack1 =  new Stack< >( );
        stack2 = new Stack< >( );
    }
    public void enqueue(int item) {
        stack1.push(item);
    }
    public int dequeue( ) {
        if (isEmpty( )) {
            System.out.println("Queue is empty so it cannot remove.");
            return -1;
        }
        if (stack2.isEmpty( )) {
            while (!stack1.isEmpty( )) {
                stack2.push(stack1.pop( ));
            }
        }
        return stack2.pop( );
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        CircularQueueWithStacks circle = new CircularQueueWithStacks( );
        circle.enqueue(101);
        circle.enqueue(202);
        circle.enqueue(303);
        System.out.println("Dequeue element is: " + circle.dequeue( ));
        System.out.println("Dequeue element is: " + circle.dequeue( ));
        System.out.println("Dequeue element is: " + circle.dequeue( ));
        System.out.println("Dequeue element is: " + circle.dequeue( ));
    }
}

