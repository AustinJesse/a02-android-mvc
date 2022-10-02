package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    // TODO 02. Define the class constructor and the corresponding getters and setters.

    private String taskDone = "";
    private String taskDescription;

    public String getTaskDone() {
        return taskDone;
    }

    public void setTaskDone(String taskDone) {
        this.taskDone = taskDone;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDesc) {
        this.taskDescription = taskDesc;
    }


    public Task(String taskDesc) {
        this.taskDescription = taskDesc;
    }
}
