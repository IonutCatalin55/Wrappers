package ro.java.ctrln;

public class Autoboxing {

    public static void main(String[] args) {
    Byte byteObject = new Byte((byte) 4); // se creaza o clasa byteObject care stocheaza o val primitiva byte
        System.out.println("Byte : " + byteObject);
    Byte stringByte = new Byte("5");
        System.out.println("Byte : " + stringByte);
        byte byteVariable = 7;
    Byte bByte = Byte.valueOf(byteVariable);
        System.out.println("Byte : " + bByte);

    Byte cByte = Byte.valueOf("10");
        System.out.println("Byte : " + cByte);

    Byte dByte = 20; //cea mai simpla metoda este aceasta care face AUTOBOXING prin initializare
        System.out.println("Byte autoboxing : " + dByte);

    Short shortObject = new Short("7");
        System.out.println("Short : " + shortObject);

    Short aShort = Short.valueOf((short) 50)  ; // ne avertizeaza ca facem un boxing care nu este necesar
    Short bShort = 50;  // Java stie sa faca boxing automat prin initializare

    Integer integer = new Integer(70);
        System.out.println("Integer : " + integer);

    Integer aInteger = 70; //  AUTOBOXING prin initializare

    Long longObject = 1000L;
        System.out.println("Long : " + longObject);

    Long aLong = Long.valueOf("44");
        System.out.println(aLong);

    Float floatObject = new Float("50.0");
        System.out.println("Float : " + floatObject);

    Float aFloat = 50.0F;
        System.out.println("Float : " + aFloat);

    Double doubleObject = new Double(10000);
        System.out.println("Double : " + doubleObject);

    Character characterObject = new Character('r');
        System.out.println("Caracter : " + characterObject);

    Character acharacter = 'f';
        System.out.println("Caracter : " + acharacter);

    Boolean booleanObject = true;  // Autoboxing prin asignare / initializare
        System.out.println("Boolean : " + booleanObject);

    Boolean aboolean  = Boolean.valueOf(""); // pt empti string returneaza val inplicita pt boolean adica false
        System.out.println("Boolean with empty string : " + aboolean);

    aboolean = Boolean.valueOf(null);
        System.out.println("Boolean with null to valueOf : " + aboolean);

    aboolean = Boolean.valueOf("False");
        System.out.println("Boolean with False : " + aboolean);

    aboolean = Boolean.valueOf("True");
        System.out.println("Boolean with True : " + aboolean);

    aboolean = new Boolean("TRue");
        System.out.println("Boolean with capsLock : " + aboolean);

    aboolean = new Boolean("orice altceva");
        System.out.println("Orice altceva : " + aboolean);

    }
}
