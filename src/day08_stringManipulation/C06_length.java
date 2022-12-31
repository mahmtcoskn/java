package day08_stringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str = "Java her gecen gun daha da guzellesiyor, degil mi?";

        // sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));  // m
        System.out.println(str.length());  // 50

        // rastgele bir karakter yazdir

        Random rnd = new Random();
        int index = rnd.nextInt(str.length());  // str.length ten kucuk rastgele bir int uretir

        System.out.println(str.charAt(index));

    }
}
