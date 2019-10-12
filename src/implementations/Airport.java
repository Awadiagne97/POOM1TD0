package implementations;

public class Airport implements interfaces.AirportIF {
    private String code;
    public Airport(String n) {
        n=code;
    }

    
    public String toString(){
        return this.code;
    }

    public String getCode() {
        return this.code;
    }
}
