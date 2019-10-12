package implementations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import enumerations.SeatClass;
import exceptions.flightIDException;
import interfaces.FlightIF;

public class Flight implements FlightIF{
	Airport orig;
	Airport dest;
	Calendar flightDate;
	String flightId;
    private ArrayList<FlightSection> sections;

	
	public Flight(String orig, String dest, Calendar cal, String id) {
		super();
		this.orig = new Airport(orig);
		this.dest = new Airport(dest);
		this.flightDate = cal;
		try {
			if(id.length() > 5) {
				throw new flightIDException(id);
			}
			else {
				this.flightId = id;

			}

		}
		catch(flightIDException e) {
            System.err.println(e);

		}
		this.sections = new ArrayList<FlightSection>();
	}
	

	/* public Boolean hasSection() {
		 //if(listevols.get)
	 }
	 public Boolean hasSeats() {
	 }*/
	 public void bookSeat(SeatClass s , int row , char col) {
		 for(FlightSection fs : this.sections){
	            if(fs.getSection() == s){
	                SeatID seat = new SeatID(row, col);
	                fs.bookSeat(seat);
	            }
	        }
	 }

	 public Boolean createSection(int rows, char cols, SeatClass s) {
		 FlightSection fs = new FlightSection(s,rows,cols);
		 sections.add(fs);
		 return true;
	 } 
	   public ArrayList<FlightSection> getSections() {
	        return this.sections;
	    }



	public Airport getOrig() {
		return orig;
	}

	public void setOrig(Airport orig) {
		this.orig = orig;
	}

	public Airport getDest() {
		return dest;
	}

	public void setDest(Airport dest) {
		this.dest = dest;
	}

	public Calendar getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Calendar flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}



    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String s = this.flightId + " " + dateFormat.format(this.flightDate.getTime())  + " " + this.orig.toString() + " " + this.dest.toString() + "\n";
        for(FlightSection fs : this.sections){
            for(Seat seat : fs.getSeats()){
                s += fs.getSection() + " " + seat.getSeatNum().toString() + " " + (seat.getStatus() == true ? "not available" : "available") + "\n" ;
            }
        }


        return s;
    }



	
	
}
