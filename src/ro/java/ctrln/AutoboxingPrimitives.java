package ro.java.ctrln;

public class AutoboxingPrimitives {

    public static void main(String[] args) {

        Integer integerValue = 8; // Autoboxing prin asignare
        System.out.println("Integer value : " + integerValue);

        demonstrateAutoboxing(15); // Autoboxing prin invocarea unei metode
    }

    public static void demonstrateAutoboxing(Integer parametru){
        System.out.println("Parameter is : " + parametru);

    }
}
