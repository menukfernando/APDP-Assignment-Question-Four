package com.example.monorepo.EmergencyTaskHandlingSystem;

import java.util.Stack;

public class EmergencyTaskSystem {
    private final Stack<Task> taskStack;
    private int nextTaskID;

    public EmergencyTaskSystem() {
        taskStack = new Stack<>();
        nextTaskID = 201;
    }

    public void addUrgentTask(String taskName, int priorityLevel) {
        Task task = new Task(nextTaskID++, taskName, priorityLevel);
        taskStack.push(task);
        System.out.println("Urgent task added:");
        System.out.println(task);
    }

    public void completeNextTask() {
        if (taskStack.isEmpty()) {
            System.out.println("No tasks in stack.");
            return;
        }

        Task task = taskStack.pop();
        task.markAsCompleted();
        System.out.println("Completing urgent task:");
        System.out.println(task);
        System.out.println("Task completed and removed from stack.");
    }

    public void displayStack() {
        if (taskStack.isEmpty()) {
            System.out.println("No pending tasks in stack.");
            return;
        }

        System.out.println("\nCurrent Task Stack (Top to Bottom):");
        System.out.println("----------------------------------");
        
        Stack<Task> tempStack = new Stack<>();
        tempStack.addAll(taskStack);
        
        while (!tempStack.isEmpty()) {
            System.out.println(tempStack.pop());
        }
        System.out.println("----------------------------------");
    }

    public int getPendingTaskCount() {
        return taskStack.size();
    }
}
