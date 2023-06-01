package deneme;

import java.util.Scanner;

public class KahveMakinasi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayac=1;
        do {

        System.out.println("Hangi Kahveyi Istersiniz\n" +
                "1.Turk Kahvesi\n" +
                "2.Flitre Kahve\n" +
                "3.Espresso");
        int kahve=input.nextInt();

        if (kahve==1){
            System.out.println("Türk kahvesi hazırlanıyor");
            sayac++;
            break;
        } else if (kahve==2) {
            System.out.println("Filitre Kahve kahvesi hazırlanıyor");
            sayac++;
            break;
        } else if (kahve==3) {
            System.out.println( "Espresso hazırlanıyor");
            sayac++;
            break;
        }



        }


            while (sayac==1);




        System.out.println(" ");

        input.nextLine();



        int evetYadaHayir=1;
        do {
            System.out.println("Sut istermisiniz EVET -HAYIR olıcak selıkdde cevaplayınız ");
            String sut=input.nextLine();

        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Sut Ekleniyor");
            evetYadaHayir++;
        } else if (sut.equalsIgnoreCase("Hayır")) {
            System.out.println("Sut Eklenmıyor");
            evetYadaHayir++;
        }else {
            System.out.println("Hatali giris yaptınız");
            continue;
        }
        }while (evetYadaHayir==1);


        int seker=1;
     do {
         System.out.println("Seker istermısınız");

         String suger=input.nextLine();
         if (suger.equalsIgnoreCase("evet" )){
             System.out.println("Kac seker istiyon");
             int sekersayisi=input.nextInt();


             if (seker==1){
                 System.out.println("Bir adet seker ekleniyor");
                 seker++;
             } else if (sekersayisi==2) {
                 System.out.println("iki adet şeker ekleniyor");
                 seker++;
             } else if (sekersayisi==3) {
                 System.out.println("uc adet seker ekleniyor");
                 seker++;
             } else if (sekersayisi==4) {
                 System.out.println("dort adet seker ekleniyor");
                 seker++;
             } else if (sekersayisi==5) {
                 System.out.println("bes adet seker ekleniyor");
                 seker++;
             }else {
                 System.out.println("Hatalı kod gırdınız");
                 continue;
             }


         } else if (suger.equalsIgnoreCase("hayır")) {
             System.out.println("Şeker eklenmiyor");
             seker++;
             break;
         }else {
             System.out.println("5'ten fazla seker atarsan ictigin sey helvaya donusur");
         }


     }while (seker==1);



int boy=1;
        do {
            System.out.println("Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.");

            String boyut=input.nextLine();

            if (boyut.equalsIgnoreCase("Buyuk")){

                System.out.println("buyuk boy kahve hazırlanıyor");
                boy++;
                break;

            } else if (boyut.equalsIgnoreCase("Orta")) {

                System.out.println("orta boy kahve hazırlanıyor");
                boy++;
                break;

            }else if (boyut.equalsIgnoreCase("Kucuk")) {

                System.out.println("orta boy kahve hazırlanıyor");
                boy++;
                break;


            }else {
                System.out.println("Hatali giris yaptiniz");
            }


        }while (boy==1);


        System.out.println("Kahveniz Hazir AFİYET OLSUN");

    }




    }

