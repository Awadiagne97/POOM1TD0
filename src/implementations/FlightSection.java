package implementations;

import java.util.ArrayList;

import enumerations.SeatClass;
import exceptions.nombreDeRangeesExceptions;

public class FlightSection implements interfaces.FlightSectionIF {
	private int rows;
	private char cols;
	private SeatClass section;
	private String  [] [] listeFSection ;
	char [] listeAlphabets = {'A','B','C','D','E','F','G','H','I','J'};
	
	    private ArrayList<Seat> seats;
	public boolean alphabetExiist(char col) {
		Boolean contain=false;
		for(int i=0;i<listeAlphabets.length;i++) {
			if(listeAlphabets[i] == col) {
				contain =  true;
			}
			contain = false;
		}
		return contain;
	}
	public FlightSection(SeatClass s , int rows, char cols) {
		
		
				//super();
				this.section = s;
		        this.seats = new ArrayList<Seat>();
		        seats.add(new Seat(rows, cols));
		        
				this.rows = rows;
				this.cols = cols;
				//listeFSection = new String [rows][cols];
		
	}
	public int getRows() {
		return rows;
	}
	
	public char getCols(){
		return cols;
	}
	 public SeatClass getSection() {
	        return this.section;
	    }

	    public ArrayList<Seat> getSeats() {
	        return this.seats;
	    }

	    public boolean hasAvailableSeats(){
	        for(Seat s : this.seats){
	            if(!s.getStatus()){
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public void bookSeat(){
	        if(hasAvailableSeats()){
	            for(Seat s : this.seats){
	                if(!s.getStatus()){
	                    s.setIsBooked(true);
	                    break;
	                }
	            }
	        }
	    }

	    public boolean bookSeat(SeatID sId){
	        for(Seat s : this.seats){
	            if(s.getSeatNum().equals(sId) && !s.getStatus()){
	                s.setIsBooked(true);
	                return true;
	            }
	        }
	        return false;
	    }

	
	 
	
	
}
