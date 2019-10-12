package exceptions;
// Exceptions personnalises pour gerer le code de l'airport
public class codeAirportExceptions extends Exception{


        String codeAirport;
        public codeAirportExceptions (String parCode) {
            this.codeAirport = parCode;
        }

        public String toString() {
            return ("l'airport avec le code" + codeAirport + "doit etre egale a 3");
        }

    }


