package busResv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, 2, true));
        buses.add(new Bus(2, 3, false));
        buses.add(new Bus(3, 2, true));

        System.out.println("------------Bus Information-------------");

        for(Bus b:buses){
            b.displayBusInfo();
        }

        while (userOpt == 1) {
            System.out.println("Enter 1 to book and 2 to exit booking");
            userOpt = scanner.nextInt();
            if (userOpt == 1){
                System.out.println("Booking Started.........");
                Booking booking = new Booking();
                booking.displayUserDetails();
                if(booking.isAvailable(buses, bookings)){
                    bookings.add(booking);
                    booking.displayBookedUSer();
                    //System.out.println("Bus booked. Happy Journey.");
                }
                else {
                    System.out.println("The Bus is full. Try with different bus or Date !!");
                }
            }
            else{
                System.out.println("Thank you for Booking !!");
            }
        }

    }
}
