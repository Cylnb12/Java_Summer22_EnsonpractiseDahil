package Asd4;

public class Asd36 {
    public static void main(String[] args) {


        //Kişi adları için 3 String variable oluşturun.
        // Boşluk karakterleri hariç tüm 3 addaki karakter
        // sayısının toplamını yazdırın.

        String str1="Java guzel";
        String str2="Mehmet Ali";
        String str3=" Uc kelimeli String. ";


        str1=str1.replaceAll("\\s","");
        str2=str2.replaceAll("\\s","");
        str3=str3.replaceAll("\\s","");

        int sonuc=str1.length()+str2.length()+str3.length();
        System.out.println("Stringlerin Karakterleri toplami = " + sonuc);


    }
}
