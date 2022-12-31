package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın
        // yoksa girilen harfi yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf = scan.next().charAt(0);
        if (harf>='a' && harf<='z'){
            System.out.println((char) (harf-32));
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println(harf);
        }
    }
}
