package exceptions;

public class nomCodeAirlineExecptions extends Exception {
	
	String nomAirline;
	public nomCodeAirlineExecptions(String parNom) {
		
		nomAirline = parNom;
	}
	public String toString() {
		return ("La compagnie aerienne avec le nom " + nomAirline + " ne doit pas depasser 5");
	}

}
