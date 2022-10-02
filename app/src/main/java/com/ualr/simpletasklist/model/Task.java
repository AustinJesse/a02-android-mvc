package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    // TODO 02. Define the class constructor and the corresponding getters and setters.

    private String taskStatus = "";
    private String taskDescription;

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskDone) {
        this.taskStatus = taskDone;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDescription = taskDescription;
    }


    public Task(String taskDesc) {
        this.taskDescription = taskDescription;
    }
}
