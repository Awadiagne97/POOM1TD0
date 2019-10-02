package implementations;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import interfaces.Flight;
import interfaces.SeatClass;
import  exceptions.codeAirportExceptions;
import exceptions.nomCodeAirlineExecptions;
public class SystemManager {

    ArrayList<Airport> listeAirport = new ArrayList();
    ArrayList<Airline> listeAirline= new ArrayList();
    ArrayList<Flight> listeFlights= new ArrayList();
    ArrayList<Seat> listeSeat= new ArrayList();
    ArrayList<FlightSection> listeFlightSection= new ArrayList();



    public void createAirport(String n) {
        try {
            if(n.length() > 3)
            {
                throw new codeAirportExceptions(n);
            }
            else{
                Airport a = new Airport(n);
                listeAirport.add(a);
            }

        }
        catch(codeAirportExceptions e){
            System.err.println(e);
        }

    }
    public void createAirline(String n) {
    	try {
    		if(n.length()>5) {
    			throw new nomCodeAirlineExecptions(n);
    		}
    		else {
    			Airline airline = new Airline(n);
    			listeAirline.add(airline);
    		}
    	}
    	catch(nomCodeAirlineExecptions e) {
    		System.err.println(e);
    	}

    }
    public void createFlight(String n, String orig, String dest, int year, int month, int day, String id) {

    	Airline.createFlight(n, orig, dest,year,month,day, id);
    	
    }
    public void createSection(String air, String flID, int rows, int cols, interfaces.SeatClass s){

    	Airline.createSection(air,flID,rows,cols, s);

    }
  /*  public  ArrayList<Flight> findAvailableFlights(String orig, String dest){
    	S
    	Flight.getAvailableFlights(orig,dest);
    } */
    public void bookSeat(String air, String fl, SeatClass s, int row, char col){

    }
    
    public void displaySystemDetails(){
    	//System Compagnie
    	for(int i = 0 ; i < listeAirline.size(); i++) {
    		   System.out.println(listeAirline.get(i));
    	}
    	//System Airport
     	for(int i = 0 ; i < listeAirport.size(); i++) {
 		   System.out.println(listeAirport.get(i));
 	}
    	
    	//System Vol
     	for(int i = 0 ; i <  listeFlights.size(); i++) {
 		   System.out.println( listeFlights.get(i));
 	}
    	//System Seat
     	for(int i = 0 ; i < listeSeat.size(); i++) {
 		   System.out.println(listeSeat.get(i));
 	}
    	//System FlightSection
     	for(int i = 0 ; i < listeFlightSection.size(); i++) {
 		   System.out.println(listeFlightSection.get(i));
 	}

    }
}
