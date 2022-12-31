package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        /* kullanicidan bir tamsayi alin
           sayi negatif ise "negatif sayi",
           sayi rakam ise "girilen sayi rakam"
           sayi 2 basamakli ise "girilen sayi 2 basamakli"
           sayi 2 basamaktan buyukse "buyuk sayi" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<0) System.out.println("negatif");
        else if (sayi<=9) System.out.println("rakam");
        else if (sayi<=99) System.out.println("2 basamakli");
        else System.out.println("buyuk sayi");
    }
}
