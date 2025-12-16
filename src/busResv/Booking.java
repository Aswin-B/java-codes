package busResv;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatterBuilder;
//import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    String passengerName;
    LocalDate date;
    int busNo;

    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Passenger Name: ");
        passengerName = scanner.nextLine();
        System.out.println("Enter the Bus Number: ");
        busNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Date of Travel in dd-MM-yyyy: ");
        String dateFormat = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        date = LocalDate.parse(dateFormat, formatter);

    }

    public void displayUserDetails(){
        System.out.println("Hey, " + this.passengerName + " !!\nWelcome to KRR Bus Booking " +
                "Agency.");
    }

    public void displayBookedUSer(){
        System.out.println("Hey, Great " + this.passengerName + " You have " +
                "booked the bus. \nHappy Journey");
    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
        int capacity = 0;
        for(Bus b : buses){
            if(b.getBusNo() == this.busNo){
                capacity = b.getCapacity();
            }
        }
        int booked = 0;
        for(Booking bookItem : bookings){
            if(bookItem.busNo == this.busNo && bookItem.date.equals(this.date)){
                booked++;

            }
        }
        return booked < capacity ? true : false;

    }
}
