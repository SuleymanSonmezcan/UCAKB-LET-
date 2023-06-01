package naber;

import java.util.Scanner;

public class AtmSimilasyonu {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //Hesap bilgilerini olusturun


        String kullanicininAdi="kullanici";
        String sifre="sifre";
        double bakiye=1000.0;

        //kullanicidan giris ıste


        System.out.println("Kullanici Adi:");
        String girilenKullaniciAdi=input.nextLine();


        System.out.println("Sifrenizi giriniz");
        String girilenSifre=input.nextLine();

        //Giriş bilgilerini konturol et


        if (girilenKullaniciAdi.equals(kullanicininAdi) && girilenSifre.equals(sifre)) {
            System.out.println("Giris basarili ");


            //parola , sifre: true oldugunda
            while (true){
                System.out.println("Islem Seciniz");
                System.out.println("1.Bakiye sorgula");
                System.out.println("2.Para yatirma");
                System.out.println("3.Para cekme");
                System.out.println("0.cıkıs");

                System.out.println("Seciminizi yapınız");

                int secim=input.nextInt();

                switch (secim){

                    case 1:
                        System.out.println(bakiye);
                        break;
                    case 2:

                        System.out.println("Yatirmak istedıgınız iktar ne kadar");

                        double yatirilanMiktar=input.nextDouble();
                        bakiye+=yatirilanMiktar;

                        System.out.println("Yeni bakiyeniz= "+bakiye);
                        break;

                    case 3:
                        System.out.println("Cekmek istediginiz miktari girin");

                        double cekmekİstenilenMiktar=input.nextDouble();

                      if (bakiye<cekmekİstenilenMiktar){
                          System.out.println("Yetersız bakiye");
                      }else {
                          bakiye-=cekmekİstenilenMiktar;

                          System.out.println("Yeni bakiye"+bakiye);
                      }

                      break;
                    case 0:
                        System.out.println("Cıkıs yapıldı");
                        System.exit(0);
                    default:
                        System.out.println("Gecersiz işlem!");
                }

            }
                      }else {
            System.out.println("Gecersiz  ");
        }




    }
}
