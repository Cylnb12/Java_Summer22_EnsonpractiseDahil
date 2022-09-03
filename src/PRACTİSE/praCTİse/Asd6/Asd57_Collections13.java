package Asd6;

import java.util.Iterator;
import java.util.TreeSet;

public class Asd57_Collections13 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

```
Beklenen Çıktı:
```

```
beyaz
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
siyah
```

```
yesil
```
         */
        TreeSet ts1=new TreeSet<>();
        ts1.add("yesil");
        ts1.add("mavi");
        ts1.add("kirmizi");
        ts1.add("sari");
        ts1.add("beyaz");
        ts1.add("siyah");
        Iterator it1=ts1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
