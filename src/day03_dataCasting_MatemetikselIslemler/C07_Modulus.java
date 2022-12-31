package day03_dataCasting_MatemetikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        // % Modulus : java da bolme islemi sonucunda kalani verir

        System.out.println(15%4);  // 3
        System.out.println(45%4);  // 1

        /*
        girilenSayi % 2 sonucu 0 ise cift sayi
        girilenSayi % 7 sonucu 0 ise 7 nin katidir
        girilenSayi nin birler basamagi
         */

        int girilenSayi=3246;
        int birlerBasamagi= girilenSayi % 10;   // 6
        System.out.println(girilenSayi);
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);

        birlerBasamagi= girilenSayi % 10;   // 6
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);

        birlerBasamagi= girilenSayi % 10;   // 6
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);




    }
}
