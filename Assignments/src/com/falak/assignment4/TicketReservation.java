package com.falak.assignment4;

public class TicketReservation {
	
	private static int totalTicketsAvailable = 100;
    private String name;
    private int numberOfTickets;
    private String movieShift;
    
    // Method to get the remaining tickets
    public static int getTotalTicketsAvailable() {
		return totalTicketsAvailable;
	}

	// Constructor
    public TicketReservation(String name, int numberOfTickets, String movieShift) {
        this.name = name;
        this.numberOfTickets = numberOfTickets;
        this.movieShift = movieShift;
    }

    //Method to reserve tickets
    public static boolean reserveTickets(String name, int numberOfTickets, String movieShift) {
        if (numberOfTickets > totalTicketsAvailable) {
            System.out.println("Not enough tickets available.");
            return false;
        } else {
            totalTicketsAvailable -= numberOfTickets;
            TicketReservation reservation = new TicketReservation(name, numberOfTickets, movieShift);
            System.out.println("Reservation successful for " + reservation.name);
            System.out.println("Number of tickets: " + reservation.numberOfTickets);
            System.out.println("Movie shift: " + reservation.movieShift);
            System.out.println("Tickets remaining: " + totalTicketsAvailable);
            return true;
        }
        
    }
}
	
