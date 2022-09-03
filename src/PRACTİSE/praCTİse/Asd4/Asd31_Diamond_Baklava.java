package Asd4;

public class Asd31_Diamond_Baklava {
    public static void main(String[] args) {
 /*
      Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.

Test Data:
Yarım elmas uzunluğu : 7
Beklenen Çıktı:
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
         */


        int en=14;
        int enyari=(en/2)+1;

        for (int i = 1; i < enyari; i++) {

            for (int j = 1; j <=enyari-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = enyari-2; i >= 1; i--) {


            for (int j = 1; j <=enyari-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    }

