package Asd1;

public class Asd5_Fakt {
    public static void main(String[] args) {

        //kullanicidan 10 dan kucuk bir tam sayi isteyin ve
        // bu sayinin faktoriyelini bulunuz
        int sayi=6;
        int sonSayi=1;

        if (sayi<10&&sayi>0){
            for (int i =sayi; i >0; i--) {
                sonSayi*=i;

            }
            System.out.println(sonSayi);

        }else {
            System.out.println("sayi gereklilikleri karsilamiyor");
        }

    }
}
