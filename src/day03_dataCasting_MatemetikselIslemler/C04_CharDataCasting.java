package day03_dataCasting_MatemetikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /*
        char data turunun ekstra bir ozelligi var
        eger mat isleminde char degeri kullanırsak
        java char in ascii degerini kullanarak islemi yapar
         */

        System.out.println('a'+'b');  // 97+98=195

        System.out.println('a'-32);   // 97-32=65

        // 'a'-32 nin char olarak sonucunu yazdir

        System.out.println((char)('a'-32));  // A

        // alinan char degerinin ascii table dan o degerden sonra gelen 3 degeri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz : ");
        char girilenKarakter=scan.next().charAt(0);   // ilk kelimenin ilk karakteri

        System.out.println((char)(girilenKarakter+1) + ", "+
                           (char)(girilenKarakter+2) + ", "+
                           (char)(girilenKarakter+3));


    }
}
