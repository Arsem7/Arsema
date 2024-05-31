package Linked;

public class LinkedLIst {
    Node head;
    public void insertAtPOsition(int input, int position) {
        Node newNode = new Node(input);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currentinput = head;
        int currentPosition = 1;

        while (currentinput != null & currentPosition < position - 1) {
            currentinput= currentinput.next;
            currentPosition++;
        }

        if (currentinput == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = currentinput.next;
        currentinput.next = newNode;
    }
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node currentinput = head;
        int currentPosition = 1;

        while (currentinput != null && currentPosition < position - 1) {
            currentinput = currentinput.next;
            currentPosition++;
        }

        if (currentinput == null || currentinput.next == null) {
            System.out.println("Invalid position");
            return;
        }

        currentinput.next = currentinput.next.next;
    }

    public void deleteAfterNode(int input) {
        if (head == null || head.next == null) {
            System.out.println("List is empty or it has only one node");
            return;
        }

        Node currentinput = head;
        while (currentinput != null && currentinput.input != input) {
            currentinput = currentinput.next;
        }

        if (currentinput == null || currentinput.next == null) {
            System.out.println("Node with value " + input + " not found");
            return;
        }

        currentinput.next = currentinput.next.next;
    }

    public boolean searchNode(int input) {
        Node currentinput = head;
        while (currentinput != null) {
            if (currentinput.input == input) {
                return true;
            }
            currentinput = currentinput.next;
        }
        return false;
    }
}
