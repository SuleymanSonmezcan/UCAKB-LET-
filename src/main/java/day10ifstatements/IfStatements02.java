package day10ifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //EXAPMLE


        Scanner input=new Scanner(System.in);

        System.out.println("lutfen kacın gun oldugunu girin");

        byte num= input.nextByte();


        if (num ==1){
            System.out.println("Sunday");
        } else if (num==2) {
            System.out.println("Munday");
        } else if (num==3) {
            System.out.println("Tuesday");

        } else if (num==4) {
            System.out.println("wednesday");
        }else if (num==5) {
                System.out.println("Thursday");
            }else if (num==6) {
            System.out.println("Friday");
        }else if (num==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Hatalı gırıs yaptınız lutfen 1ıle 7 arası bır sayı gırınız");
        }
    }
}