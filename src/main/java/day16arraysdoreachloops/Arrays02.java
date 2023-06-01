package day16arraysdoreachloops;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        //Example 1:String Array olusturun icine 5 tane eleman ekleyın ,ilk eleman
        //son elemean icerdigi karakter sayiarini taplamini ekrana yazdiriniz


        String arr[] = new String[5];


        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "Englih";
        arr[4] = "Art";


        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length - 1].length());


        // Ornek 2: String bir array olusturun , icine 5 tane elemean ekleyin ,//
        // icerdigi karakter sayilarini ekrana yazdiriniztum elemanlari


        int totalChar = 0;

        String brr[] = new String[5];


        brr[0] = "Miami";
        brr[1] = "Istanbuş";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";

        //1.yol for loop

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }

        System.out.println(totalChar);


        //2. yol FOR EACH LOOP (enhanced loop
        // baslangıc degeri loopun calısma sartı ve increment/decrement kismini kendisi halleder
        //for-each-loop"Array"lerde ve "collection"lardakullanilir

/*
        for (DataType  w: arr/collection ){
            //calısıcak kotlar
        }
*/


        int sum = 0;

        for (String w : brr) {
            sum = sum + w.length();
        }

        System.out.println(sum);//30





        //Ornek 3:Notlar adında ıntıeger bir array olusturunuz icine 6 tagne not yerlestırınız
        //ve notlari ortalamasını alınız

        int notlar []=new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;


        System.out.println("Arrays.toString(notlar) = " + Arrays.toString(notlar));

        int toplam=0;




            for (int w:notlar){

                toplam=toplam+w;

            }

        System.out.println(toplam/notlar.length);








    }





}
