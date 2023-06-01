package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek1:Kullanicinin coklu datayi bir arraye yerleitirebilmesi istedigi zaman durdurabılmesi icin gereken kodu yaziniz

        /*
        1)Kullanıcıdan data almak ıcın Scanner objesi olustur
        2)Coklu data yı yerlestırmek ıcın bir array olusturmalıyız
        3)Array olusturabılmek ıcın kullanıcıdan array e kac tane eleman koyacagini almaliyiz
        4) Loop olusturup eleman ekelme ıslemını tekrak tekrar yapabilmeliyiz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen eklemek ıstedıgınız ogrencı sayısını gırınız");
        int numOfElements=input.nextInt();

        String stdName[]=new String[numOfElements];

        System.out.println("islemi durdurmak icin 'q' ya basiniz ");


        for (int i = 0; i <stdName.length; i++) {

            System.out.println((i+1)+" .ogrencinin ismini giriniz");
            String name = input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdName[i]=name;
            }
        }

        System.out.println(Arrays.toString(stdName));




    }
}
