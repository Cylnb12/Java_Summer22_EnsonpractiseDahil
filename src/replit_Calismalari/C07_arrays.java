package replit_Calismalari;

import java.util.Scanner;

public class C07_arrays {
    public static void main(String[] args) {
        //soru:kullanıcıdan bir isim alın ve verilen arrayde olup olmadıgını true ya da false donduren method yazın
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz: ");
        String arananIsim= scan.nextLine();
        String[]isimler={"hasan","ilyas","handan","nevin","meva","ayse","hamiye"};
        boolean sonuc=arananIsimMethodu(arananIsim,isimler);
        System.out.println(sonuc);

    }

    public static boolean arananIsimMethodu(String arananIsim, String[] isimler) {
        boolean sonuc=false;
        for (int i = 0; i <isimler.length; i++) {
            if (arananIsim.equalsIgnoreCase(isimler[i])){
                sonuc = true;
            }

        }
        return sonuc;
    }
}
