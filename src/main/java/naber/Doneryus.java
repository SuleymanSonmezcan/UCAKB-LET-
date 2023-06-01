package naber;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Doneryus {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("ALDIGINIZ NOTU GIRINIZ");



        char not=input.next().toLowerCase().charAt(0);


        if (not=='a'    &&  not=='b'     && not=='c'){

            System.out.println("a b c harfı dısında bır sey girmeyınız");
        }else {


            System.out.println(not=='a'?"Gayet basarılı":(not=='b'?"basarılı":(not=='c'?"gayet iyi":"Basaramadık")) );



        }
//--------------------------------------------------------------------------------------------------

        System.out.println("Kullanicidan Y/N ikilisinden giriniz");

        char ch=input.next().toLowerCase().charAt(0);

         if (ch=='y'){
             System.out.println("YES");

         } else if (ch=='n') {
             System.out.println(    "NO");

         }else {
             System.out.println("Sana denılenı yap ıcat cıkatma");
         }

//-----------------------------------------------------------------------------------------------------------
 /*
    Kullanicidan sinav notunu aliniz
    EGER not 0'dan kucuk eya 100'den buyuk girilirse " gecerli bir not giriniz" uyarisi veriniz
    Kullanici gecerli bir not girinceye kadar bu uyariyi tekrarlayiniz
    Eger kullanici verilen aralikta not girerse
    nested-if kullanarak asagidaki gibi    not hesaplayici yazniz
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
     */



        do {
            System.out.println("Aldıgınız puganı gırınız");
            int puan=input.nextInt();
            
            if (puan>0&&puan<=59){
                System.out.println("F");
                break;
            } else if (puan>59&&puan<=69){
                System.out.println("D");
                break;
            } else if (puan>=70&&puan<79) {
                System.out.println("C");
                break;
            } else if (puan>=80&&puan<89) {
                
            } else if (puan>=90&&puan<10) {
                System.out.println("A");
            }else {
                System.out.println("Lutfen gecerlı bir sayi giriniz");
                continue;
            }


        }while (true);














        //-----------------------------------------------------------------------------------------------------------

        /*
    nested if kULLANARAK, ayrica do-while loop da kullanilacak
    Print "Lutfen is unvaninizi girin
    jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
    Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
    Kullanici asagidaki degerlerin disinda bir deger girerse  "gecerli bir jobTitle giriniz" uyarisini veriniz
    ve kullanici dogru jobTitle girinceye kadar kullanicidan veri almaya devam ediniz
     Example :
    Eger jobTitle  qa ise print is unvaniniz Quality Analyst
    test data: qa ise print Quality Analyst
    dev ise print Developer
    ba ise print Business Analyst
    pm ise print Project Manager
   */

        do {
            System.out.println("Lutfen is unvaninizi girin");
            String  jobTitle=input.nextLine();

            if ( jobTitle.equalsIgnoreCase("qa")){

                System.out.println(" Quality Analyst");
                break;
            } else if ( jobTitle.equalsIgnoreCase("dev")) {
                System.out.println("developer");
               break;
            } else if ( jobTitle.equalsIgnoreCase("ba")) {
                System.out.println("Business Analyst");
                break;
            } else if ( jobTitle.equalsIgnoreCase("pm")) {
                System.out.println("Project Manager");
                break;
            }else {
                System.out.println(" gecerli jobTitle giriniz");
            }


        }while (true);


//-------------------------------------------------------------------------------------------------------

  /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   Nested-If ve Ternary kullanarak 2 yolla da cozunuz
 */
        System.out.println("lutfen 0-9 arsı bır sayı gırınız");
        int num=input.nextInt();

        if (num>=0&&num<10){


            if (num==0){
                System.out.println("sıfır");
            } else if (num==1) {
                System.out.println("bir");
            }
            else if (num==2) {
                System.out.println("iki");
            }
            else if (num==3) {
                System.out.println("uç");
            }
            else if (num==4) {
                System.out.println("dört");
            }
            else if (num==5) {
                System.out.println("beş");
            }
            else if (num==6) {
                System.out.println("altı");
            }
            else if (num==7) {
                System.out.println("yedi");
            }
            else if (num==8) {
                System.out.println("sekiz");
            }
            else if (num==9) {
                System.out.println("doduz");
            }



        }else {
            System.out.println("Gecersız karakter");
        }


//-----------------------------------------------------------------------



//-----------------------------------------------------------------------
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/



    }













//--------------------------------------------------------------------------------------------------











    }




