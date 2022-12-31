package day06_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // Soru-1 Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ise "eskenar ucgen" yazdirin, degilse "eskenar degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        int k1=scan.nextInt();
        int k2=scan.nextInt();
        int k3=scan.nextInt();
        if (k1==k2 && k2==k3 && k1>0){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }
        /*
        If le baslayan kod else ile bitiyorsa input'un
        tum degerlerini kapsar
        Yani her deger icin mutlaka kodumuzda bir body calisir
         */
    }
}
