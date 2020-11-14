public class Passenger {

    private String name;
    private int noBags;
    private  Flight flight;

    public Passenger(String name, int noBags, Flight flight) {
        this.name = name;
        this.noBags = noBags;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public int getNoBags() {
        return noBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void addPassengerToFlight(Passenger passenger){
        flight.addPassenger(passenger);
    }

}
