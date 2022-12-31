package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        /* kullanicidan bir tamsayi alin
           sayi rakam ise "girilen sayi rakam"
           sayi 2 basamakli ise "girilen sayi 2 basamakli"
           sayi 2 basamaktan buyukse "buyuk sayi" yazdirin
         */
        /*
          Eger if else cumleleri ELSE ile bitmiyorsa
          tum durumlari kapsamaz
          yani bazi degerler icin hic bir if body'si calismayabilir
          Bu tur sorulari cozerken
          sartlarin tamamini dikkatli yazmak gerekir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (0<=sayi && sayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=sayi && sayi<=99) System.out.println("girilen sayi iki basamakli");
        else if (sayi>100) System.out.println("buyuk sayi");

    }
}
