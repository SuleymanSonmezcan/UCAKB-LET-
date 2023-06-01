package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    //kullanıcıdan ıkı sayı alıp dort ılsem yapan ve ıslemlerın sonuclarını ekrana yazdıran kodu yazınız

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("iki sayi giriniz");

        double firstNumber= input.nextDouble();

        double secandNumber = input.nextDouble();


        System.out.println(firstNumber+secandNumber);
        System.out.println(firstNumber-secandNumber);
        System.out.println(firstNumber*secandNumber);
        System.out.println(firstNumber/secandNumber);











    }
}
