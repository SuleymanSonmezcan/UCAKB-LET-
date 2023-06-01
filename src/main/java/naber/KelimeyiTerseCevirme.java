package naber;

import java.util.Scanner;

public class KelimeyiTerseCevirme {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        String tersMetin="";

        System.out.println("Lutfen kelime yada cumleyi giriniz");

        String kelime=input.nextLine();

        for (int i=kelime.length()-1;i>=0;i--){

            tersMetin+=kelime.charAt(i);

        }


        System.out.println("tersMetin = " + tersMetin);


    }
}
