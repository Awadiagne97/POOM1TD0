package enumerations;

public enum SeatClass {
	
	 FIRST("First"),BUSI("Business"),ECO("Economy");
	
	 String name;

	 SeatClass(String parName) {
		name=parName;
	 }  
	 


	    public String getName(){
	        return this.name;
	    }


}
