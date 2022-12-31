package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // kullanicidan isim, soyisim ve yas isteyip yazdır !!

        Scanner scan = new Scanner(System.in);
        System.out.println("isminiz :");
        String isim = scan.nextLine();
        System.out.println("soyisminiz :");
        String soyIsim = scan.nextLine();
        System.out.println("yasiniz :");
        int yas = scan.nextInt();

        System.out.println("isminiz : " + isim +
                           "\nsoyisminiz : " + soyIsim +
                           "\nyas : " + yas +
                           "\nkaydiniz olusturuldu.");   // \n alt satirdan devam etmesini saglar !!!

    }
}
