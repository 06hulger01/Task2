package org.example;
public class Task2 {
    public static void main(String[] args) {
        //        Örnek: Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?

        int alidogum=1990;
        int gunumuz=2022;
        int alininyası= gunumuz-alidogum;
        System.out.println("alinin yası="+ alininyası);

        System.out.println("................");

//        Örnek: Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
//        den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.

        int ali=1990;
        int today=2022;
        int aliyas=today-ali;
        int ahmet=aliyas-5;
        System.out.println("aliyas="+ aliyas);
        System.out.println("ahmetyas="+ ahmet);

        System.out.println("................");

//        Örnek:2 cm yarıçapına sahip dairenin alanı ve çevresini hesaplayın?
//        (PI=3.14)
        int r=2;
        double pi=3.14;
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("daırenın alanı="+ alan);
        System.out.println("darrenın cevresi="+ cevre);

        System.out.println("................");

//        Örnek: 300 Fahrenheit kaç Celsius ‘dur? (°C=(°F-32)/1.8)
        double f=300;
        double c=(f-32)/1.8;
        System.out.println("c="+ c);

        System.out.println("................");
//        Örnek: 32 Celsius kaç Fahrenheit ‘dır? (°C=(°F-32)/1.8)

        double cl=32;
        double fh=32+(1.8+c);
        System.out.println("fh="+ fh);

        System.out.println("................");

//        Örnek: Ali fizik dersinden 92, kimya dersinden 55, matematik
//        dersinden 89 almıştır.
//        1.Ali’nin not ortalaması kaçtır?
//        2. Ortalama sınıf geçme notu 80 üzeri olduğuna göre Ali’nin sınıfı
//        geçti ise ekrana true geçmedi ise false yazdırın.
//        (ipucu:  boolean sonuc= ortalama>80)

        double fizik=92;
        double kimya=95;
        double matematik=89;
        double aliort= (fizik+kimya+matematik)/3;
        System.out.println("aliort"+aliort);
        boolean sonuc= aliort>80;
        System.out.println("ali sınıfı geçti mi?"+" "+"\n"+sonuc);

        System.out.println("................");

//        Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
//        vardır. Toplantıya 113 katılmıştır.
//        1.Toplantı salonun toplam kapasitesi nedir?
//        2.Kaç adet boş koltuk vardır ?
//        3.Kaç adet sırada oturulmaktadır ?
//        4. Kaç sıra tamamen boş kalmıştır.
//        5.Oturulan sıralarda kaç adet boş koltuk vardır?
        double sira=15;
        double siradakikoltuksayisi=12;
        double katilan=113;

        double kapasite= sira*siradakikoltuksayisi;
        System.out.println("kapasite="+ kapasite);

        double boskoltuk=kapasite-katilan;
        System.out.println("boskoltuksayısı="+ boskoltuk);

        double oturulansirasayisi= katilan/siradakikoltuksayisi;
        System.out.println("oturulansira="+ oturulansirasayisi);

        double tamamenbossira= sira-oturulansirasayisi;
        System.out.println("tamamenbossıra="+tamamenbossira);

        double oturulansiralardakiboskoltuksayisi= 12-katilan%siradakikoltuksayisi;
        System.out.println("oturulansiralardakiboskoltuksayisi="+oturulansiralardakiboskoltuksayisi);


        System.out.println("................");


       /*
        int toplamsaniye= 31502;
        int saat= toplamsaniye/3600;
        int dakika=(toplamsaniye-saat*3600)/60;
        int saniye= toplamsaniye-(saat*3600+dakika*60);
        System.out.println("toplamsaniye="+ saat+ " - " + dakika+ "-"+ saniye+ "dir");

        */

        System.out.println("................");

        //kısa çözüm.

        int toplamsaniye= 31502;
        int saat=toplamsaniye/3600;
        int dakika=(toplamsaniye%3600)/60;
        int saniye=toplamsaniye%60;
        System.out.println(saat+"-"+dakika+"-"+saniye);

    }

}
