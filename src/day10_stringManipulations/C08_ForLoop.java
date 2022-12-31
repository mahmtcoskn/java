package day10_stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {

        // 1 ile 1000 arasindaki sayilari yan yana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin yoplami = " deyip toplamini yazdirin

        int sayilarintoplami = 0;
        for (int i = 1 ; i<=1000 ; i++){
            System.out.print(i + " ");
            // sayilarintoplami = sayilarintoplami+i;
            sayilarintoplami+=i;
        }
        System.out.println("");
        System.out.println("tum bu sayilarin yoplami = " + sayilarintoplami);
    }
}
