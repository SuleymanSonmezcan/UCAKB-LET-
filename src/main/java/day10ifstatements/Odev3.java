package day10ifstatements;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String password =input.nextLine();

        if (password=="pwd123!"){
            System.out.println("verilen kod dogru");


        }else {
            System.out.println("Gecersiz karakter");
        }













    }
}
