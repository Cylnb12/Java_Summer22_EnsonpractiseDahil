package day13_interviewQuestions;

public class Q05_BirTakimSorular {

    //  Kullanicidan toplanmak uzere sayilar isteyin
// sayi adedi 10'u gecerse veya toplam 500 'u gecerse
// bu kadar sayi yeter
// ".. adet sayi girdin, toplami..." yazdirin



    /* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/

     /*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

      /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/
      public static void main(String[] args) {


          int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

          int sonuc=0;
          for (int i = 0; i < arr.length ; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  sonuc++;
              }
          }
          System.out.println(sonuc);
          
      }
}
