package Asd3;

public class Asd23 {
    public static void main(String[] args) {
//Soru 3- Kullanicidan aldiginiz bir ismin verilen bir Array de olup olmadigini
        // icerip icermedigini kontrol edip, bize true veya false
        // sonucu donen bir method olusturun.

        String name = "basak";
        String[] words = {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};

        String sonuc = "";
        for (int i = 0; i < words.length; i++) {
            if (name.equalsIgnoreCase(words[i])) {
                sonuc = "Bu dizinin icinde "+name+" isimi var";
            } else {
                sonuc = "Bu dizinin icinde "+name+" isimi yok";
            }

        }
        System.out.println(sonuc);


    }
}
