package day10ifstatements;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.println("Ay sayısını giriniz");

        byte num=input.nextByte();


        if (num==1){
            System.out.println("ocak");
        } else if (num==2) {
            System.out.println("Subat");

        } else if (num==3) {

            System.out.println("Mart");

        } else if (num==4) {
            System.out.println("Nisan");

        }
        else if (num==5) {
            System.out.println("Mayis");

        }
        else if (num==6) {
            System.out.println("Haziran");

        }
        else if (num==7) {
            System.out.println("Temmuz");

        }
        else if (num==8) {
            System.out.println("Agustos");

        }
        else if (num==9) {
            System.out.println("Eylul");

        }
        else if (num==10) {
            System.out.println("Ekim");

        }
        else if (num==11) {
            System.out.println("Kasım");

        }
        else if (num==12) {
            System.out.println("Aralik");

        }else {

            System.out.println("Lutfen gecerli bir karakter giriniz");
        }



    }
}
