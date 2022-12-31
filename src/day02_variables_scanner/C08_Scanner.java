package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // kullanicidan bir dikdörtgen 2 kenarını alip alanini yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("kenarlari giriniz : ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("alan = " + kenar1 * kenar2 );
    }
}
