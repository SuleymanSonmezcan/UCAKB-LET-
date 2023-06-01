package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrayyler kisa yoldan nasil yapilir


        int arr[]={63,12,318,353,7,100,4};


        System.out.println(Arrays.toString(arr));//[63, 19, 313, 353, 7, 100, 4]

        //Ornek 1: Verilen Arrayde kaç tagne cift sayı kaç tagne tek sayi oldugunu bulan kodu yaziniz

        int sayac=0;

        for (int w:arr) {

            if (w%2==0){
                sayac++;
            }
        }

        System.out.println(sayac);

        System.out.println("Arrayde "+sayac+"adet cift sayi"+(arr.length-sayac)+"adet tek sayi kullanılmıştır");



        //Ornek 2:Size verine bir string arraylerdeki isimlerden 5 character den az character icerenleri console yazdiriniz

        String stdName[]=new String[5];

        stdName[0]="Ajdar";
        stdName[1]="Tom";
        stdName[2]="Ayhan";
        stdName[3]="Cuneyt";
        stdName[4]="Filiz";

        for (String w:stdName) {
            if (w.length()<5){
                System.out.println(w);

            }
        }


        //Ornek 3: Size verilen bir string array deki isimlerini alfabetik siraya konulduktan sonra
        //"F"ise baslıyan isimler haric diger isimleri console a yazdiriniz

        //Note 1:sort() methodu sayisal data type lari kucukten buyuge siralanir(ascending order)
        //Note 2: sort () methode String data type lari alfabetik olarak siralar (alpabetical order)
        //Note 3:ascending order+alpabetical order===> Natural Order
        //Note 4: sort() methode array elemanlarini  "Nathural Order "agore siralar

        Arrays.sort(stdName);//[Ajdar, Ayhan, Cuneyt, Filiz, Tom]

        System.out.println(Arrays.toString(stdName));

        for (String w:stdName) {

            if (w.startsWith("F")){

                continue;
            }
            System.out.println(w);

        }






































    }
}
