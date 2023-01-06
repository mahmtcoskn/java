package day28_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {

    public static void main(String[] args) {

        // kullanicidan yasini girmesini isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasiniz giriniz");
        int yas = scan.nextInt();

        try {
            if (yas < 0){
                throw new IllegalArgumentException("hata");
            }else {
                System.out.println("yasiniz kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());  // hata
        }
    }
}
