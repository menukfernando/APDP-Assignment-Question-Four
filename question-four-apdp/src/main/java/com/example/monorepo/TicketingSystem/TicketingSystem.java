package com.example.monorepo.TicketingSystem;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private final Queue<Ticket> ticketQueue;
    private int nextTicketID;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
        nextTicketID = 101;
    }

    public void submitTicket(String customerName, String issueDescription) {
        Ticket ticket = new Ticket(nextTicketID++, customerName, issueDescription);
        ticketQueue.offer(ticket);
        System.out.println("Ticket submitted: " + ticket);
    }

    public void handleNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in queue.");
            return;
        }

        Ticket ticket = ticketQueue.poll();
        ticket.markAsProcessed();
        System.out.println("Handling ticket: " + ticket);
        System.out.println("Ticket processed and removed from queue.");
    }

    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets in queue.");
            return;
        }

        System.out.println("\nCurrent Ticket Queue:");
        System.out.println("---------------------");
        for (Ticket ticket : ticketQueue) {
            System.out.println(ticket);
        }
        System.out.println("---------------------");
    }
}
