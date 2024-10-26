package com.example.monorepo.TicketingSystem;

public class TicketingSystemService {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();

        system.submitTicket("John Doe", "Login problem");
        system.submitTicket("Jane Smith", "Payment issue");
        system.submitTicket("Emily Davis", "Shipping delay");

        System.out.println("\nInitial Queue:");
        system.displayQueue();

        System.out.println("\nHandling first ticket:");
        system.handleNextTicket();

        System.out.println("\nRemaining Queue:");
        system.displayQueue();

        System.out.println("\nHandling next ticket:");
        system.handleNextTicket();

        System.out.println("\nFinal Queue:");
        system.displayQueue();
    }
}
