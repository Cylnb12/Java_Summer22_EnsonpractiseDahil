package day08_practice;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
      public static void main(String[] args) {


          //str = {"$13", "$15", "$20"};
          //"$-13", "$0", "$0"
          String[]str={"$13", "$15", "$20"};
          for (int i = 0; i < str.length; i++) {

          }
          int sonuc = getSum(str);
          System.out.println("sonuc = " + sonuc);

      }
      public static int getSum(String[] str) {

        int sum=0;
        for (int i = 0; i < str.length; i++) {
            String a=str[i].replace("$","");
            int sayiHali=Integer.parseInt(a);
            sum+=sayiHali;
        }
        int sonuc=0;
        if (sum>=0) sonuc=sum;else sonuc=-1;
        return sonuc;
    }
}
