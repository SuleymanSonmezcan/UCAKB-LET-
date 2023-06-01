package day03methodobjectcreationscanner;

//java nın util kutuphanesınden scanner class inport edilir

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1.aadim Scanner class tan object olusturur

            Scanner input= new Scanner(System.in);
            //2. Adim kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("lutfen yasınızı giriniz");


        //3. adim Uygun methode kullanarak kullanıcının verdıgı data yi memory e yerleştiriniz



       byte age= input.nextByte();
        System.out.println("age = " + age);

    }
}
