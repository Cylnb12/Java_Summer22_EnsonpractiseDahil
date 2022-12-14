package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="java";
        System.out.println(sb1.equals(sb2));//false


        System.out.println(sb1.equals(sb1));//true

        //StringBuilder da equals methodu ancak ayni obje ayni deger olursa true doner
        //String deki gibi dusunmemek lazim
        System.out.println(sb1.equals(str));//false

        // StringBuilder ile String  icin equals methodu surekli false olur


        sb1.trimToSize();// kapasite ve lenght i birbirine esitler

        System.out.println(sb1);

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));//-4

        /*
        * compare To methodu iki StringBuilder i bastan baslayarak harf
        * harf karsilastirir
        *
        *ilk harfler ayni ise ikincilere onlar ayni ise ucunculere gecer
        * ve ilk farkli olan harfe kadar gider
        *
        * farkli olan iki harfin asci kodlari arasindaki farki verir
        *
        * eger hic farkli harf yoksa sonuc olarak sifir(0) dondurur*/

    }
}
