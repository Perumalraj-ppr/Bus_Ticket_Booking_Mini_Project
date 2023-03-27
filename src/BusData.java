import java.util.ArrayList;

public class BusData {
    private String busRoute;
    private String Coach;
    private int seatCapacity;
    private int busNo;

    BusData(int busNo,String route , String Coach, int seatCapacity) {
        this.busRoute= route;
        this.Coach =Coach;
        this.seatCapacity=seatCapacity;
        this.busNo=busNo;
    }

    public void displayBusDetails() {

        System.out.println("Bus No ->"+busNo+" "+ busRoute + "Coach:" + Coach + "Seats Available: " + seatCapacity);
    }



    public String getBusRoute(){ return busRoute; }

    public String getCoach() { return Coach; }

    public int getSeatCapacity() { return seatCapacity; }

    public void setBusRoute(String busRoute) { this.busRoute = busRoute;    }

    public void setCoach(String coach) { Coach = coach; }

    public void setSeatCapacity(int seatCapacity) { this.seatCapacity = seatCapacity; }

    public int getBusNo() { return busNo;  }

    public void setBusNo(int busNo) { this.busNo = busNo; }
}
