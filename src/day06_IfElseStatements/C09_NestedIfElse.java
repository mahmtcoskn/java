package day06_IfElseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        /*
           eger degisken sayimiz birden fazla ise
           degiskenlerden birini oncelige alarak,
           ona gore bir if else yapisi kurulur
           ornegin bu soruda kadin/erken secimini ana degisken yapalim
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz\nK : Kadin, E : Erkek ");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen yasinizi tam sayi olarak giriniz ");
        int yas = scan.nextInt();

        if (cinsiyet=='K' || cinsiyet=='k'){  // kadin olanlar icin bu bolum calisacak

            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=60) System.out.println("emekli olabilirsiniz");
            else System.out.println("emekli olabilmek icin " + (60-yas) + " yil daha calismalisin");

        }else if (cinsiyet=='E' || cinsiyet=='e'){  // erkek olanlar icin bu bolum calisacak

            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=65) System.out.println("emekli olabilirsiniz");
            else System.out.println("emekli olabilmek icin " + (65-yas) + " yil daha calismalisin");

        }else {
            System.out.println("cinsiyet bilgisi hatali");
        }
    }
}
