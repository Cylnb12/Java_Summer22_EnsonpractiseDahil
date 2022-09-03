package Asd5;

public class Asd44 {
    public static void main(String[] args) {

         /*
     Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

Test Data:

isPrime(31)
true

isPrime(18)
false
     */

        int sayi=2;
        boolean asal=asalMi(sayi);
        System.out.println(asal);

    }

    private static boolean asalMi(int sayi) {
        boolean sonuc=true;
        int count=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){

                count++;

            }
        }
        if (count==1){
            sonuc=true;
        }else sonuc=false;

        return sonuc;
    }
}
