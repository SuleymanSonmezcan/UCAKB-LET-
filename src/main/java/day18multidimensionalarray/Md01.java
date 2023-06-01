package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Bir Array in elemanlari Array ise bu Arrayler Multidimensional Array dir
        //Multidimensional Arry nasil olusturulur


        int a[][]=new int[3][2];


        //Multidimensional Array lere eleman nasil eklenır
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;


        //Multidimensional Array nasil yazdirilir

        System.out.println("Arrays.deepToString(a) = " + Arrays.deepToString(a));
        //multidimensional arrylri console a yazdirmak icin toString()methode degil
        //deeptoString() methode nazdirir



        //Multidimensional Array icinde sğecific bir eleman nasil yazdirilir
        System.out.println(a[1][1]);//45
        System.out.println(a[2][1]);//0



        //Multidimensional array icindeki bir array nasil yazdirilir

        System.out.println(Arrays.toString(a[0]));//[5,12]
        System.out.println(Arrays.toString(a[0]));//[5,12]


        //Kisa yolsan Multidimensional

        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyan"},{"Ceyhan","Kayhan"}};


        //Ornek 1:Yukaridaki Arrayde srudent array ınde toplam kac isim olugunu bulunuz

        int sum=0;
        for ( String[] w:students) {

        sum= sum+   w.length;

        }
        System.out.println(sum);
















































    }
}
