package day03_dataCasting_MatemetikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlariToplaminiBulma {
    public static void main(String[] args) {

        // 4 basamaki sayi iste
        // rakamlari toplamini yaz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir sayi giriniz : ");
        int sayi=scan.nextInt();

        int birlerBasamagi=0;
        int rakamlartoplami=0;

        birlerBasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerBasamagi;
        sayi=sayi/10;

        System.out.println(rakamlartoplami);









    }
}
