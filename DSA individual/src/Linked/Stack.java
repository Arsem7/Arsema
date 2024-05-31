package Linked;

public class Stack {
        Node top;

        public void push(int input) {
            Node newNode = new Node(input);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack not full!");
                return -1;
            }
            int data = top.input;
            top = top.next;
            return data;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack not full!");
                return -1;
            }
            return top.input;
        }
    }

