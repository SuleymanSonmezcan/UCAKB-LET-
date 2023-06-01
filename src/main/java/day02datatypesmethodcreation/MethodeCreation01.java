package day02datatypesmethodcreation;

import java.sql.SQLInvalidAuthorizationSpecException;

public class MethodeCreation01 {
    /*
    javada methode nasil olusturulur
    1)main method disinda classin icinde olusturulur

    2)Access Modifier +Return type + method isimi +()+{}


     */

    /*
     olusturulan methodlar nasil kullanilir?
     1) method un olusturmak methodu method u calistirmak icin gerekli degildir .Kullanilmak istenen method
     main metod un icinde kullanilir
     2) method'un isimini +() yazip
     3) vardsa islem yapacaginiz datalari parantezin icine koyun bu işlemde method call olarak adalandirilir
     4) method name +parametreler==> method signature
     */

    public static void main(String[] args) {

      int sonuc=  toplamaYap( 4,6);

      System.out.println(sonuc);


      long carpmaSonuxcu = multiply(4,5);

      System.out.println(carpmaSonuxcu);
        System.out.println(firstTweMultiplaythiranadd(2,3,6));



    }

    // ornek 1 toplama islemi yapan bir method olustutunuz

    public static int toplamaYap (int a,int b){// bu kisimda method kapmasımda kullanılması ve islenmesini ıstedigim
        //deklere ediyoruz

        return a+b;
        //return demek: bu method un cagrildigi yere bu degeri return et demek
        // main methode statick oldugu icin main method icinde kullanıcagımız method static olmalidir
    }


// ornek:2 2 sayiyi carpama islemi yapan bır method olusturunuz

protected static long   multiply (int a,int b) {

    return a * b;

}
//ornek3: verilen 3 sayıdan ilk kisini carpan ve sonucu 3 sayi ilte toplıyan method oluşturunuz


    private static int firstTweMultiplaythiranadd (int a, int b , int c){


  return a*b+c ;
    }
}
