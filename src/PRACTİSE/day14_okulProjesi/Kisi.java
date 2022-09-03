package day14_okulProjesi;

public class Kisi {
    private String adSoyad;
    private String kimlikNo;
    private int yas;//ortak özellikler

    public Kisi(String adSoyad, String kimlikNo, int yas) { // private variable lari public cons ile ulasılabilir yaptık
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }
    public Kisi(){// garanti olsun diye parametrsiz cons olusturuyoruz

    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
