import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight1;
    Passenger passenger;


    @Before
    public void before(){
    flight = new Flight(PlaneType.G6, "PARTY69", "NV", "GLA", "10:00");
    flight1 = new Flight(PlaneType.DODO, "PARTY69", "NV", "GLA", "10:00");
    passenger = new Passenger("Steve", 4, flight1);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(20, flight.getCapacityFromPlaneType());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void spaceLeftOnPlane(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(18, flight.spaceOnPlane());
    }

    @Test
    public void canBookPassengerOnPlane(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals("Yes there is Space", flight.bookPassengerOnPlane(passenger));
    }

    @Test
    public void noSpaceOnPlane(){
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        assertEquals("Plane is Full!", flight1.bookPassengerOnPlane(passenger));
    }


}
