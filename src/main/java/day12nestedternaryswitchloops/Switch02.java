package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Note: ka-javada kodlarımızı yazarkennested yapılardan mumkun oldugunca uzak durmalıyız
        //cunku bu tarz sorular uygulamayı yavaşlatır(time Consuming)
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December

        Scanner input =new Scanner(System.in);

        System.out.println("Baslangıc ayını gırınız");
        int numOfMount=input.nextInt();

        switch (numOfMount){
            case 1:
                System.out.println("January");

            case 2:
                System.out.println("February");

            case 3:
                System.out.println("March");

            case 4:
                System.out.println("April");

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 9:
                System.out.println("September");

            case 10:
                System.out.println("October");

            case 11:
                System.out.println("Novenber");

            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerlı ay numarası gırınız");


                /*
                Note: "switch" condition parantezı ıcıdnde strıng ıni byte shorth char kullanılabılır
                note : "switch" condition parantezı ıcıdnde long , boolean ,float
                 */





        }














    }
}
