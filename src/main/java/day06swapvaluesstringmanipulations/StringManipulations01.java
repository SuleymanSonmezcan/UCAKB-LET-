package day06swapvaluesstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {

    public static void main(String[] args) {


//String bir non-primitive data type dir ve ayni zamanda bir classdir.

        String s = "Java is easy";

        //Ornek 1: "s" String indeki tum characterleri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek 2: "s" String indeki tum characterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek 3: "s" String indeki ilk characteri aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek 4: "s"  Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazidiriniz
        char secondChar =s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s
        System.out.println(""+secondChar+secondLastChar);

        //Ornek 5: "s" String inde kullaninlan  toplam karakter sayisini bulunuz


        int sLength= s.length();
        System.out.println(sLength);

        //orrnek 6: "s" String indeki ilk dort karakteri aliniz


        //substring (0,4)==> 0 ilk index dahil , 4 ikinci dahil degildir



        String sub1= s.substring(0,4);

        // ornek7: s Strıng indeki is kelımesıbnı alıız

        String is= s.substring(5,7);

        System.out.println(is);



        //Ornek8: "s"String indeki easy kelimesini aliniz

        String easy=s.substring(8,12);

        System.out.println(easy);

        //ikinci yok
        // Bir karakterden başlayıp String in sonuna kadar almak ısterseniz ikinci indexi yazdiriniz
        // s.substring(8,12); yerine substring yazdir boylece başlangic index inde itibaren sonuna kadar alir



        String sub4= s.substring(8);
        System.out.println(sub4);



        //Ornek 9; "s"String inde "money" kelimeside varmi konturol edınız

        boolean  isExist=   s.contains("money");

        System.out.println(isExist);

        //Ornek10: "s "String inin belli bir harf ile başlayıp başlamadigini kontrol ediniz

        boolean isStard= s.startsWith("Java");
        System.out.println(isStard);



        //Ornek11: "s "String 6 karakterden itibagren belli bir harf başlayıp başlamadigini kontrol ediniz

        //soru: 5. index dahil olmak uzere  i karakteri ile baslıyan başlamadigina konturol ediniz


        boolean is1 =s.startsWith("i",5);
        System.out.println(is1);


        boolean conturol= s.startsWith("a",3);


        System.out.println(conturol);












    }


}