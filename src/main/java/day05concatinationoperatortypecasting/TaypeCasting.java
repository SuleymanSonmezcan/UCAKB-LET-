package day05concatinationoperatortypecasting;

public class TaypeCasting {


    /*
    Numeric primitive data type larının bırbırıne donusturulmesıne "Type Casting"  denir

     Numeric (Sayisal) primitive Data type lar :  byte -short -int long-flooat-double
     */

    //Note 1: Kucukm data type larini buyuk data typelarına cevırmeyi java otomatik olarak yapabilir
    //Bu isleme "AutoWidening"(otomatik genişletme) denir.

    //Nte 2) Buyuk Dta type larını kucuk data type larına cevırmek rısklı bır istir ,java bu riskli
    //isi otomatik olarak yapmaz, bu işlemi kod yazanlar yapar
    //Bu isleme "ExpicitiNarrowing"(Acıktan daratma)denir.


    public static void main(String[] args) {


        //byte data type  ina ceviriniz


         byte age=13;

         int ageInt= age;   //AutoWidening

        //int data type in short data typeina ceviriniz

        int weight=488;
        short weightShort=(short)weight;


        //int data type inn float data tyina ceviriniz

        int population =77000;
        float populationfloat= population;
        System.out.println(populationfloat);



        //double data type nin short data type ina ceviri
        double number=12.98;
        System.out.println(number);
        short numbershort=(short) number;


        System.out.println(numbershort);

        //orn

        short nun =260;

        System.out.println(nun);
        byte nunByte=(byte) nun;
        System.out.println(nunByte);





        //Note; donusum yaptıgınız sayi(260), donusturdugunuz data type nin sinirlari disinda ise
        //java kullandıgınız sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yenı degerinizdir



    }










}
