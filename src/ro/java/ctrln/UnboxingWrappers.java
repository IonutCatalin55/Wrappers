package ro.java.ctrln;

public class UnboxingWrappers {

    public static void main(String[] args) {

        Double doubleNumbre = new Double(2.75);
        double d = doubleNumbre;  //unboxing prin asignare
        System.out.println("Unboxed primitive " + d);

        demostrateUnboxing(new Double(3.25)); // unboxing prin apel de metoda

       //  Double nullDouble = null; acest obiect Double cu valoarea null prin folosire lui in demostrateUnboxing(nullDouble); creaza nullPointerException
        Double nullDouble = populateDoubleValue(5, 3);


        if(nullDouble == null){ // pentru a evita nullPointerException conditionam obiectul cu if
            nullDouble = 0D;
        }
        demostrateUnboxing(nullDouble); // creaza un nullPointer exception daca nullDouble ramane null

    }

    private static Double populateDoubleValue(int a, int b){
        if(a < 0){
            return null;
        }

        return (double) (a+ b); // face autoboxing de la o primitiva double la un obiect Double
    }

   private static void demostrateUnboxing(double aDouble){
        System.out.println("double primitive " + aDouble);
    }
}
