package day06_IfElseStatements;

import java.util.Scanner;

public class C11_NestedIfElse {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen urun adedini giriniz");
        int adet = scan.nextInt();

        System.out.println("Urunun liste fiyatını giriniz");
        double fiyat = scan.nextDouble();

        System.out.println("Musteri kartiniz var mi? \nE:Evet H:Hayir");
        char kart = scan.next().charAt(0);

        // urun miktari ana degisken olsun

        if (adet>=10){
            if (kart=='E' || kart=='e') System.out.println("%20 indirimli fiyat : " + adet*fiyat*0.8);
            else if (kart=='H' || kart=='h') System.out.println("%15 indirimli fiyat : " + adet*fiyat*0.85);
            else System.out.println("gecersiz bilgi");

        }else if (adet>=10){
            if (kart=='E' || kart=='e') System.out.println("%15 indirimli fiyat : " + adet*fiyat*0.85);
            else if (kart=='H' || kart=='h') System.out.println("%10 indirimli fiyat : " + adet*fiyat*0.9);
            else System.out.println("gecersiz bilgi");

        }else {
            System.out.println("Gecersiz bilgi");
        }
    }
}