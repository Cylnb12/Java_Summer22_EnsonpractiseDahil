package day11_stringManipulation;

public class C06_endsWith {
    public static void main(String[] args) {

        /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
             @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */

        String input="asdasd@gmail.com";
        if (!input.contains("@gmail.com")){
            System.out.println("Lutfen gecerli adresi giriniz");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");


        }else if (!input.endsWith("@gmail.com")){
            System.out.println("Lutfen yazimi kontrol ediniz");
        }


    }
}
