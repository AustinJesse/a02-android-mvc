package com.ualr.simpletasklist.model;

import java.util.HashMap;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    // TODO 02. Define the class constructor and the corresponding getters and setters.

    private Boolean taskDone;
    //We could have used a string but since the task is either done or it isnt a boolean saves space
    private String taskDescription;

    public Task(String taskDescription, Boolean taskDone) {
        this.taskDescription = taskDescription;
        this.taskDone = taskDone;
    }
    //Setting up the call to this function through task
    //Below are just setters and getters for our variables
    public Boolean getTaskDone() {
        return taskDone;
    }

    public void setTaskDone(Boolean taskDone) {
        this.taskDone = taskDone;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    //We can get, set and assign values from Task now!

}
