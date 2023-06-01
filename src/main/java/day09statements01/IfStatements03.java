package day09statements01;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //ornek: Kullanicidan vermis oldugu character buyu harf ise ekrana "Buyuk Harf",
        //kucuk hard ise ekrana "Kucuk hard "yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir character giriniz");
        char ch=input.next().charAt(0);
//1.yol
        /*
        if (ch>='A'&&ch<='Z'){

            System.out.println("Buyuk harf");


        }

        if (ch>='a'&&ch<='z'){

            System.out.println("Kucuk harf");
        }
*/

//2,yol

           if (ch>='A'&&ch<='Z'){

            System.out.println("Buyuk harf");

            }else if (ch>='a'&&ch<='z'){
               System.out.println("Kucuk Harf");

               }else {
               System.out.println("Harf Degil ");
           }
























    }

}
