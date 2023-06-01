package day04scannerwrapper;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class Odev {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("3 basamaki sayi girin");


        int number = input.nextInt();

        int numberOne=number%10;

        number=number/10;

        int numberTwo=number%10;


        number=number/10;

        int number3 = number;


        System.out.println((numberOne+numberTwo+number3)/3);















    }


}