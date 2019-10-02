package exceptions;
// Exceptions personnalises pour gerer le code de l'airport
public class codeAirportExceptions extends Exception{


        String codeAirport;
        public codeAirportExceptions (String parCode) {
            this.codeAirport = parCode;
        }

        public String toString() {
            return ("Le code de l'airport ne doit pas depassser 3 ");
        }

    }


