package memento;

public class TaskManager {
    public static void main(String[] args) {
        Task task = new Task("design homepage", "not started");
        TaskHistory history = new TaskHistory();

        history.save(task);

        System.out.println("Initial state: "+task);

        task.setStatus("In progress");
        history.save(task);
        System.out.println("Updated state: "+task.getStatus());

        task.setStatus("Completed");
        history.save(task);
        System.out.println("Completed state: "+task.getStatus());

        history.undo(task);
        history.save(task);
        System.out.println("Current state: "+task.getStatus());
        history.undo(task);
        history.save(task);
        System.out.println("Current state: "+task.getStatus());
    }

}
