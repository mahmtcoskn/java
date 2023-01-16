package day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {

    // verilen bir linkedList de
    // istenen iki index deki elementlerin yerlerini degistirin

    public static void main(String[] args) {

        LinkedList<String> isimler = new LinkedList<>();
        isimler.add("Mahmut");
        isimler.add("Ahmet");
        isimler.add("Beyza");
        isimler.add("Mehmet");

        System.out.println(isimler);  // [Mahmut, Ahmet, Beyza, Mehmet]

        // iki ismin yerini degistirelim
        // buyuk bir listede index bilmeden yapalim

        String ilkIsim = "Mahmut";
        String ikinciIsim = "Beyza";

        String temp ="";

        temp = ilkIsim;

        int ilkIsimIndex = isimler.indexOf(ilkIsim);
        int ikinciIsimIndex = isimler.indexOf(ikinciIsim);

        isimler.set(ilkIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler);  // [Beyza, Ahmet, Mahmut, Mehmet]

    }
}
