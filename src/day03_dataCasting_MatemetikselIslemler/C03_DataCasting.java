package day03_dataCasting_MatemetikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5);  // 5

        System.out.println(29/3);  // 9

        // iki int deger islemdeyse sonucta int olur

        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2);   // 4

        double dbl=6;   // 4.16

        System.out.println(sayi1/dbl);   // 4.16

        Scanner scan = new Scanner(System.in);
        System.out.println("sayilari giriniz : ");

        int sayi3 = scan.nextInt();
        int sayi4 = scan.nextInt();
        //double dbl1=sayi4;

        System.out.println("bolme sonucu : " + (double)sayi3 / sayi4);   // her hangi birine double a cevirmek yeterli !!

    }
}
