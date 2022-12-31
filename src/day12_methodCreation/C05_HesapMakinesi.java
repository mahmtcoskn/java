package day12_methodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {

        // Kullanicidan 2 sayi ve istedigi islemi alin (+ / * -)
        // bir method olusturup sayilara istenen islemi uygulayip
        // sonucu bize dondurun.
        // kullanici islemi yanlis secmisse 0 dondurun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz :");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("lutfen bir islem secin + , - , / , * : ");
        char islem = scan.next().charAt(0);

        System.out.println(hesapMakinesi(sayi1, sayi2, islem));


    }

    static double hesapMakinesi(double sayi1, double sayi2, char islem) {
        switch (islem) {
            case '+':    // char larda 'tek tirnak' kullanilir
                return sayi1 + sayi2;
            case '-':
                return sayi1 - sayi2;
            case '/':
                return sayi1 / sayi2;
            case '*':
                return sayi1 * sayi2;
            default:
                return 0;
        }
    }
}