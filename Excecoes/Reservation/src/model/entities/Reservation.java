package model.entities;

import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {

    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut)  {

        LocalDate now = LocalDate.now();
        if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        return ChronoUnit.DAYS.between(getCheckIn(),getCheckOut());
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut)  {

        LocalDate now = LocalDate.now();
        if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + ", check-in: "
                + checkIn.format(formatter) + ", check-Out: "
                + checkOut.format(formatter) + ", " + duration()
                + " nights";
    }
}
