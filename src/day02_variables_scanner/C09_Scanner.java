package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        /*
        Interview sorusu
        kullanicidan iki sayi alip degerlerini degistirin (swap)
        sayi1=10
        sayi2=20
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi1'i giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("sayi2'yi giriniz : ");
        int sayi2 = scan.nextInt();

        int temp;

        // 1. adim sayi2 yi temp e atayalim

        temp=sayi2;

        // 2. adim sayi1 i sayi2 ye atayalım

        sayi2=sayi1;

        // 3. adim temp teki degeri sayi1 e atayalim

        sayi1=temp;

        System.out.println("sayilarin degerini degistirdim : "
                           + "\nsayi1 in yeni degeri : " + sayi1
                           + "\nsayi2 nin yeni degeri : " + sayi2);


    }
}
