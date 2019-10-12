package exceptions;

public class nombreDeRangeesExceptions extends Exception {
	int rows;
	int cols;
	public nombreDeRangeesExceptions(int parRows,char parCols) {
		rows = parRows;
		cols=parCols;
	}
	
	public String toString() {
        return ("Nombre de rangee ou colonnes a depasse la limite");

	}
	
	

}
