package day05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        // if cümlelerinde şart parantezinden sonra body kullanmazsak
        // ilk ;'e kadar olan kismi body olarak kabul eder
        // yani sadece 1 satir kodu body olarak kabul eder

        // Eger if body'si icin yazilacak kod 1 satirdan fazlaysa mutlaka {} kullanilmalidir.

        // Kullanicidan bir sayi al
        // 3 ile bolunebiliyorsa "3 ile bolunebilen sayi"
        // 5 ile bolunebiliyorsa "5 ile bolünebilen sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        if (sayi%3==0) System.out.println("3 ile bolunebilen sayi");
        if (sayi%5==0) System.out.println("5 ile bolunebilen sayi");

    }
}
