package naber;

import java.util.Scanner;

public class HesapMaskinası {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyigiriniz");

        double num1=input.nextDouble();


        System.out.println("Lutfen ikinci sayiyi giriniz");

        double num2=input.nextDouble();

        System.out.println("Lutfen işlem operatorunu giriniz(+,-,*,/");

        char operator =input.next().charAt(0);


        double sonuc ;

        switch (operator){
            case '+':sonuc=num1+num2;
            break;
            case '-':
                sonuc=num1-num2;
                break;
            case '*':sonuc=num1*num2;
            break;
            case '/': sonuc= num1/num2;

            default:
                System.out.println("Grecersız islem");

                return;
        }

        System.out.println("sonuc = " + sonuc);


    }}