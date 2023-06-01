package deneme;

import java.util.Arrays;

public class Md1 {
    public static void main(String[] args) {


        String sutudent[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyan"},{"Ceyhan","Kayhan"}};


            //Ornek: iki boyutlu bir Array i tek boyutlu bır arraye cevırınız

        int rusalut=0;
        int num[][]={{5,4},{2,3,2}};


        //iki boyutlu arrayde kac eleman oldugunu bulan kodu yazdiriniz
        int toplamElemanSayisi=0;

        for (int []w:num) {toplamElemanSayisi=  w.length;
        }



        //2.step tek boyutlu array , iki boyutlu array in eleman sayisini kullanarak olusturunuz


               int newArr[]=new int[toplamElemanSayisi];


        //3.step iki bpyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz


    int idx=0;
        for (int [] w:num) {

                for (int k:w) {

                newArr[idx]=k;
                idx++;
                }
        }
        System.out.println(idx);
    }



















}