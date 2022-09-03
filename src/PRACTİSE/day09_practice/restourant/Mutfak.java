package day09_practice.restourant;

public class Mutfak {

public String yemekler="Adanakebap,urfaciger,kusbasi,kusleme";

public String arasicak="yaylacorba,mercimek,duguncorba,corba";

public String tatlilar="baklava,sutlac,gullac,kazandibi,kunefe";

public String icecekler="ayran,salgam,kola";

    public Mutfak(String yemekler, String arasicak, String tatlilar, String icecekler) {
        this.yemekler=yemekler;
        this.arasicak=arasicak;
        this.tatlilar=tatlilar;
        this.icecekler=icecekler;
    }

    public Mutfak() {
this("adanakebep","mercimek","kunefe","salgam");

    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\n yemekler='" + yemekler + '\'' +
                "\n arasicak='" + arasicak + '\'' +
                "\n tatlilar='" + tatlilar + '\'' +
                "\n icecekler='" + icecekler + '\'' +
                '}';
    }
}
