package practise_session2;

public class Q05_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve
        // hangisinin daha uzun oldugunu yazdirin.
        String str1="ahmetl";
        String str2="mehme";

        System.out.println(str1.length()>str2.length()?"isim daha uzun":
                str1.length()==str2.length()?"isim ve soyisminiz esit uzunlukta ":
                        "soyisim daha uzun");
    }
}
