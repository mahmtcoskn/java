package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Soru-1 Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ucgen ikizkenar ise "ikizkenar ucgen" yazdirin, degilse "ikizkenar degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        double k1= scan.nextDouble();
        double k2= scan.nextDouble();
        double k3= scan.nextDouble();

        if ((k1==k2 && k1!=k3)||
                (k2==k3 && k2!=k1) ||
                (k3==k1 && k3!=k2)){
            System.out.println("Ikızkenar ucgen");
        }else {
            System.out.println("Ikızkenar degil");
        }
    }
}
