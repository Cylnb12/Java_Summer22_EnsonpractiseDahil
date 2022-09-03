package day10_practice.constructor;

public class BookClass {

    String adi, yazari;
    int yayinYili;

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodla olusturdugunuz obj leri yazdirin


    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }


    @Override
    public String toString() {
        return
                "adi       = " + adi +
                "\nyazari    = " + yazari +
                "\nyayinYili = " + yayinYili+"\n\n" ;
    }

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;

    }

    public static void main(String[] args) {

        BookClass bk1 = new BookClass("Karanliklar ulkesi", "filanca");
        System.out.println(bk1);
        BookClass bk2= new BookClass("bilmem mi", "kimse",1900);
        System.out.println(bk2);


    }
}