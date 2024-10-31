package memento;

public class Task {
    private String description;
    private String status;

    public Task(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskMemento saveState(){
        return new TaskMemento(description, status);
    }

    public void restoreState(TaskMemento memento){
        this.description = memento.getDescription();
        this.status = memento.getStatus();
    }

    @Override
    public String toString() {
        return  "Task: "+description+" "+status;
    }
}
