package day18_arrayLists.day16_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        List<String> isimListesiOlustur = isimListesiOlustur();
        System.out.println(isimListesiOlustur);


    }

    static List<String> isimListesiOlustur() {

        List<String> isimListesi= new ArrayList<>();
        String girilenIsim="";
        Scanner scan = new Scanner(System.in);

        while (!girilenIsim.equalsIgnoreCase("q")) {  // girilen isim q ya esit olmadıgı surece devam etsin

            System.out.println("Listeye eklemek icin bir isim girin\nBitirmek icin Q'ya basin");
            girilenIsim= scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimListesi.add(girilenIsim);
            }
        }
        return isimListesi;
    }
}

