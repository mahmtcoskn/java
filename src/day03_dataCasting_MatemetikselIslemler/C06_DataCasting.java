package day03_dataCasting_MatemetikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        // bir double bir tam sayi al
        // double ı ikinci sayiya bol
        // sonucun tam sayı kısmını yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("double sayiyi giriniz : ");
        double sayi1= scan.nextDouble();
        System.out.println("integer sayiyi giriniz : ");
        int sayi2=scan.nextInt();
        System.out.println((int)sayi1/sayi2);

    }
}
