package naber;

import java.util.Scanner;

public class MusteriKarti {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);


        System.out.println("Kac urun aldınız");

        double urunAdeti=input.nextInt();


        System.out.println("Urun fiyatını giriniz");

        double urunFiyat=input.nextDouble();


        System.out.println("Musteri kartiniz varmi  var veya yok  olacak sekılde");

        String musteriKarti= input.next();


        //odeme hesaplama kısmı



        if (musteriKarti.equalsIgnoreCase("var")){


            if (urunAdeti>=10){
               //urun adeti 10 buyuk ve musteri karti varsa (%20)

             double toplam=  urunFiyat*urunAdeti;

             toplam=toplam-(toplam*20)/100;
                System.out.println("toplam = " + toplam);


            }else if (urunAdeti<10){
                //musteri karti arsa ve urunu 10 dan azsa (%15)

                double toplam=urunAdeti*urunFiyat;

                toplam=toplam-(toplam*15)/100;

                System.out.println("toplam = " + toplam);
            }






        }else if (musteriKarti.equalsIgnoreCase("yok")){


            //musteri kati yok urun adet, 10 dan fazla(%15)
            if (urunAdeti>=10){

                double toplam=urunAdeti*urunFiyat;

                toplam=toplam-(toplam*15)/100;
                System.out.println("toplam = " + toplam);


            } else if (urunAdeti<10) {

                //musteri karti yok ve urun sayısı on dan az
                double toplam=urunAdeti*urunFiyat;


                toplam=toplam-(toplam*10)/100;
                System.out.println("toplam = " + toplam);


            }


        }else {
            System.out.println("Gecersız karakter gırdınız");
        }



































    }
}









