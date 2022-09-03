package maps;

import java.security.KeyStore;
import java.util.*;

public class ReusableClass {

   public static Map<Integer,String> mapOlusturMap(){

       Map<Integer,String> kisiBilgileriListeMap=new HashMap<>();
       // numara,"sinifi, OgrenciAdi, kilo"
       kisiBilgileriListeMap.put(11,"3A, Ali, 76");
       kisiBilgileriListeMap.put(22,"3A, Mustafa, 80");
       kisiBilgileriListeMap.put(33,"3A, Omer, 90");
       kisiBilgileriListeMap.put(44,"2B, Mustafa, 70");
       kisiBilgileriListeMap.put(55,"2A, Tarik, 68");
       kisiBilgileriListeMap.put(66,"2A, Zeynep, 67");
       kisiBilgileriListeMap.put(77,"4B, Mucella, 56");
       kisiBilgileriListeMap.put(88,"1C, Sefik, 57");
       kisiBilgileriListeMap.put(99,"1C, Ayse, 86");
       kisiBilgileriListeMap.put(10,"2B, Zubeyde, 97");
       kisiBilgileriListeMap.put(12,"4B, Ummahani, 88");

       return kisiBilgileriListeMap;
   }


    public static Map<String, Integer> sinifKisiSayisi(Map<Integer, String> kisiBilgileriListeMap) {
        Collection<String> valueCollection=kisiBilgileriListeMap.values();
        Map<String,Integer> sinifKisiSayisi=new TreeMap<>();
        String[] valueSplit;
        Integer sira = null;
        for (String each:valueCollection
        ) {
            valueSplit=each.split(", ");
            if (!sinifKisiSayisi.containsKey(valueSplit[0])){
                sinifKisiSayisi.put(valueSplit[0],1 );
                sira=sinifKisiSayisi.get(valueSplit[0]);
            }else {sinifKisiSayisi.put(valueSplit[0],++sira );}
        }
        return sinifKisiSayisi;
    }

    public static Map<Integer, String> map3AOldu3B(Map<Integer, String> kisiBilgileriListeMap) {


       String[] valueSplit;
       Collection<String> valueList=kisiBilgileriListeMap.values();

        Set<Map.Entry<Integer, String>> entrySeti=kisiBilgileriListeMap.entrySet();

        String eachValue;
        for (Map.Entry<Integer, String> each:entrySeti
             ) {
            eachValue= each.getValue();
            eachValue=eachValue.replace("3A","3B");
            each.setValue(eachValue);
        }
        for (Map.Entry<Integer, String> each:entrySeti
             ) {
            kisiBilgileriListeMap.put(each.getKey(),each.getValue());
        }
        return kisiBilgileriListeMap;


    }

    public static Integer tumKisiOrtalamKilo(Map<Integer, String> kisiBilgileriListeMap) {

       Collection<String> valueList=kisiBilgileriListeMap.values();

       String[] valueSplit;
       Integer toplamort=0;
        for (String each:valueList
             ) {
            valueSplit=each.split(", ");
            Integer kilo=Integer.parseInt(valueSplit[2]);
            toplamort+=kilo;
        }
        toplamort/= valueList.size();
        return toplamort;
    }

    public static Map<Integer, String> ortalamaninUzerindeKilodaOlanlarMap(Map<Integer, String> kisiBilgileriListeMap) {



        String[] valueSplit;
        Integer ortalama=tumKisiOrtalamKilo(kisiBilgileriListeMap);
        Map<Integer, String> ortalamaninUzerindeKilodaOlanlarMap=new TreeMap<>();
        Set<Map.Entry<Integer, String>> entrySetimiz=kisiBilgileriListeMap.entrySet();

        for (Map.Entry<Integer, String> each:entrySetimiz
        ) {
            valueSplit=each.getValue().split(", ");
            Integer kilo=Integer.parseInt(valueSplit[2]);
            if (kilo>ortalama){
                ortalamaninUzerindeKilodaOlanlarMap.put(each.getKey(), each.getValue());
            }

        }
       return ortalamaninUzerindeKilodaOlanlarMap;
    }

    public static List<String> ortalamaninUzerindeKilodaOlanlarList(Map<Integer, String> kisiBilgileriListeMap) {

        String[] valueSplit;
        Integer ortalama=tumKisiOrtalamKilo(kisiBilgileriListeMap);
        Map<Integer, String> ortalamaninUzerindeKilodaOlanlarMap=new TreeMap<>();
        Set<Map.Entry<Integer, String>> entrySetimiz=kisiBilgileriListeMap.entrySet();

        List<String> isimKilo=new ArrayList<>();
        for (Map.Entry<Integer, String> each:entrySetimiz
        ) {
            valueSplit=each.getValue().split(", ");
            Integer kilo=Integer.parseInt(valueSplit[2]);
            if (kilo>ortalama){

                isimKilo.add(valueSplit[1]+" - "+valueSplit[2]);
            }

        }

        return isimKilo;
    }
}
