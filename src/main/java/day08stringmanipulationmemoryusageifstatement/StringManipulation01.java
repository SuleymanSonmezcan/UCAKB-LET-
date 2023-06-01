package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {


        //b'r s'tging in hic karakter icermedigini (bos string oldugunu) konturol edınız


        //1.yol length()mehodu ile cozunuz

        String str="";
        boolean result01 = str.length()==0;

        System.out.println("String bosmu?"+result01);


        //2.yol tavsıye edilir
        //java eger bır konuda methode olusturmusssa o method u kullanma en ıyisidir

        boolean resylt02= str.isEmpty();

        System.out.println("isEmpty" +resylt02);

        //ornek 2;bir Stgıng ın space harız biç bır karakter ıcermedıgıni konturol eden kodu yaziniz


        String t="         ";
        //". yol

         boolean ruselst3=  t.replace(" ","" ).length() ==0;

        System.out.println(ruselst3);


        //2.yol


        boolean ruselst4=  t.replace(" ","" ).isEmpty();

        System.out.println(ruselst4);

        //3.yol

        boolean result5= t.isBlank();

        System.out.println(result5);

        //isBlank methodu sagdece space iceren Stringler icin true verir.spaca dısında bır karakter var ise false verir
        //isBlank () methodu bos String ler icin de true veriri
        //isBlank () methodu space+hiç birsey icin true veriri
        //isEmpty () methodu sadece bir sey icin true verir


        //Ornek3: bir String te a .i.e katrakterlerini ilk gorunumlerını indexleri tolpamını ekran yazdiriniz

        //"java is easy to learn"==>1+5+8==>14

        //0123456789....index
        String r="java is easy to learn";

        int idxA= r.indexOf('a');
        System.out.println(idxA);//1

        int idxI= r.indexOf('i');
        System.out.println(idxI);//5


        int idxE =r.indexOf('e');

        System.out.println(idxE);//8

        System.out.println(+idxA+idxE+idxI);

        //Ornek 4: bir String tejki "java" kelimesini ilk olarak kacıncı ındexte kullanındıgını gosteren kodu yazın
        //Ah java vay java sensız olmuyor java

        //indexOf("java")kullaniminda siz java kelımesını ılk gurunumundeki ilk harfi (yani j nin)index ini almıs oluruz
        String u="Ah Java vay Java sensız olmuyor Java";



        int idxJava= u.indexOf("Java") ;

        System.out.println(idxJava);//3


        //İindexOf() methodu olmayan carakterleri icin kullalirsa her zaman -1 return eder
        int idxjava1= u.indexOf("java");
        System.out.println(idxjava1);

        //Ornek5: : bir String te a .i.e katrakterlerini son gorunumlerını indexleri tolpamını ekran yazdiriniz

        //0123456789

        String v= "java is easy to learn";
        int idxOfa= v.lastIndexOf('a');
        System.out.println(idxOfa);

        int idxOfe= v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi= v.lastIndexOf('i');
        System.out.println(idxOfi);

        System.out.println(idxOfa+idxOfe+idxOfi);//40









































































    }
}
