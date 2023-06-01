package deneme;

import java.util.Arrays;

public class Abura {
    public static void main(String[] args) {


        int sayac=0;

        int nums[]=new int[]{15,56,-68,-63,-78,47,96,85};

        for (int w:nums){

            if (w%3==0){
                sayac++;




            }


        }


        System.out.println("3 ile bolunebılen sayi sayisi="+sayac);
        System.out.println("3 ile bonemıyen sayi sayisi ="+(nums.length-sayac));


    }
}
