package Asd1;

public class Asd4_IkiSayiArasi {
    public static void main(String[] args) {
        // kullanicidan iki sayi isteyin girilen sayilara ve
        // aralarindaki tum sayilari toplayip sonucu yazdiran
        // bir program yaziniz
        int sayi1=5;
        int sayi2=10;
        int top=0;

        if (sayi1<sayi2){
            for (int i =sayi1; i <=sayi2 ; i++) {
                top+=i;
            }
            System.out.println(top);
        }else if (sayi1>sayi2){
            for (int i = sayi2; i <= sayi1; i++) {
                top += i;
            }
            System.out.println(top);

        }else {
            System.out.println("sayilar esit");
        }



    }
}
