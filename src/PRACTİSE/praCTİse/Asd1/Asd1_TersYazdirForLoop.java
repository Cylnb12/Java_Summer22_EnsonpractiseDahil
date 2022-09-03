package Asd1;

public class Asd1_TersYazdirForLoop {
    public static void main(String[] args) {
// kullanicidan bir string isteyin ve stringi tersten yazdirin
        String input="Java";


        String ters="";
        for (int i = input.length()-1; i >=0 ; i--) {
            ters+= input.charAt(i);


        }
        System.out.println("yazdiginiz inputun ters hali : "+ters);

    }
}
