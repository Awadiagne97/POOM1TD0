package implementations;

import java.util.Objects;

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
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Airport)) {
            return false;
        }
        Airport airport = (Airport) o;
        return Objects.equals(code, airport.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
