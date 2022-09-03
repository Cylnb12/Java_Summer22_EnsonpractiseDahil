package replit_Calismalari;

import java.util.Scanner;

public class C02_replit {
    public static void main(String[] args) {
        // Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        //  char ch1= 'a' ;

        // String name =“John came late"

        // Expected Output:


        // Number of a = 2
        Scanner scan=new Scanner(System.in);
        System.out.println("String bir isim giriniz: ");
        String isim= scan.nextLine();
        System.out.println("bir karakter giriniz: ");
        String ch1=scan.next();
        int sayac=0;

        isim= isim.replaceAll("\\W","");
        for (int i = 0; i <isim.length(); i++)  {
            if(ch1.equalsIgnoreCase(String.valueOf(isim.charAt(i)))){
                sayac++;

            }

        }System.out.println("Number of "+ch1+" ="+sayac);




    }


}





