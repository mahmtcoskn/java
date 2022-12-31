package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini alin
        // ve girilen ismi buyuk harferle yadırın

        // deger almak icin 3 adim gerekir
        // 1. scanner objesi olusturmak

        Scanner scan = new Scanner(System.in);

        // 2. adim kullaniciye ne istediginizi söyleyin

        System.out.println("isminizi yazin :");

        // 3. adim kullanıcının girecegi degeri kaydedecegimiz variable olustur !!
        // scan objesi ile ilgili methodu kullanarak kullanıcının degeri variable ye ata !!

        String girilenIsim = scan.nextLine();

        // artik kullanicinin girdigi deger girilenIsim variable inda kayitli

        System.out.println(girilenIsim.toUpperCase());  // buyuk harfle basar !!


    }
}
