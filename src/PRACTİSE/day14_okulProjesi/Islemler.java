package day14_okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();// STATİC ÇÜNKÜ tüm metotlardan ulasılsın
    static List<Kisi> ogrncList = new ArrayList<>();// parent klasdan tanımlıyoruz listi
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("====================================");
        System.out.println("1- OGRENCI ISLEMLERI");
        System.out.println("2- OGRETMEN ISLEMLERI");
        System.out.println("Q- CIKIS");

        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                break;
            default:
                System.out.println("hatali giris:(");
                girisPaneli();
                break;

        }
    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu " + kisiTuru + " lutfen asagidaki islemleri seciniz");


        System.out.println("============= ISLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LISTELEME\n" +
                "         4-SILME\n" +
                "         5-ANA MENU\n" +
                "         Q-CIKIS");

        System.out.println("islem tercihi girin: ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;

            case 2:
                arama();
                islemMenusu();
                break;


            case 3:
                listeleme();
                islemMenusu();
                break;

            case 4:
                silme();
                islemMenusu();
                break;

            case 5:
                girisPaneli();
                break;

            case 0:cikis();
                break;

            default:
                System.out.println("guzel birsey girin");
                islemMenusu();
                break;

        }
    }

    private static void cikis() {

            System.out.println("***** YINE BEKLERIZ *****");


    }

    private static void silme() {
        System.out.println("**** " + kisiTuru + " Silme sayfasina hosgeldin");
        boolean flag=true;// bayrak havada aksiyon basla

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Lutfen silmek istedigin ogrencinin  kimlik no gir");
            String silinecekKimlikNo=scan.next().replaceAll(" ","");
            for (Kisi each:ogrncList
                 ) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("Silinen ogrenci "+each.getAdSoyad());
                    ogrncList.remove(each);
                    flag=false;
                    break;
                }
            }
            if (flag){// eger girilen tc listede yok ise bu if calisir
                System.out.println("Bu tc ile ogrenci yok , silinemedi");
            }



        }else {//ogretmen islemleri icin kontrol
            System.out.println("Lutfen silmek istedigin ogretmenin kimlik no gir");
            String silinecekKimlikNo=scan.next().replaceAll(" ","");
            for (Kisi each:ogrtmnList
            ) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("Silinen ogretmen "+each.getAdSoyad());
                    ogrtmnList.remove(each);
                    flag=false;
                    break;
                }
            }
            if (flag){// eger girilen tc listede yok ise bu if calisir
                System.out.println("Bu tc ile ogretmen yok , silinemedi");
            }
        }


    }

    private static void listeleme() {
        System.out.println("****"+ kisiTuru+" Listeleme sayfasina hosgeldiniz");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Ogrenci listesi :"+ogrncList);
        }else for (Kisi each:ogrtmnList) {
            System.out.println("Ogretmen lIstesi :"+each.toString());
        }

    }

    private static void arama() {
        System.out.println("**** " + kisiTuru + " arama sayfasina hosgeldin");
        boolean flag = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("kimlik no giriniz: ");
            String arananKimlikNo = scan.next().replaceAll(" ", "");// bosluk girme ihtimaline karsi tedbir
            for (Kisi each : ogrncList) {
                if (each.getKimlikNo().equals(arananKimlikNo)) {//aranan ogrenci listesinde var mı
                    System.out.println("aradiginiz ogrenci: " + each.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) {//flag true ise calisir yani arana tc ile ogrenci yoktur
                System.out.println("aranan tc ile ogrenci yok ");
            }
        } else {//ogretmen icin
            System.out.println("kimlik no giriniz: ");
            String arananKimlikNo = scan.next().replaceAll(" ", "");// bosluk girme ihtimaline karsi tedbir
            for (Kisi each : ogrtmnList) {
                if (each.getKimlikNo().equals(arananKimlikNo)) {//aranan ogrenci listesinde var mı
                    System.out.println("aradiginiz ogretmen: " + each.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) {//flag true ise calisir yani arana tc ile ogrenci yoktur
                System.out.println("aranan tc ile ogretmen yok ");
            }
        }
    }


        private static void ekle() {//bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
            System.out.println("**** " + kisiTuru + " ekleme sayfasina hosgeldin");
            System.out.println("isim soyisim giriniz");
            String adSoyad = scan.next();
            System.out.println("soyismini giriniz");
            String soyad = scan.next();
            adSoyad = adSoyad + " " + soyad;
            System.out.println("kimlik no giriniz");
            String kimlikNo = scan.next();
            System.out.println("yas giriniz");
            int yas = scan.nextInt();
            if (kisiTuru.equals("OGRENCI")) {
                System.out.println("ogrenci numarasi gir");
                String ogrenciNo=scan.next();

                System.out.println("Sinif giriniz");
                String sinif= scan.next();
                Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
                ogrtmnList.add(ogrenci);
            } else {
                System.out.println("bolum gir");
                String bolum = scan.next();
                //scan.nextLine();//dummy kod hata almamak icin
                System.out.println("sicil no gir");
                String sicilNo = scan.next();
                Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
                ogrtmnList.add(ogretmen);
                System.out.println(ogrtmnList);

            }
        }
    }

