package Todo;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("Finish project report", "Complete the project report by Friday");
        toDoList.addToDo(task1);

        Task task2 = new Task("cleaning", "mop the floor and help cleaning the bedroom");
        toDoList.addToDo(task2);

        Task task3 = new Task("Call my mother", "Call her and ask how she is doing");
        toDoList.addToDo(task3);

        toDoList.viewToDoList();
        toDoList.markToDoAsCompleted("cleaning");
        toDoList.viewToDoList();
    }
}