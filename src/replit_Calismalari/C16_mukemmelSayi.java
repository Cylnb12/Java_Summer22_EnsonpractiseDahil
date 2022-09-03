package replit_Calismalari;

public class C16_mukemmelSayi {
    public static void main(String[] args) {
        //Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        //Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
        //Input :
        //6
        //Output:
        //6 Mukemmel Sayidir.
        //======================
        //Input
        //7
        //Output:
        //7 Mukemmel Sayidir degildir.
        int sayi=6;
        int input=sayi;
        int poztftoplam=0;
        for (int i = 1; i <input ; i++) {
            if(input%i==0){
                poztftoplam+=i;

            }
        }if(poztftoplam==input){
            System.out.println(input+" Mukemmel Sayidir.");

        }else {
            System.out.println(input+" Mukemmel Sayi degildir.");
        }
    }
}
