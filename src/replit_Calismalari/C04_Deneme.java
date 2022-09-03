package replit_Calismalari;

public class C04_Deneme {
    public static void main(String[] args) {
        //verilen sailarin rakamlar toplamini bul
        int input=123;
        int sayi=input;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        while (sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println(rakamlarToplami);

    }
}
