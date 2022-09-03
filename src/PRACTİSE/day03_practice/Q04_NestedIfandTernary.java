package day03_practice;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {

         /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

        int input=9;
        String sonuc="";

        if (input>=0&&input<=9){
            if (input==9){sonuc="dokuz";}
            else if (input==8) {sonuc="sekiz";}
            else if (input==7) {sonuc="yedi";}
            else if (input==6) {sonuc="alti";}
            else if (input==5) {sonuc="bes";}
            else if (input==4) {sonuc="dort";}
            else if (input==3) {sonuc="uc";}
            else if (input==2) {sonuc="iki";}
            else if (input==1) {sonuc="bir";}
            else sonuc="sifir";
        }else sonuc="gecersiz";

        System.out.println("sonuc = " + sonuc);


        int n=0;

        String result= n==9? "dokuz": n==8?"sekiz": n==7?"yedi": n==6?"alti": n==5?"bes"
                :n==4?"dort":n==3?"uc": n==2?"iki": n==1?"bir": n==0?"sifir":"gecersiz";

        System.out.println("result = " + result);


    }
}
