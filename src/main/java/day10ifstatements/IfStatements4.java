package day10ifstatements;

import java.util.Scanner;

public class IfStatements4 {
    public static void main(String[] args) {


        /*
        Example 1; Kullanıcıdan yas degerini alan ve yasin hangi evrede oldugunu
        asagidaki tabloya gore yazdiran kodu giriniz
        0-4==>bebek
        5-12==> cocuk
        13-20==> yetiskın
        21-30 ==>yaşlı
         */


        Scanner input=new Scanner(System.in);

        System.out.println("lutfen yasınızı giriniz");

        int age= input.nextInt();

        if (age<0){
            System.out.println("Gecerli bir yas giriniz");

        } else if (age<4) {
            System.out.println("bebek");

        } else if (age<13) {
            System.out.println("Cocuk");

        } else if (age<21) {
            System.out.println("genc");

        } else if (age<31) {
            System.out.println("Yetiskin");

        }else {
            System.out.println("Tanımlanmamıs yas");
        }


        /*
    Homework
    1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
    uygun mesaj veren kodu yaziniz

    2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
    Pazar ==> 1. gun , Pazartes ==> 2. gun...

    3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
    1==>January , 2==> February
 */


    }
}
