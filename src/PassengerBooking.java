import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PassengerBooking {
    String passengerName;
    String busName;
    int userBusNo;
    Date date;
    short inputSeat;


    public Scanner input = new Scanner(System.in);

    public void passengerNameAndBusNo() {
        System.out.println("Select Bus Number : ");
        this.userBusNo = input.nextInt();
        System.out.println("Enter Passenger Name : ");
        input.nextLine();
        this.passengerName = input.nextLine().toUpperCase();
    }

    public void selectDate() {
        System.out.println("Enter Date of journey as : DD-MM-YYYY");
        String dateInput = input.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid Date Format TryAgain....");
            selectDate();
        }
    }

    public void selectSeat() {
        System.out.println("Enter Number of Seats To Book : ");
        inputSeat = input.nextShort();
        System.out.println();
    }

    public void detailsConfirmation() {
        System.out.println("Confirm You Details");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println(" NAME                       : "+passengerName);
        System.out.println(" DATE OF JOURNEY            : "+date);
        System.out.println(" BUS NO (verify for routes) : "+userBusNo);
        System.out.println(" NUMBER OF SEATS            : 1");
        System.out.println("\n\nPlease Wait to Confirm your Booking.....");
    }

    public boolean isAvailable(ArrayList<BusData> buses, ArrayList<PassengerBooking> bookings) {
        int capacity = 0;
        for (BusData bus : buses) {
            if (bus.getBusNo() == userBusNo) {
                capacity = bus.getSeatCapacity();
            }
        }
        int booked = 0;
        for (PassengerBooking checkBooking : bookings) {
            if (checkBooking.userBusNo == userBusNo && checkBooking.date.equals(date)) {
                //  if( inputSeat <= capacity)
                //  booked=booked + inputSeat;
                //  }
                booked++;
            }

        }
        return booked < capacity;
    }
}
