package day03_dataCasting_MatemetikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        double dbl = 23.5;

        int sayi= (int) dbl;
        System.out.println(sayi);  // 23

        byte byt=(byte) sayi;
        System.out.println(byt);   // 23

        sayi=130;
        byt=(byte) sayi;  // int daha kapsamli oldugu icin otomatik atama yapamaz bizden mudahale ister !!

        System.out.println("int 130 un byte hali : "+byt);   // -126

    }
}
