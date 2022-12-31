package day11_forLoops;

public class C09_NestedLoop {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunluklarina gore
        // asagidaki sekli cizdirin
        int kisaKenar=5;
        int uzunKenar=8;
        /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                                Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirliyor
         */

        for (int i = 0; i <= kisaKenar ; i++) {
            for (int j = 0; j <=uzunKenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");  // satir ile islem bittiginde alt satira gecmek icin

        }


    }
}
