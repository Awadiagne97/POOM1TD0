package interfaces;

import enumerations.SeatClass;

public interface FlightIF  {

	
	public void bookSeat(SeatClass s , int row , char col);
	public Boolean createSection(int rows, char cols, SeatClass s);

	//public int hasSeats();
}
