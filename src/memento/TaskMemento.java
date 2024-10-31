package memento;

public class TaskMemento {
    private String description;
    private String status;

    public TaskMemento(String description, String status) {
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }


}
