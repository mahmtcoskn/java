package day10_stringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str = "Java heyecandir";

        // tum a yerine sadece ilk a yi degistir

        System.out.println(str.replaceFirst("a","A"));  // JAva heyecandir

        // ilk harf veya sayiyi * yap

        System.out.println(str.replaceFirst("\\w","*"));  // *ava heyecandir
    }
}
