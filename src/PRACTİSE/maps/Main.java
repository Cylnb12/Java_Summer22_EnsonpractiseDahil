package maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> kisiBilgileriListeMap=ReusableClass.mapOlusturMap();
        System.out.println(kisiBilgileriListeMap);


        //hangi sinifta kac kisi var?
        Map<String,Integer> sinifKisiSayisi= ReusableClass.sinifKisiSayisi(kisiBilgileriListeMap);
        System.out.println(sinifKisiSayisi);


        //map in icindeki 3A lari komple 3B lere tasiyalim
        Map<Integer,String> map3AOldu3B= ReusableClass.map3AOldu3B(kisiBilgileriListeMap);
        System.out.println(map3AOldu3B);

        //tum kisilerin kilo ortalamasini alalim
        Integer tumKisilerOrtalamKilo= ReusableClass.tumKisiOrtalamKilo(kisiBilgileriListeMap);
        System.out.println("kisilerin kilo ortalamalari = "+tumKisilerOrtalamKilo);

        //ortalamalarin uzerinde olan kisiler
        Map<Integer,String> ortalamaninUzerindeKilodaOlanlarMap= ReusableClass.ortalamaninUzerindeKilodaOlanlarMap(kisiBilgileriListeMap);
        System.out.println("Ortalamanin uzerinde kiloya sahip kisiler ="+ortalamaninUzerindeKilodaOlanlarMap);

        //ortalamalarin uzerinde olan kisileri ve kilolarini yazdir
        List<String> ortalamaninUzerindeKilodaOlanlarList= ReusableClass.ortalamaninUzerindeKilodaOlanlarList(kisiBilgileriListeMap);
        System.out.println("Ortalamanin uzerinde kiloya sahip kisiler ="+ortalamaninUzerindeKilodaOlanlarList);



    }
}
