package day01variables01;

public class Variables01 {
    public static void main(String[] args) {
        // açıklama satırı\\

        /*java bu satırlarıda okumaz

         */

        //varibla nasıl olusşturulur

        // Data type+ variable name+ASSİGNMENT Operator( atama operatörü) +Variable degeri+Noktali virgül

          int               age              =                                     13                 ;

        //java cümlesi==>atement
        // Dilbilgisindeki nokta ne isie java daki ; ayni şedir
        // Eger variable declaration yapar,Assigment yapamazsanaız java kendini defuult degerini koyar
        //default deger sayılar için sifirdir
        // juava da "=" assigmment operator dir. ve java  bu operatoru gordugu zamansag tarafı çalıştırır
       // ve sagdaki deger alırsoldakı degeri alır
       // java da esittir demek "=="    matamatikte "=" , javada "=="
       //data type + variableName ==> Variable declariton
       //Assignment Operator (=) + Variablen deger







        String ogrenciAdı ="Alican" ;

        //Stringlere verilen degerler daima  çift tırnak ("") içine alaınmalıdır
        // strıngler"Default value " (=> varsarsayılan deger) "null" dir
       /*string bır varible oluşturuldugunda cugu zaman
        */

        // char data type
        //tek karakterler için kullanıle:Sayı,sembol yada harf fark etmez
//ornek ==> A,x,5,?
//ornek char data tipine bir ismın ilk harfı olarak bır vearıble oluşturunuz ve bır deger atayıız


    char isminHarfı ='1';

   char merhaba='3';


   // boolean data type :
  //boolean sagdece iki deger alabılırlerİ true veda falst
// OYUZDEN İSİMLENDIRME YAPILIRKEN İLGİzce olarakmı? soru eki anlamında başına ıs konnur

 boolean isRetired= false;


  //byte data type
//tam sayılar için kullanılır, hafızada 1 byte kaplar
//byte:-128 den +127e (dahil tam sayı degerlerı ıçın kullanılır)

byte ogrenciYasi=21;



//short data type

//tam sayılar için kullanılır, hafızada 2byte kaplar

//short-32768+32768  e kadar tam sayılar ıcın kullananılabılır

//ornek5 sıte nufusu bır variable oluştudeger atayınız
short siteNufusu=1300;


        //int data type
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
        //int : -2,147,483,648 ile 2,147,483,647 (dahil) kadar tamsayi degerleri icin kullanilir


 //long data type:
//tam sayılae ıcın kullanınır ,hafızada 8 byte yer kaplar
//long

//Not: bır deger long ıuse soınunda "L" konur (konması tavsıye edılır) veya "l" kunur
//ornek7

long insanVicudunkariHucreSayısı=8454985696854L;

//leger long a atadıgınız deger ınt lerın aralında ıse sonuna l koymanıza gerek yok
        //long demenıze ragmen lununa L koymadıksak ıng aralıgında ıse ınt kabul eder
long weihtOfSun=411515;


//floot data type: 4byte yer kaplar
 //floot virgullu sayılar ıçın (decimal number=> ondalık sayılar) ıcın  ullanılır

//ORNEK7:gomlek ve ayyakkabı fıyatları ıcın 2 tane veıable yap

        //JAVA Ondalık sayıları otomatıkl olarak "doble" kobul eder
        //siz data type nı flooat yazarsanız hayta alırsınız float olmasını ısrar edıyorsanız sonuna "F" yada "f"f koymalısınız

        float gomek=12.12F;
        float ayakkabi=12.12F;

        //Double data type: 8 byte yer kaplar
        //ondalıklı kısmının icin daha fazla rakam alabılır Hucre agıtlıg gıbı bılımsel


        double hucereAgirligi=2.561165;
        double hucreAgirligi=3.3112;

        //Ogrencı notları icin 2 adet variable oluşturucaz be taplyar ekrana yazdırınız


        byte not1=51;

        byte not2=70;

        System.out.println(not1);   //ekrana yazdırır
        System.out.println(not2);
        System.out.println(not1+not2);


       // System.out.println();   sisteme yazdırı ve pointer i bir sonrakı satıra taşır
        //System.out.print; ekranda yan yana yazdırı


        //home work
        /*
         yagrına kadar 3 farklı data turunde waiable oluşturun ve bunları yazdırın
         2) ulke ve sehir isimleri icin 2 variable oluşturun ve bunları yazdırtın
         3) 2 tam sayı turunde variable olsturup farklı satırlarda yazdırın
         */







































    }}