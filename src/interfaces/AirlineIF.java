package interfaces;

import java.util.ArrayList;
import java.util.Calendar;

import enumerations.SeatClass;
import implementations.Airport;
import implementations.Flight;

public interface AirlineIF {
	
	public Flight createFlight(String orig, String dest, Calendar date, String id) ;
	public Flight findFlight(String n);
	public void createSection(String flID, int rows, char cols, SeatClass s);
	public ArrayList<Flight> getAvailableFlights(Airport orig, Airport dest);
	public void bookFlight(String fl, SeatClass s, int row, char col);
}
