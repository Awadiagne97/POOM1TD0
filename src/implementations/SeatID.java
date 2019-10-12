package implementations;

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
	
	

}
