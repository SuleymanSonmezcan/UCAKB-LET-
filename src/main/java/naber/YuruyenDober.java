package naber;

import java.util.Scanner;

public class YuruyenDober {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı girin: ");
        double base = input.nextDouble();

        System.out.println("İkinci sayıyı girin: ");
        double exponent = input.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " üzeri " + exponent + " = " + result);


        }























    }


