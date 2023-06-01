package day10ifstatements;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Haftanın hangı gunu oldugu yazınız");

        String gun=input.next();

        if (gun.equalsIgnoreCase("Pazartesi") ){
            System.out.println("1");


        } else if (gun.equalsIgnoreCase("Salı")) {
            System.out.println("2");
        }
        else if (gun.equalsIgnoreCase("carsanba")) {
            System.out.println("3");
        }
        else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("4");
        }
        else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("5");
        }
        else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("6");
        }
        else if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("7");
        }else {

            System.out.println("gecerli bir veri giriniz");
        }
    }
}
