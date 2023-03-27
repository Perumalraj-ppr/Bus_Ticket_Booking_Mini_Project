import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<PassengerBooking> bookings = new ArrayList<PassengerBooking>();
        ArrayList<BusData> buses = new ArrayList<BusData>();
        buses.add(new BusData(1, "Chennai To Bangalore  ", " A/C     ", 2));
        buses.add(new BusData(2, "Chennai To Kochin     ", " A/C     ", 15));
        buses.add(new BusData(3, "Chennai To Mumbai     ", " A/C     ", 10));
        buses.add(new BusData(4, "Chennai To Tirupati   ", " A/C     ", 20));
        buses.add(new BusData(5, "Bangalore To Chennai  ", " Non-A/C ", 15));

        System.out.println("WELCOME TO P.P.R BUS BOOKING");
        System.out.println("****************************");
        System.out.println("Available Bus Routes :");
        for (BusData busDetailIterator : buses) {
            busDetailIterator.displayBusDetails();
        }
        String userInput = "y";
        Scanner input = new Scanner(System.in);
        while (userInput.equalsIgnoreCase("y")) {
            System.out.println("Press \"Y\" to Booking \"N\" to Exit");
            userInput = input.next();
            if (userInput.equalsIgnoreCase("Y")) {
                PassengerBooking booking = new PassengerBooking();
                booking.passengerNameAndBusNo();
                booking.selectDate();
               // booking.selectSeat();
                booking.detailsConfirmation();
                if (booking.isAvailable(buses,bookings)) {
                         bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else
                    System.out.println("Sorry. Bus is full. Try another bus or date.");
            } else if (userInput.equalsIgnoreCase("n")) {
                System.out.println("Thank You Visit Again...");
            }
        }
    }

}
