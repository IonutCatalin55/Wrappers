package ro.java.ctrln;

public class Unboxing {

    public static void main(String[] args) {

        Character character = 'a';
        char charValue = character; // Unboxing prin asignare

        Integer integer = 100;

        int intValue = integer;
        int intVal = integer.intValue();
        System.out.println(intVal);
        // sau putem face

        float floatVal = integer.floatValue();
        System.out.println(floatVal);

        long longValue = integer.longValue();
        System.out.println(longValue);


    }
}
