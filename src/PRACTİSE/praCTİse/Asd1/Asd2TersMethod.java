package Asd1;

public class Asd2TersMethod {
    public static void main(String[] args) {
//kullanicidan bir string isteyip method olarak yazdirin
        String input = "Java guzel";
        terse(input);

    }

    public static void terse(String input) {
        String ters = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            ters += input.charAt(i);

        }
        System.out.println("girdiginiz sayinin tersi : " + ters);
    }
}
