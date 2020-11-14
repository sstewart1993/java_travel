import java.util.ArrayList;

public class FlightManager extends Flight {

    public FlightManager(PlaneType planeType, String flightNo, String destination,
                         String departure, String time) {
        super(planeType, flightNo, destination, departure, time);
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
