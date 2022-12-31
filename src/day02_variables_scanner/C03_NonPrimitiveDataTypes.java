package day02_variables_scanner;

import java.util.Locale;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {


        String str= "Mahmut candir";
        int sayi=10;

        // primitive data turlerinin hazir methodlari yoktur
        // ancak non-primitive data tur. onceden hazirlanmis methodları vardır !!

        System.out.println(sayi);   // 10

        System.out.println(str.toLowerCase());  // mahmut candir

        System.out.println(str);  // Mahmut candir

        System.out.println(str.toUpperCase());  // MAHMUT CANDİR

        System.out.println(str.isEmpty());  // false
    }
}
