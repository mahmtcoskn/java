package day05_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu al
        // ucgen eşkenar ise "Eskenar ucgen" yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz ");
        double k1 = scan.nextDouble();
        double k2 = scan.nextDouble();
        double k3 = scan.nextDouble();
        if (k1==k2 && k2==k3 && k1>0) System.out.println("Eskenar ucgen");
    }
}
