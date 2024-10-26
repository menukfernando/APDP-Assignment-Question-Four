package com.example.monorepo.TicketingSystem;

public class Ticket {
    private final int ticketID;
    private final String customerName;
    private final String issueDescription;
    private boolean processed;

    public Ticket(int ticketID, String customerName, String issueDescription) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        this.processed = false;
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void markAsProcessed() {
        this.processed = true;
    }

    @Override
    public String toString() {
        return String.format("Ticket [ID=%d, Customer=%s, Issue='%s']", 
            ticketID, customerName, issueDescription);
    }
}
