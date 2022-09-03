package replit_Calismalari;

public class C18_sayiyiTersCevir {
    public static void main(String[] args) {
        //soru:Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        //
        //Input :1238
        //
        //Output :Girilen Numananin Tersi: 8321

        int sayi=1238;
        String ters=String.valueOf(sayi);
        String yeniSayi="";
        for (int i = ters.length()-1; i >= 0; i--)  {
            yeniSayi+=ters.charAt(i);
        }

        System.out.println("Girilen Numananin Tersi: " +yeniSayi);




    }
}
