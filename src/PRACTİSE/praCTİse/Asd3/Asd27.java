package Asd3;

import java.util.ArrayList;
import java.util.List;

public class Asd27 {
    public static void main(String[] args) {
        //diziyi parametre olarak alan  ve
        // dizide 7 rakamı  var ise  "Boom!" ifadesini;
        // aksi takdirde  "dizide 7 rakamı yok" ifadesini
        // döndüren bir method oluşturun".


        String[] x={"asd", "riza", "7cekirdek", "3", "elli"," 53", "65", "8yuz","92", "923"};
        String sorulan="7";

        String yediVarmi=yediVarMiOla(x,sorulan);
        System.out.println(yediVarmi);



    }

    private static String yediVarMiOla(String[] x, String sorulan) {
        String b="";
        for (int i = 0; i < x.length; i++) {
            b+=x[i]+" ";
        }

        List<String> a=new ArrayList<>();
        String[] c=b.split("");
        for (int i = 0; i <c.length ; i++) {
            a.add(c[i]);
        }
        String sonuc=a.contains(sorulan)?"Boom!":"dizide 7 rakami yok";
        return sonuc;
    }
}
