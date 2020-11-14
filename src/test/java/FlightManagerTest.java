import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Flight flight1;
    Flight flight2;
    Passenger passenger;

    @Before
    public void before(){
        flight = new Flight(PlaneType.G6, "PARTY69", "NV", "GLA", "10:00");
        flight1 = new Flight(PlaneType.DODO, "FHE45", "INV", "GLA", "13:00");
        flight2 = new Flight(PlaneType.BOEING747, "CRY22", "NYC", "EDI", "02:00");
        passenger = new Passenger("Steve", 1, flight1);
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(5000, flight2.getTotalWeightFromPlaneType());
    }

    @Test
    public void canGetBaggageWeightAvailable(){
        assertEquals(2500, flight2.getBaggageWeightAvailable(), 0);
    }
    @Test
    public void canGetBaggageWeightAvailable1(){
        assertEquals(10, flight1.getBaggageWeightAvailable(), 0);
    }

    @Test
    public void canGetBaggageWeightForFullPlane(){
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        assertEquals(5, flight1.baggagePerPerson(), 0);
    }

    @Test
    public void canGetBaggageAllowance(){
        assertEquals(37.5, flight.getAllowance(), 0);
    }

    @Test
    public void canGetBaggageForPassengers(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(250, flight.baggagePerPerson(), 0);
    }

    @Test
    public void canGetBaggageForPassengers2(){
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        assertEquals(500, flight2.baggagePerPerson(), 0);
    }

    @Test
    public void getRemainingAllowance(){
        flight1.addPassenger(passenger);
        assertEquals(5, flight1.remainingAllowance(), 0);
    }

    @Test
    public void getRemainingAllowance1(){
        flight2.addPassenger(passenger);
        assertEquals(2490, flight2.remainingAllowance(), 0);
    }

    @Test
    public void canAddPassengerToFlight(){

    }

}
