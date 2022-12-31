package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan bir karakter girmesini isteyin
        // girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char harf = scan.next().charAt(0);

        if (harf >= 'A' && harf <= 'Z'){
            System.out.println("Girilen harf buyuk harf");
        }else {
            System.out.println("Girilen harf buyuk degil");
        }
    }
}
