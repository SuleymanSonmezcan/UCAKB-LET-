package day08stringmanipulationmemoryusageifstatement;


import java.util.Scanner;

public class Odev {


    public static void main(String[] args) {


        //HOME WORK1

         String a ="01merhabalar ben buyerlerden biriyim02";


         String  homeWork1=  a.replaceAll("[^0-9]","a");

        System.out.println("homeWork1 = " + homeWork1);


        //Home Work2

        String s="Bir baskadir benım ugandam";
        int uzunlugu=s.length();
        System.out.println(uzunlugu);

       String s3= s.substring(1,uzunlugu-1).toUpperCase();
        System.out.println(s3);


        //HOME WORK 3

        char ilkKarakter=a.charAt(0);
        char sonKarakter=a.charAt(35);
        System.out.println(ilkKarakter+sonKarakter);


        //HOME WORK 4

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir şehir ismi girin: ");
        String sehirIsmi = scanner.nextLine();
        String duzenlenmisIsmi = sehirIsmi.substring(0, 1).toUpperCase() + sehirIsmi.substring(1).toLowerCase();
        System.out.println("Düzenlenmiş şehir ismi: " + duzenlenmisIsmi);




        /*
        5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

         */








        //home work



        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen passwordunuzu giriniz...");

        String s1=input.nextLine();


        boolean first =s1.length()>6;

        boolean second=s1.replaceAll("[^A-Z]"," ").length()>0;
        System.out.println("second = " + second);

        boolean third =s1.replace("[^a-b]"," ").length()>0;
        System.out.println("third = " + third);

        boolean forth =s1.replace("[^0-9]"," ").length()>0;
        System.out.println("forth = " + forth);

        System.out.println(( "passwoed gererlimi"+(first&&second&&third&&forth)));

    }
}
