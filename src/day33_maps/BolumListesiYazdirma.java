package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class BolumListesiYazdirma {

    public static void main(String[] args) {

        // verilen bolumdeki ogrencilerin
        // no, isim, soyisim ve siniflarini yazdiran
        // bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"MF");
    }
}
