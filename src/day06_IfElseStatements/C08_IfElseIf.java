package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int adet= scan.nextInt();
        System.out.println("Urunun liste fiyatını giriniz");
        double fiyat = scan.nextDouble();

        System.out.println("Musteri kartiniz var mi? \nE:Evet H:Hayir");
        char kart=scan.next().charAt(0);

        if (kart=='E' && adet>10){
            System.out.println("%20 indirimli toplam fiyat : " + adet*fiyat*0.8);
        }else if (kart=='E' && adet>0){
            System.out.println("%15 indirimli toplam fiyat : " + adet*fiyat*0.85);
        }else if (kart=='H' && adet>10){
            System.out.println("%15 indirimli toplam fiyat : " + adet*fiyat*0.85);
        }else if (kart=='H' && adet>10){
            System.out.println("%10 indirimli toplam fiyat : " + adet*fiyat*0.9);
        }else {
            System.out.println("Hatali bilgi");
        }
    }
}
