package implementations;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import enumerations.SeatClass;
import interfaces.FlightIF;
import interfaces.SeatClassIF;
import interfaces.SystemManagerIF;
import  exceptions.codeAirportExceptions;
import exceptions.nomCodeAirlineExecptions;
public class SystemManager implements SystemManagerIF {

    private HashMap<String,Airport> listeAirport;
    private HashMap<String,Airline> listeAirline;
    private HashMap<String,FlightIF> listeFlights;
    private HashMap<String,Seat> listeSeat;
    private HashMap<String,FlightSection> listeFlightSection;

    public SystemManager(){
        this.listeAirline = new HashMap<String,Airline>();
        this.listeAirport = new HashMap<String, Airport>();
    }

    public void createAirport(String n) {
        try {
            if(n.length() != 3)
            {
                throw new codeAirportExceptions(n);
            }
            
            else if(this.listeAirport.get(n) != null){
                System.out.println("L'aeroport "+ n + " existe déjà dans la liste");
            }else{
                this.listeAirport.put(n, new Airport(n));
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
    		else if(this.listeAirline.get(n) !=null) {
    				System.out.println("La compagnie aerienne " + n + " existe deja dans la liste");
    		}
    		else {
    			listeAirline.put(n,new Airline(n));
    		}
    	}
    	catch(nomCodeAirlineExecptions e) {
    		System.err.println(e);
    	}

    }
    public void createFlight(String n, String orig, String dest, int year, int month, int day, String id) {
    		Airline airline = this.listeAirline.get(n);
    		
    		if(airline !=null) {
    			Calendar calendar = Calendar.getInstance();
    			Date date = new Date(year,month,day);
    			calendar.setTime(date);
    			airline.createFlight(orig, dest,calendar,id);
    		}
    		
 
  //  	Airline.createFlight(n, orig, dest,year,month,day, id);
    	
    }
    public void createSection(String air, String flID, int rows, char cols, SeatClass s){
    		Airline airline = this.listeAirline.get(air);
    		if(airline !=null) {
    			airline.createSection(flID, rows, cols, s);
    		}
    //	createSection(flID,rows,cols, s);

    }
  public  void findAvailableFlights(String orig, String dest){
	  
    	Airport origine = this.listeAirport.get(orig);
    	Airport destination = this.listeAirport.get(dest);
    	ArrayList <FlightIF> volsDisponible = new ArrayList <FlightIF>();
    	
    	for(Map.Entry <String, Airline>  mapentry : listeAirline.entrySet()) {
    		volsDisponible.addAll(mapentry.getValue().getAvailableFlights(origine,destination));
    	}
    	
    	for(int i=0;i<volsDisponible.size();i++) {
    		System.out.println(volsDisponible.get(i).toString());
    	}
    } 
    public void bookSeat(String air, String fl, SeatClass s, int row, char col){
    		Airline airline = this.listeAirline.get(air);
    		if(airline != null){
                airline.bookFlight(fl, s, row, col);
            }    }
    
    public void displaySystemDetails(){
    	//System Compagnie
    	for(Map.Entry<String, Airline> mapentry : listeAirline.entrySet()) {
    		   System.out.println(mapentry.getValue().toString());
    	}
    	//System Airport
    	for(Map.Entry<String, Airport> mapentry : listeAirport.entrySet()) {
 		   System.out.println(mapentry.getValue().toString());
 	}
    	

    }



}
