package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {

    public static void main(String[] args) {

        Map<String,Integer> harfSayilariMap = new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("B",10);
        harfSayilariMap.put("C",10);
        harfSayilariMap.put("D",10);
        harfSayilariMap.put("K",10);

        System.out.println(harfSayilariMap);  // {A=10, B=10, C=10, D=10, K=10}

        // A yi 20 yapin
        harfSayilariMap.put("A",20);
        System.out.println(harfSayilariMap);  // {A=20, B=10, C=10, D=10, K=10}

        // C yi 2 katina cikar
        harfSayilariMap.put("C", harfSayilariMap.get("C")*2);
        System.out.println(harfSayilariMap);  // {A=20, B=10, C=20, D=10, K=10}

        // D yi 5 artir
        harfSayilariMap.compute("D", (k,v) -> v+5);
        System.out.println(harfSayilariMap);  // {A=20, B=10, C=20, D=15, K=10}

        // eger map de T varsa 3 eksilt
        harfSayilariMap.computeIfPresent("T", (k,v) -> v-3);
        System.out.println(harfSayilariMap);  // {A=20, B=10, C=20, D=15, K=10}

        // K harfi varsa 2 azalt
        harfSayilariMap.computeIfPresent("K", (a,b) -> b-2);
        System.out.println(harfSayilariMap);  // {A=20, B=10, C=20, D=15, K=8}

        // T harfi yoksa kullanim 3 olsun
        harfSayilariMap.computeIfAbsent("T", v -> 3);
        System.out.println(harfSayilariMap);  // {A=20, B=10, C=20, D=15, K=8, T=3}
    }
}
