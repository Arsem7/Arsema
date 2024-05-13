package Number2;

public class stackArray {
    int top = -1;
    int size = 10;
    int[] array = new int[size];
    public static void main(String[] args) {
        stackArray stack = new stackArray();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        System.out.println(stack.check());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.check());

    }
    int check() {return top;}
    void push(int data) {
        if (isFull())
            System.out.println("The stack is full");
        array[++top] = data;
    }
    int peek() {
        return array[top];
    }
    int pop() {
        if (isEmpty())
            System.out.println("Stack is empty, you can add.");
        int popped = array[top];
        array[top--] = 0;
        return popped;
    }
    boolean isFull() {
        return top == size-1;
    }
    boolean isEmpty(){
        return top == -1;
    }


}

