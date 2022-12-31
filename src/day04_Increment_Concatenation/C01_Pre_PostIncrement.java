package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi=20;
        // sayiyi 3 artirin

        sayi = sayi + 3;
        sayi += 3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi);  // 29

        sayi=10;
        System.out.println(sayi++);  //  10 ++ variable dan sonra geldiği için önce yazdırmayı yapar sonra artirir
        System.out.println(sayi);    //   11
        sayi=10;
        System.out.println(++sayi);   // 11 ++ variable dan önce geldiği için önce artirma islemini yapar sonra yazar
        System.out.println(sayi);    // 11
    }
}
