package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // kullanicida bir dik dortgenın 2 kenar uzunlugunu alınız
        // a) alanını heasplayınız ==> kısa kenar * uzun kenar
        //b) cevresını hesaplayınız==> 2*kısa + 2*kenar

        Scanner input = new Scanner(System.in);

        System.out.println("dıkdortgenın kısa kenarını gır lan");

        double shortSide= input.nextDouble();


        System.out.println("Dikdortgenın uzun kenar uzunlugunu giriniz");

        double longSide =input.nextDouble();

        System.out.println(shortSide*longSide);


        System.out.println(2*shortSide+2*longSide);

    }
}
