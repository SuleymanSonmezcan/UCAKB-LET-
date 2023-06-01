package day04scannerwrapper;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 tane sayi gir");

        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int ortalama= (num1+num2+num3)/3;
        System.out.println((double) ortalama);









    }

}


