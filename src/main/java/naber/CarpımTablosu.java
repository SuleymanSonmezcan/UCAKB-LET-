package naber;

import java.util.Scanner;

public class CarpımTablosu {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);


        System.out.println("Carpmak ısediginiz sayiyi giriniz");

        int num=input.nextInt();

        for (int i=1 ;i<11;i++){
            System.out.println(num+"X"+i+"="+(num*i));


        }

    }
}
