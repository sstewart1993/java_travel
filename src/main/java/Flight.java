import sun.jvm.hotspot.memory.Space;

import java.util.ArrayList;

public class Flight extends Plane{

    public ArrayList<Passenger>passengers;
    private String flightNo;
    private String destination;
    private String departure;
    private String time;


    public Flight(PlaneType planeType,
                  String flightNo, String destination, String departure, String time) {
        super(planeType);
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.time = time;
    }


    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getTime() {
        return time;
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public int passengerCount(){
        return passengers.size();
    }

    public int spaceOnPlane(){
        int space = getCapacityFromPlaneType() - passengerCount();
        return space;
    }

    public String bookPassengerOnPlane(Passenger passenger){
        if(spaceOnPlane() > 0){
            passengers.add(passenger);
            return "Yes there is Space";
        }else return "Plane is Full!";
    }


    public double getBaggageWeightAvailable(){
        double Baggage = planeType.getTotalWeight();
        return Baggage/2;
    }

    public double baggagePerPerson() {
        return getBaggageWeightAvailable()/ passengerCount();
    }

    public double getAllowance() {
        return getBaggageWeightAvailable() / getCapacityFromPlaneType();
    }

    public double remainingAllowance(){
        double bags = getAllowance() * passengerCount();
        return getBaggageWeightAvailable() - bags;
    }

}
