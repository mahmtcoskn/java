package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        /*
        double ve int sayi alip taplam ve carpimini yazdiralim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("int degeri giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("double degeri giriniz : ");
        double sayi2 = scan.nextDouble();

        System.out.println("toplam : " + (sayi1 + sayi2)
                           + "\ncarpim : " + sayi1 * sayi2);
    }
}
