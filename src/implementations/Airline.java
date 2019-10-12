package implementations;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import enumerations.SeatClass;
import interfaces.AirlineIF;
import interfaces.FlightIF;
import interfaces.SeatClassIF;

public class Airline implements AirlineIF{
	private String nom;
	private HashMap <String,Flight> listevols;


	public Airline(String parNom) {
		nom = parNom;
		this.listevols = new HashMap<String,Flight> ();
		
	}
    public Flight createFlight(String orig, String dest, Calendar date, String id) {
    
    	
    	Flight f =  new Flight(orig,dest,date,id);;

    	if(listevols.get(id) != null) {
    		System.out.println("Le vol qui a pour id" + id + "existe deja");

    	}
    	else {
        	this.listevols.put(id,f);   			

    	}
    	return f;
    	
    }

    
 
	public  void createSection(String flID, int rows, char cols, SeatClass s){
		Flight flight = this.listevols.get(flID);
        if(flight != null){
            flight.createSection(rows, cols, s);
        }
    }
	

	public ArrayList<Flight> getAvailableFlights(Airport orig, Airport dest) {
		// TODO Auto-generated method stub
		ArrayList <Flight> volsAvecSeatAvailable = new ArrayList();
		for(Map.Entry<String,Flight> flights : this.listevols.entrySet() ) {
			Flight volActuel = flights.getValue();
			Airport origineVolActuel = volActuel.getOrig();
			Airport destVolActuel = volActuel.getOrig();

			if( origineVolActuel.equals(orig) && destVolActuel.equals(dest) ) {
					volsAvecSeatAvailable.add(volActuel)
;				
				
			}
			
		}
		return volsAvecSeatAvailable;
	}
	
	public void bookFlight(String fl, SeatClass s, int row, char col){
        Flight flight = this.listevols.get(fl);
        if(flight != null){
            flight.bookSeat(s, row, col);
        }
    }
	public String toString() {
		String s = this.nom + "\n";
		 for(Map.Entry<String,Flight> flight : listevols.entrySet()) {
	            s += flight.getValue().toString() + "\n";
	        }

	        return s;
		
				
	}
    public Flight findFlight(String n){
        return this.listevols.get(n);
    }





    
}
