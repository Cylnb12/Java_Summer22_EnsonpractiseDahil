package Asd6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Asd56_Collections12 {
    public static void main(String[] args) {
        /*
        Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

```
Beklenen Çıktı:
```

```
Tree Set Elemanlari:
```

```
kirmizi
```

```
mavi
```

```
sari
```

```
turuncu
```

```
yesil
```
         */

        HashSet hs1=new HashSet<>();
        hs1.add("sari");
        hs1.add("mavi");
        hs1.add("kirmizi");
        hs1.add("yesil");
        hs1.add("mor");
        TreeSet ts1=new TreeSet<>();
        ts1.addAll(hs1);

        Iterator li1=ts1.iterator();
        while (li1.hasNext()){
            System.out.println(li1.next());
        }
    }
}
