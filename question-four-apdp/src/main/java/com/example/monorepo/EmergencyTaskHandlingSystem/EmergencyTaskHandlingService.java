package com.example.monorepo.EmergencyTaskHandlingSystem;

public class EmergencyTaskHandlingService {
    public static void main(String[] args) {
        EmergencyTaskSystem system = new EmergencyTaskSystem();

        system.addUrgentTask("Heart surgery", 1);
        System.out.println("Pending tasks: " + system.getPendingTaskCount());
        
        system.addUrgentTask("Emergency room cleanup", 2);
        System.out.println("Pending tasks: " + system.getPendingTaskCount());
        
        system.addUrgentTask("Critical lab results", 3);
        System.out.println("Pending tasks: " + system.getPendingTaskCount());

        System.out.println("\nInitial Stack:");
        system.displayStack();

        System.out.println("\nCompleting most recent task:");
        system.completeNextTask();

        System.out.println("\nRemaining Stack:");
        system.displayStack();

        System.out.println("\nCompleting next task:");
        system.completeNextTask();

        System.out.println("\nFinal Stack:");
        system.displayStack();
    }
}
