package day09statements01;

import java.util.Scanner;

public class IfSatatments02 {
    public static void main(String[] args) {

        //ornek: kullanıcan alınan sayınınbekmi ciftmi oldugunu yazdıran kodu olusturunuz


        Scanner input = new Scanner(System.in);



        System.out.println("lutfen bır sayi giriniz");
        int num= input.nextInt();

  /*
        //1.yol


        if (num%2==0){

            System.out.println("cif sayidir");
        }


        if (num % 2 !=0){
            System.out.println("tek sayidir");

        }




         */



        //2.yol konturol edılen condition sayısı daha az  oldugu ıcın tavsıye edilir

        if (num%2==0){
            System.out.println("cıft sayıdır");
        }else {
            System.out.println("tek sayidir");
        }



































    }
}
