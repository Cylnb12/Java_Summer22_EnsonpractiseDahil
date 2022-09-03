package PRACTİSE.java_Ornekleri;

public class C05_tekRarCıkmıs {
    public static void main(String[] args) {
  /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
        int sayı=5;
        String sonuc="";
        if(sayı>=0&&sayı<=9){
            if (sayı==9){sonuc="dokuz";}
            else if (sayı==8) {sonuc="sekiz";}
            else if (sayı==7) {sonuc="yedi";}
            else if (sayı==6) {sonuc="altı";}
            else if (sayı==5) {sonuc="bes";}
            else if (sayı==4) {sonuc="dort";}
            else if (sayı==3) {sonuc="uc";}
            else if (sayı==2) {sonuc="iki";}
            else if (sayı==1) sonuc="bir";
            else sonuc="sifir";

        }else sonuc="gecersiz";
        System.out.println("sonuc="+sonuc);


    }
}
