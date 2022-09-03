package Asd4;

public class Asd37 {
    public static void main(String[] args) {

/*
Bir String değişkeni oluşturun ve konsoldaki ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle
yazdırın.
Örnek: Dize 'Java' ise konsola 'AV' yazdırmalısınız.
*/

        String str="Mehmet Ali";
        str=str.toUpperCase();
        str=str.substring(1,str.length()-1);

        System.out.println(str);


        //Bir String'in belirli bir tek karaktere sahip olup olmadığını
        // üç farklı şekilde kontrol etmek için kod yazın.

        String str0=" 11 asd Sadd ";
        String str1="1";
        if (str0.contains(str1)){
            System.out.println("karakter iceriliyor");
        }else System.out.println("Karakter icerilmiyor");

        String sonuc1="";
        String[] arr=str0.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str1)) {
                sonuc1="iceriyor";break;
            }else sonuc1="icermiyor";
        }

        System.out.println(sonuc1);


        if (str0.indexOf(str1)!=-1) {
            System.out.println("icerirliyor");
        }else System.out.println("icerilmiyor");

    }
}
