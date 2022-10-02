package com.ualr.simpletasklist.model;
import java.util.HashMap;
import java.util.Map;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    private final Map<Integer, Task> taskList;

    public TaskList(){
        taskList = new HashMap<>();
    }

    // TODO 04. Define the class constructor and the corresponding getters and setters.

    public String getKeyDesc(Integer id)
    {
        Task retrieved = this.taskList.get(id);
        return retrieved.getTaskDesc();
    }

    public String getTaskDone(Integer id)
    {
        Task status = this.taskList.get(id);
        return status.getTaskDone();

    }
    public void setTaskDone(Integer id)
    {

        Integer key = id;
        Task change = this.taskList.get(id);
        change.setTaskDone("Done");

    }
    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    public void add(String taskDesc) {
        Task newTask = new Task(taskDesc);
        Integer key = taskList.size() + 1;
        this.taskList.put(key, newTask);
    }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    public String toString() {
        String formatted = "";
        String status;
        Integer i =  this.taskList.size();
        while(i != 0)
        {
            status  = this.getTaskDone(i);
            formatted += i.toString() + "-" + this.getKeyDesc(i) + "             " + status + "“\n”";
            //This makes the comments from above and the \n makes it a new line, or else all of our
            //formatted lines would be all on one line
            i--;
        }
        return formatted;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    public void delete (String taskID){
        int intTaskID;
        //We need to set the int and convert our string of task to an int
        //This is done via catch: https://stackoverflow.com/questions/2709253/converting-a-string-to-an-integer-on-android
        try {
            intTaskID = Integer.parseInt(taskID);
        }
        catch (NumberFormatException exception){
            intTaskID = 0;
            //Just incase theres 0 tasks, no need to run if 0
        }
        this.taskList.remove(intTaskID);
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

    public void markDone(Integer taskID){
        this.setTaskDone(taskID);
    }
}
