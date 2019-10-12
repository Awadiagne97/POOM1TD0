package implementations;

import enumerations.SeatClass;

public class Seat {
	private SeatID seatnum;
	int rows;
	char cols;
	SeatClass s;
	Boolean isBooked;
	
	public Seat( int row, char col) {
		//super();
        this.seatnum = new SeatID(row, col);
        isBooked = false;


		//this.s = s;
	}
	
	 public SeatID getSeatNum() {
		 return seatnum;
	 }
	 public boolean getStatus() {
	        return this.isBooked;
	    }

	    public void setIsBooked(boolean isBooked) {
	        this.isBooked = isBooked;
	    }
	
	




}
