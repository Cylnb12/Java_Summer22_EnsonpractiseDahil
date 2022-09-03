package replitCalismalari;

import javax.swing.text.html.HTMLEditorKit;

public class C11_YinelenenHarf {
    public static void main(String[] args) {
        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //
        //Input :
        //
        //String str=“Javaisalsoeasy”
        //
        //Output: a s
        String str = "Javaisalsoeasy";
        String tekrarsız = str.substring(0, 1);
        String tekrarlılar = "";
        String tekrarlılarSon = "";


        for (int i = 1; i < str.length(); i++) {
            if (!tekrarsız.contains(str.substring(i, i + 1))) {
                tekrarsız += str.substring(i, i + 1);

            } else {
                tekrarlılar += str.substring(i, i + 1);//aasas
                tekrarlılarSon = tekrarlılar.substring(0, 1);

            }
        }
        for (int j = 1; j < tekrarlılar.length(); j++) {
            if (!tekrarlılarSon.contains(tekrarlılar.substring(j, j + 1))) {
                tekrarlılarSon += tekrarlılar.substring(j, j + 1);

            }


        }
        for (int j = 1; j < tekrarlılar.length(); j++) {
            if (!tekrarlılarSon.contains(tekrarlılar.substring(j, j + 1))) {
                tekrarlılarSon += tekrarlılar.substring(j, j + 1);

                }

            }
        System.out.println(tekrarlılarSon);
        }

    }


