package replitCalismalari;

public class C17_ilkNtoplam {
    public static void main(String[] args) {
        //soru:1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        //
        //OutPut:
        //
        //Sayilarin Toplami : 5050
        int bas=1;
        int son=100;
        int temp=bas;
        int toplam=0;
        while (temp<=son) {
            toplam+=temp;
            temp++;
        } System.out.println("Sayilarin toplami : "+toplam);




    }
}
