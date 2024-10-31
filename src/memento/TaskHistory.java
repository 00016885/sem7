package memento;

import java.util.Stack;

public class TaskHistory {
    private Stack<TaskMemento> history = new Stack<>();

    public void save(Task task){
        history.push(task.saveState());
    }

    public void undo(Task task) {
        if (history.size()>1) {
            history.pop();
            task.restoreState(history.pop());
        }else {
            System.out.println("No states to undo");
        }


    }
}
