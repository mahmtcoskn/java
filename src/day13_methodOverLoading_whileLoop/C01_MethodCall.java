package day13_methodOverLoading_whileLoop;

import day12_methodCreation.C03_AsalSayi;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);
        //  0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        // asagida verilen cumlenin tersini yazdirin
        String str = "Bir kere yaparim, yan gelir yatarim";
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));

        // asagida verilen cumleyi tersine cevir
        String tersStr = C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);

        // asagida verilen cumlenin palindrome olup olmadigini yazdirin
        str="Java Candir";
        tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("palindrome degil");
        }

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin
        int sayi = 230;

        System.out.println(C03_AsalSayi.asalSayiMi(sayi));  // true

        // kullanici true / false dan birsey anlamaz , acik sekilde yazalim

        boolean sonuc=C03_AsalSayi.asalSayiMi(sayi);  // true

        if (sonuc){
            System.out.println("girilen " + sayi + " sayisi asal.");
        }else {
            System.out.println("girilen " + sayi + " sayisi asal degil.");
        }


    }
}
