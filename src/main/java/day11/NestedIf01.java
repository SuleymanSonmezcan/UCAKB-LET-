package day11;

import java.util.Scanner;

public class NestedIf01 {

    public static <Scanne> void main(String[] args) {
       /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */


       Scanner input =new Scanner(System.in);

        System.out.println("Lutfen cınsıyetinizi giriniz");


        String gender=input.next();

        System.out.println("lutfen yasinizi girniz");

        int age= input.nextInt();

        if (age>0||age>120){
            System.out.println("Lutfen 0 yas ile 120 arasi bir yas giriniz");
        }else {
            System.out.println("Yasi 0 ile 120 arası bır sayı gırınız");
        }



        if (gender.equalsIgnoreCase("Kadın")){

            if (age>60){

                System.out.println("EMEKLI OLABILIR");
            }else {
                System.out.println("Calısmalı");
            }
        } else if (gender.equalsIgnoreCase("Erkek")) {

            if (age>65){

                System.out.println("EMEKLİ OLABİLİR");
            }else {
                System.out.println("kesinlikle calismali");
            }


    }


}
    }
