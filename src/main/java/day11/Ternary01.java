package day11;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {


        //Ternary Statement


        //Ornek 1: sayi 10 kucuk ıse konsala kucuk yazdırın degılse kucukdegil yazdirin1
        // -------id else cozumu---

        int num =3;

        if (num<10){
            System.out.println("Kucuk");
        }else {
            System.out.println("kucuk degil");
        }

        //2.yol Turnery
        // Condition ? Condition true ise calisir : condition false ise calisir
        String sonuc =  num<10 ?            "KUCUK"                        :"BUYUK";
        System.out.println(sonuc);



        //ornek2: sayi cift ise consola "cift" ,tek ise tek yazdiriniz


       int k=13;

       if (k%2==0){
           System.out.println("cift");

       }else {
           System.out.println("Tek");
       }


        //ternary cozumu

        String rusalt=k%2==0? "cift":"Tek";

        System.out.println(rusalt);



        //Ornek 3 : sayı sıfırda    buyuk ise "pozitif" degilse "pozitifdegil" yazdiriniz


        int num3= 4;

        System.out.println(num3>0?"pozitif" :"pozitif degil" );




        // kulaanıcıdan ıkı sayı alınız, "buyuk olmayan "8kucuk veya esit olanı) sayıyı yazdırınız



        Scanner input= new Scanner(System.in);

        System.out.println("iki sayi griniz");

        double a= input.nextDouble();

        double b= input.nextDouble();




        //1. yol

        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);

        }


        //2,yol Ternary

        double q1= a<b?a:b;

        System.out.println(  q1);


    }
}
