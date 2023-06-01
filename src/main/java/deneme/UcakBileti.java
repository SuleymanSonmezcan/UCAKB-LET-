package deneme;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Hangi sehre gitmek istediginizi yaziniz\nB==>1\nC==>2\nD==>3");

        int goToCitiy=input.nextInt();

        System.out.println("Yasinizi giriniz");
        int yas= input.nextInt();

        System.out.println("Bileti gidis donusmumu olucak\nEvet==>1\nHayir==>2");

        int gitDon=input.nextInt();

        double fiyat= 0;

        if (goToCitiy==1){

            fiyat=500*0.10;

        } else if (goToCitiy==2) {
             fiyat=700*0.10;
        }
        else if (goToCitiy==3) {
            fiyat=900*0.10;
        }else {
            System.out.println("Gecersiz veri");
        }



        double yeniFiyat=0;

        double num=0;

        if (yas>0&&yas<12){

            yeniFiyat=fiyat*0.50;
            num= (fiyat-yeniFiyat);

        } else if (yas>12&&yas<24) {
            yeniFiyat=fiyat*0.10;
            num= (fiyat-yeniFiyat);
        }
        else if (yas>24) {
            yeniFiyat=fiyat*0.30;
            num= (fiyat-yeniFiyat);
        }else {
            System.out.println("Gecersiz veri");
        }

        double cokAlAzode=0;
        if (gitDon==1){

            cokAlAzode=num*0.20;
            System.out.println("Indirimsiz fiyat"+fiyat);
            System.out.println("Indirimli fiyat="+(num-cokAlAzode)+"$");

        } else {
            System.out.println("Odenecek tutar="+num+"$");
        }


    }

}
