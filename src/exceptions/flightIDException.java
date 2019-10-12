package exceptions;

public class flightIDException extends Exception {
	String id;

	public flightIDException(String id) {
		this.id = id;
	}
    public String toString() {
        return ("Le code id du vol ne dit pas depasser 5 char ");
    }
	

}
