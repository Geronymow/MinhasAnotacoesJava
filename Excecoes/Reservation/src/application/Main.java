package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String dateCheckIn = sc.nextLine();
            LocalDate checkIn = LocalDate.parse(dateCheckIn, formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            String dateCheckOut = sc.nextLine();
            LocalDate checkOut = LocalDate.parse(dateCheckOut, formatter);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            dateCheckIn = sc.nextLine();
            checkIn = LocalDate.parse(dateCheckIn, formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            dateCheckOut = sc.nextLine();
            checkOut = LocalDate.parse(dateCheckOut, formatter);

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (DateTimeException e) {
            System.out.println("Invalid date Format");
        }
        catch (DomainException e ) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
