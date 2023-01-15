package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {

    public static void main(String[] args) {

        // tum ogenci listesini
        // sinif sube no isim soyisim no seklinde
        // dogal sirali olarak
        // yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrenciMap);


    }
}
