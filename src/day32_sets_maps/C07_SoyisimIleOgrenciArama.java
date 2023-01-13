package day32_sets_maps;

import java.util.Map;

public class C07_SoyisimIleOgrenciArama {

    // ogrenci map de aradigimiz soyisim deki ogrencilerin
    // isim, soyisim, sinif ve sube lerini
    // bir tablo olarak yazdiran bir method olusturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Can");

    }
}
