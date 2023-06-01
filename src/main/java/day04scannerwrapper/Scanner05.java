package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanıcan alacagımız 5 basamaklı bır sayının
        // ılk ıkı ıle son ıkı basamagındaki rakamlarin yoplamını yazdiran kodu yazınız


        Scanner input =new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz");

        int number= input.nextInt();



        //bir sayinin son rakaminin
        //%==> modulus operator solunda bulunan sayinin sagında bulunan sayıyın bomunde kalani verir
        // bir tamsayıı bır tam sayıya bolersenız java sonucu kesınlıkle tam sayı yapar
        // java yuvarlama yapmaz ,ondalıklı kısmı ıptal eder
        //dolayısıyla bır tam sayıyı 10 bolersek bırler sabamagını sılmıs oluruz


        //son rakam
        int birlerBasamagi= number%10;
        number= number/10;


        //sondan 2 rakami al
          int sondanIkinci=  number%10;

          //sayıyı kuculkt

        number= number/10;

        //sondan 3.rakami al

        int sondanUcuncu=  number%10;

        //sayiyi kucult
         number=   number/10;

         //sondan 4. rakami al

        int sondanDorrduncu= number%10;

        // sayi kucult

       number= number/10;

       //sondan besinci rakami al

        int sondanBesinci=number%10;
        //son rakam oldugu icin kusultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorrduncu+birlerBasamagi+sondanIkinci);

        //home work
        //1) kullanıcıdan aldıgınız 3 tane sayının ortalamasını bulan kondu yaziniz

        //2) kullanicidan aldıgınız 3 basamakli bir sayınbın rakamlari topşamini bulunuz
        //ORN ==>321



















































    }
}
