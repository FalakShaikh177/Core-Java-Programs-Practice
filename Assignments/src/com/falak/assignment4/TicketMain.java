package com.falak.assignment4;
import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(TicketReservation.getTotalTicketsAvailable() > 0) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the number of tickets: ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();     // Consume newline left-over
        System.out.println("Enter the movie shift: ");
        String movieShift = scanner.nextLine();

        // As the method is static, it can be accessed by the class name only
        boolean success = TicketReservation.reserveTickets(name, numberOfTickets, movieShift);
        if (!success) {
            System.out.println("Reservation failed. Please try again.");
	    }
        
        if (TicketReservation.getTotalTicketsAvailable() > 0) {
            System.out.println("Do you want to reserve more tickets? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        } else {
            System.out.println("All tickets are sold out.");
            break;
        }
	}
		scanner.close();
	}
	
}
