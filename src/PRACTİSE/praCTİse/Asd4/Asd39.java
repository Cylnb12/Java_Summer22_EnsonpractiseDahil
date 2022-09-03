package Asd4;

import java.util.ArrayList;
import java.util.List;

public class Asd39 {
    public static void main(String[] args) {

          /*
iki adet MDA dizide bulunan elemanların ( küme elemanı gibi düşünün )
kesişim kümesini ve birleşim kümesini ayrı ayrı yazdıran JAVA kodu yazınız.
input : String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
output:  Dizilerin Kesişim Kümesi : 2c
         Dizilerin Birleşim Kümesi : a2c75kr1e8
 */
        String[][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String[][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};

        List<String> hepsi1 = new ArrayList<>();
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1[i].length; j++) {
                hepsi1.add(dizi1[i][j]);
            }
        }
        List<String> hepsi2 = new ArrayList<>();
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                hepsi2.add(dizi2[i][j]);
            }
        }


        String birlesim1 = "";
        String kesisim1 = "";


        for (int i = 0; i < hepsi1.size(); i++) {
            for (int j = 0; j < hepsi2.size(); j++) {
                if (hepsi1.get(i) == hepsi2.get(j)) {
                    kesisim1 += hepsi1.get(i);

                }

            }

        }
        for (int i = 0; i < hepsi1.size(); i++) {
            birlesim1 += hepsi1.get(i);
        }
        for (int i = 0; i < hepsi2.size(); i++) {
            if (!(birlesim1.contains(hepsi2.get(i)))) {
                birlesim1 += hepsi2.get(i);
            }
        }
        System.out.println(kesisim1);
        System.out.println(birlesim1);
    }
}
