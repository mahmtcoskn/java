package day35_genelTekrar;

import java.util.Scanner;

public class C02_PrintfOndalikliSayi {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kg = scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double boy = scan.nextDouble();

        double endeks = kg*10000 / (boy*boy);

        //System.out.println("Vucut kitle endeksiniz : " + endeks);

        System.out.printf("Vucut kitle endeksiniz : %.2f %n",endeks);

        if (endeks>=30) System.out.println("Obez olabilirsiniz");
        else if (endeks>=25) System.out.println("Kilolusunuz");
        else if (endeks>=20) System.out.println("Normal");
        else System.out.println("Zayıfsınız");

    }
}
