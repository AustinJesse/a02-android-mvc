package com.ualr.simpletasklist.model;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import android.widget.TextView;
import com.ualr.simpletasklist.model.Task;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    private HashMap<Integer, Task> listTasks = new HashMap<Integer, Task>();
    //This just adds onto the hashmap and makes a new one that we can use

    public TaskList(){

        this.listTasks = new HashMap<>();
    }

    // TODO 04. Define the class constructor and the corresponding getters and setters.

    public HashMap<Integer, Task> getTasks(){
        return listTasks;
    }
    //We are using Mashmap as our function variable type and all it does is
    //that it returns what our task list holds currently, the HashMap

    public void setTasks(HashMap<Integer, Task> listTasks){
        this.listTasks = listTasks;
    }
    //We use void as it is not meant to return any values, just assign whatever
    //Hashmap we passed in and put it into our list of tasks

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    public void add(Integer taskId, String taskDescription, Boolean isTaskDone) {
        Integer key = listTasks.size() + 1;
        listTasks.put(key, new Task(taskDescription,isTaskDone));
    }
    //We pass in the taskDescription and whether or not the task is done
    //We use the size of our list to add a new task onto the backend
    //Then we use .put to assign a new task in our HashMap at the next slot in our list
    //And we use the Task constructor to make the certain Task
    //As reference I used https://learn.microsoft.com/en-us/dotnet/api/android.content.contentvalues.put?view=xamarin-android-sdk-12
    //It goes over different puts, had to change how I coded the put a bit but it is a good resource
    //Initially this code was split off into two parts but as a test I had to use put
    //So instead of making a new task in one line and using the key ID and using that Task
    //It is just used all in one line, also fixed whatever error I was having with not being able to add
    //onto the list. Took some time to find this and code it but it was worth it

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    public String toString() {
        Iterator<Map.Entry<Integer, Task>> i = listTasks.entrySet().iterator();
        String formatted = "";
        for (HashMap.Entry<Integer,Task> e : listTasks.entrySet()){
            StringBuilder formattedString = new StringBuilder();
            if(e.getValue().getTaskDone() == true){
                formatted = formatted.concat("\n" + e.getKey() + "-" + ((Task)e.getValue()).getTaskDescription() + " Done");
            }
            else if (e.getValue().getTaskDone() == false){
                formatted = formatted.concat("\n" + e.getKey() + "-" + ((Task)e.getValue()).getTaskDescription());
            }
        }
        return formatted;
    }

    //For the iterator we have to use the map as this holds all of our values
    //Before I looked up how to iterate over a map I just used size which gave me some errors
    //The entry set is also able to go over a whole map which is what gives us the iterator itself
    //All websites I used will be down below
    //https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
    //https://developer.android.com/reference/java/util/Map#entrySet()
    //https://stackoverflow.com/questions/18740501/combine-multiple-strings-into-one-java



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
        this.listTasks.remove(intTaskID);
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

    public void markDone(Integer taskID){
        Boolean taskDone = true;
        listTasks.get(taskID).setTaskDone(taskDone);
    }
}
