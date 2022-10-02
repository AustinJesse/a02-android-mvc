package com.ualr.simpletasklist.model;
import java.util.HashMap;
import java.util.Map;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    HashMap<Integer, Task> taskList;

    public TaskList(){
        taskList = new HashMap<>();
    }

    // TODO 04. Define the class constructor and the corresponding getters and setters.

    public String getKeyDescription(Integer id)
    {
        Task retrieved = this.taskList.get(id);
        return retrieved.getTaskDescription();
    }

    public String getTaskStatus(Integer id)
    {
        Task status = this.taskList.get(id);
        return status.getTaskStatus();

    }
    public void setTaskStatus(Integer id)
    {

        Integer key =id;
        Task change = this.taskList.get(id);
        change.setTaskStatus("Finished");

    }
    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

}
