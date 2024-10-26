package com.example.monorepo.EmergencyTaskHandlingSystem;

public class Task {
    private final int taskID;
    private final String taskName;
    private final int priorityLevel;
    private boolean completed;

    public Task(int taskID, String taskName, int priorityLevel) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priorityLevel = priorityLevel;
        this.completed = false;
    }

    public int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return String.format("Task [ID=%d, Name='%s', Priority=%d]", 
            taskID, taskName, priorityLevel);
    }
}
