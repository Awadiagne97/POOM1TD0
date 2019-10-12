package interfaces;

import enumerations.SeatClass;
import implementations.Flight;

public interface SystemManagerIF {

     public void createAirport(String n) ;
     public void createAirline(String n) ;
     public void createFlight(String n, String orig, String dest, int year, int month, int day, String id) ;
     public void createSection(String air, String flID, int rows, char cols, SeatClass s);
     public void findAvailableFlights(String orig, String dest);
     public void bookSeat(String air, String fl, SeatClass s, int row, char col);
     public void displaySystemDetails();
}
