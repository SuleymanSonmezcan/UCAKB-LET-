package deneme;

import java.util.Locale;
import java.util.Scanner;

public class May26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya çift oldugunu yazdirin


        System.out.println("Tam sayı gırınız");
        int num = input.nextInt();



         if (num % 2 == 0) {
            System.out.println("Sayi cifttir");
        } else {
            System.out.println("Sayi tek tir");
        }

*/
//---------------------------------------------------------------------------------------------------------------------

       /* Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gun isimlerini yazdirin
        Örnek: ilkHarf=P output = "Pazar, Pazartesi veya Perşembe" ilkHarf=S output = "Sali"
                *** Buyuk kucuk harf problem olmamasi için toUpperCase methodunu kullanin


        System.out.println("gun ısımlerınden ılk harfını giriniz");
        char days = input.nextLine().toUpperCase().charAt(0);


        if (days=='P'){
            System.out.println("Pazartesi:Persembe:Pazar");

        } else if (days=='S') {
            System.out.println("Salı");
        } else if (days=='C') {
            System.out.println("Carsamba:Cuma:Cumartesi");

        } else  {
            System.out.println("Gecersız karakter");
        }
        */
//---------------------------------------------------------------------------------------------------------------------


/*        oru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Örnek: gun=Pazar output = "Hafta sonu" gun=Sali output = "Hafta ici"
                *** String için equals method'unu kullanin


        System.out.println("Lutfen gun giriniz");

        String day=input.nextLine();

        if (day.equalsIgnoreCase("pazartesi")){

            System.out.println("hafta ici");
        } else if (day.equalsIgnoreCase("salı")) {
            System.out.println("hafta ici");

        }else if (day.equalsIgnoreCase("carsamba")) {
            System.out.println("hafta ici");

        }else if (day.equalsIgnoreCase("persembe")) {
            System.out.println("hafta ici");

        }else if (day.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ici");

        }else if (day.equalsIgnoreCase("cumartesi")) {
            System.out.println("hafta sonu");

        }else if (day.equalsIgnoreCase("pazar")) {
            System.out.println("hafta sonu");

        }else {
            System.out.println("Gecersız karakter gırdınız");
        }
*/
//---------------------------------------------------------------------------------------------------------------------

/*

 Soru 4) Kullanicidan dikdörtgenin kenar uzunluklarini isteyin
 ve dikdörtgenin kare olup olmadigini yazdirin



        System.out.println("Uzun kenari giriniz");
        double uzunKenar=input.nextDouble();
        System.out.println("Kısakenarı gırınız");
        double kİsaKenar=input.nextDouble();

        if (kİsaKenar==uzunKenar){
            System.out.println("Bu bir KAREDİR");
        }else {
            System.out.println("Bu bir dikdotgendir");
        }
*/
//---------------------------------------------------------------------------------------------------------------------

      /*  Soru 5) Kullanicidan bir gun alin eger gun "Cuma" ise ekrana "Muslumanlar için kutsal gun" yazdirin.
        "Cumartesi" ise ekrana "Yahudiler için kutsal gun" yazdirin.
        "Pazar" ise ekrana "Hiristiyanlar için kutsal gun" yazdirin

        System.out.println("Lutfen bır gun giriniz");
        String days=input.nextLine();

        switch (days.toLowerCase()){

            case "pazartesi":
                System.out.println("Norman ınsan gunu");
            break;
            case "salı":
                System.out.println("Norman ınsan gunu2");
                break;
            case "carsamba":
                System.out.println("Norman ınsan gunu3");
                break;
            case "persembe":
                System.out.println("Norman ınsan gunu4");
                break;
            case "cuma":
                System.out.println("Muslumanlar ıcın kutsaldır");
                break;
            case "cumartesi":
                System.out.println("Yahudiler için kutsal gun");
                break;
            case "pazar":
                System.out.println("Hiristiyanlar için kutsal gun");
                break;
            default:
                System.out.println("Bir gun giriniz");


        }


*/

//---------------------------------------------------------------------------------------------------------------------


   /*     Soru 6) Kullanicidan gun ismini yazmasini isteyin.
                Girilen isim geçerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        gun ismi geçerli degilse "Geçerli gun ismi giriniz" yazdirin


        System.out.println("Gun ısmını gırnız");
        String daysName=input.nextLine().toUpperCase();

        switch (daysName){

            case    "PAZARTESİ":
                System.out.println("1PAZ");

                break;
            case    "SALİ":
                System.out.println("2.salı");
                break;
            case    "CARSAMBA":
                System.out.println("3.CAR");
                break;
            case    "PERSEMBE":
                System.out.println("4.PER");
                break;
            case    "CUMA":
                System.out.println("5.CUM");
                break;
            case    "CUMARTESİ":
                System.out.println("6.CMT");
                break;
            case    "PAZAR":
                System.out.println("6.PAZ");
                break;
            default:
                System.out.println("Lutfen gecerlı bır deger gırınız");



        }
*/
//---------------------------------------------------------------------------------------------------------------------
/*
Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
                sayilarin ikisi de     negative ise sayilarin carpimini yazdirin,
                sayilarin ikisi farkli işaretlere sahipse "farkli işaretlerde sayilarla işlem yapamazsin" yazdirin,
                sayilardan sifira eşit olan varsa "sifir çarpmaya gore yutan elemandir" yazdirin.


        System.out.println("lutfen birnci sayı gırınız.");
        int num1=input.nextInt();

        System.out.println("Lutfen ikinci sayıyı gırınız");
        int num2=input.nextInt();


        if (num1>0&&num2>0){
            System.out.println("sonuc="+(num1+num2));

        } else if (num1<0&&num2<0) {
            System.out.println("sonuc="+(num1*num2));
        } else if ((num1>0&num2<0)||(num1<0&&num2>0)) {
            System.out.println("farkli işaretlerde sayilarla işlem yapamazsin");
        } else if (num1==0&&num2==0) {
            System.out.println("sifir çarpmaya gore yutan elemandir");
        }

 */

//---------------------------------------------------------------------------------------------------------------------

/*

        Soru 8) Kullanicidan maaş için bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
        Teklif 80.000’in üzerinde  ise "Kabul ediyorum"
        60 - 80.000 arasinda ise "Konuşabiliriz",
                60.000’nin altinda ise "Maalesef Kabul edemem" yazdirin



        System.out.println("Talep ettıgınız magasi giriniz");
        int maas=input.nextInt();


        if (maas>80000){

            System.out.println("kabul ediyorum");


        } else if ((maas<=80000)&&(maas>60000)) {

            System.out.println("Konuşabiliriz");
        } else if (maas<60000) {
            System.out.println("Maalesef Kabul edemem");
        }

 */
    }
}


