package implementations;

import java.util.Objects;

public class SeatID {
	Integer row;
	char col;
	public SeatID(Integer row, char col) {
		super();
		this.row = row;
		this.col = col;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public char getCol() {
		return col;
	}
	public void setCol(char col) {
		this.col = col;
	}
	
	


    public String toString(){
        return this.row + " " + this.col;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SeatID)) {
            return false;
        }
        SeatID seatID = (SeatID) o;
        return row == seatID.row && col == seatID.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
	

}
