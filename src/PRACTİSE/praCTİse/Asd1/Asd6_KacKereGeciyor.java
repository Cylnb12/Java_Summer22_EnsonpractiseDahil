package Asd1;

public class Asd6_KacKereGeciyor {
    public static void main(String[] args) {
      // Kullanıcıdan bir isim ve bir karakter girmesini isteyin
        // , ardından döngüleri kullanarak karakterin
        // isimde kaç kez tekrarlandığını kontrol edin.

      // char ch1= 'a' ;

      // String name =“John came late"

      // Expected Output:


      // Number of a = 2
        char harf='a';
        String kelime="baba";
        int harfAdedi=0;

        for (int i = 0; i <=kelime.length()-1 ; i++) {
            if (harf==(kelime.charAt(i))){
                harfAdedi+=1;

            }

        }
        System.out.println("Number of a = " + harfAdedi);

    }
}
