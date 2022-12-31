package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı iste ve karesini yazdır

        Scanner scan = new Scanner(System.in);

        System.out.println("karesini almak istediginiz sayiyi giriniz");

        double girilenSayi = scan.nextDouble();  // sayi türü bilinmedigi icin double aldık !!

        System.out.println("sonuc : " + girilenSayi * girilenSayi);


    }
}
