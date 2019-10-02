package interfaces;

public interface SystemManager {

     public void createAirport(String n) ;
     public void createAirline(String n) ;
     public void createFlight(String n, String orig, String dest, int year, int month, int day, String id) ;
     public void reateSection(String air, String flID, int rows, int cols, SeatClass s);
     public Flight findAvailableFlights(String orig, String dest);
     public void bookSeat(String air, String fl, SeatClass s, int row, char col);
     public void displaySystemDetails();
}
