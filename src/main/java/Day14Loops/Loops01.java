package Day14Loops;

public class Loops01 {


    public static void main(String[] args) {

        //Ornke:bir stringi terst cevıren kodu yazdırınız

/*
        //1.yol
        String s = "Java";

        for (int i = s.length() - 1; i >= 0; i--) {


            char ch = s.charAt(i);


            System.out.print(ch);



        }
*/

        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1;i>=0 ;i-- ){


         ters=ters+    t.substring(i,i+1);






        }
        System.out.println(ters);



        // 3. yol

            String u="Java";

            String ters2="";

            for (int i=u.length()-1;i>=0;i--){

                ters2= ters2+u.charAt(i);





            }

        System.out.println(ters2);





            //Ornek 2= Sıze verilen string in palindrome olup olmadıgını konturol eden kodu yazınız



        // Logic :String  i ters cefvir sonra da duz halını karsılastırın ayni ise Palindome dur



        String duz= "Ey edip adanada pide ye" ;
        String ters3="";


        for (int i= duz.length()-1;i>=0;i--){

            ters3=ters3+duz.charAt(i);
        }



        System.out.println(ters3);


    if (duz.equalsIgnoreCase(ters3)){

        System.out.println("Palindıromdur");
    }else {
        System.out.println("Palindırom degıldır");
    }
































        }






























    }