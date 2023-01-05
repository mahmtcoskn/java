package day25_inheritance;

public class BDoktor extends APersonel{

    /* Olusturdugumuz Doktor classında isim soyisim gibi
       Personel classında olusturulan tum ozelliklerin olmasini istiyoruz
       Bu durumda 2 tercih var
            1- İstenen tum ozellikleri Doktor classında yeniden olusturabiliriz
            2- Doktor classını Personelin childı yapmak

       Doktor classını personel classının childi yaptigimizda
       Doktor classından olusturulan objeler
       sadece kendi classlarındaki özelliklere sahip olmaz
       ayni zamanda parent classi olan personeldeki
       ozelliklere de sahip olurlar

       Bir child classdan obje olusturdumuzda
       o objenin ozelliklerini belirlerken
       once kendi classına bakilir ve o ozellik varsa kullanilir
       eger kendi classında yoksa parent classa bakilir

       Bir class extend keyword kullanarak baska bir classı
       kendisine parent edinirse

       1- parent classdaki tum ozellikleri direk kullanabilir
          (isim,soyisim,telefon,ozelSigorta)
       2- Isterse parent classda olan bir ozelligi kendisine uyarlayabilir
          (maas)
       3- Isterse parent classda olmayan kendisine ozel yeni ozellikler olusturur
          (nobet)

     */

    public static void main(String[] args) {

        BDoktor dok1 = new BDoktor();
        dok1.isim="Kemal";
        dok1.soyisim="Bulut";

        System.out.println(dok1.isim+","+dok1.soyisim+","+dok1.telefon);
        // Kemal,Bulut,Telefon atanmadi
        dok1.maas();   // Doktor maasi 30 * 8 * 25 : 6000
        dok1.ozelSigorta();   // Tum personelin ozel saglik sigortasi yapilir
        dok1.nobet();   // Doktorlar haftada 1 gun nobet tutar
    }

    public void maas(){
        System.out.println("Doktor maasi 30 * 8 * 25 : " + 6000);
    }
    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutar");
    }
}