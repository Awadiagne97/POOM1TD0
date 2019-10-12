package main;

import enumerations.SeatClass;
import implementations.SystemManager;

public class Main {

    public static void main(String [] args){
    	  SystemManager res = new SystemManager () ;
          
          res . createAirport ("DEN");
          res . createAirport ("DFW");
          res . createAirport ("LON");
          res . createAirport ("DEN");
          res . createAirport ("CDG");
          res . createAirport ("JPN");
          res . createAirport ("DEN"); // Pb d ’ u n i c i t e
          res . createAirport ("DE"); // I n v a l i d e
          res . createAirport ("DEH");
          res . createAirport ("DRIrdn3 "); // I n v a l i d e
          // A i r l i n e s
          res . createAirline ("DELTA");
          res . createAirline ("AIRFR");
          res . createAirline ("AMER");
          res . createAirline ("JET");
          res . createAirline ("DELTA");
          res . createAirline ("SWEST");
          res . createAirline ("FRONTIER"); // I n v a l i d e
          // F l i g h t s
          res . createFlight ("DELTA" , "DEN" , "LON" , 2008 , 11 , 12 , "123");
          res . createFlight ("DELTA" , "DEN" , "DEH" , 2009 , 8, 9, "567");
          res . createFlight ("DELTA" , "DEN" , "NCE" , 2010 , 9, 8, "567"); //I n v a l i d e
          // S e c t i o n s
          res . createSection ("JET" , "123" , 2 , 'B' , SeatClass . ECO );
          res . createSection ("JET" , "123" , 1 , 'C' , SeatClass . ECO );
          res . createSection ("JET" , "123" , 2 , 'C' , SeatClass . FIRST );
          res . createSection ("DELTA" , "123" , 1 , 'A' , SeatClass . BUSI );
          res . createSection ("DELTA" , "123" , 1 , 'B' , SeatClass . ECO );
          res . createSection ("SWSERTT" , "123" , 5 , 'E' , SeatClass . ECO ); //I n v a l i d e
          res . displaySystemDetails () ;
          res . findAvailableFlights ("DEN" , "LON");
          res . bookSeat ("DELTA" , "123" , SeatClass . BUSI , 1 , 'A');
          res . bookSeat ("DELTA" , "123" , SeatClass . ECO , 1, 'A');
          res . bookSeat ("DELTA" , "123" , SeatClass . ECO , 1, 'B');
          res . bookSeat ("DELTA" , "123" , SeatClass . BUSI , 1 , 'A' ); //De ja r e s e r v e
          res . displaySystemDetails () ;
          res . findAvailableFlights ("DEN" , "LON");   }
}
