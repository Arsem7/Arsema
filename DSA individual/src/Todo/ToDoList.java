package Todo;

public class ToDoList {
    public Node Head;

    public ToDoList() {
        this.Head = null;
    }

    public void addToDo(Task Task) {
        Node newNode = new Node(Task);
        if (this.Head == null) {
            this.Head = newNode;
        } else {
            Node thisOne = this.Head;
            while (thisOne.next != null) {
                thisOne = thisOne.next;
            }
            thisOne.next = newNode;
        }
    }


    public void markToDoAsCompleted(String Title) {
        Node thisOne = this.Head;
        while (thisOne != null) {
            if (thisOne.task.getTitle().equalsIgnoreCase(Title)) {
                thisOne.task.markCompleted();
                System.out.println("Task '" + Title + "' marked as completed.");
                return;
            }
            thisOne = thisOne.next;
        }
        System.out.println("Task '" + Title + "' not found in the list.");
    }

    public void viewToDoList() {
        Node thisOne = this.Head;
        System.out.println("To-Do List:");
        while (thisOne != null) {
            System.out.println("Title: " + thisOne.task.getTitle());
            System.out.println("Description: " + thisOne.task.getDescription());
            System.out.println("Completed: " + thisOne.task.isCompleted());
            System.out.println();
            thisOne = thisOne.next;
        }
    }
}

