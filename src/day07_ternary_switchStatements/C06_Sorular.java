package day07_ternary_switchStatements;

public class C06_Sorular {
    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        int input = 49;
        System.out.println(input>=50 ? "sinifi gectin" : "maalesef kaldin");

        // Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        char harf = 'a';
        System.out.println(harf>= 'a' && harf<='z' ? (char) (harf-32) : harf);

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        input = 10;
        System.out.println(input>0 ? input : (-1)*input);

    }
}
