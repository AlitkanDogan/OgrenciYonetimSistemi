package ogrenciYonetim;

import java.util.ArrayList;

/*
       OGRENCI YONETİM PLATFORMU KODLAYINIZ.

       1. BU PROGRAMDA OGRENCİ KAYITLARI İLE İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR.
           -AD SOYAD
           -KİMLİK NO
           -YAŞ
           -NUMARA
           -SINIF BİLGİLERİ İÇERMELİDİR.

       2. ========== İŞLEMLER ==========
               1- EKLEME
               2- ARAMA
               3- LİSTELEME
               4- SİLME
               Q- ÇIKIŞ

         SEÇİNİZ:

       ŞEKLİNDE BİR MENÜ OLUŞRURULMALI.

       3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO'YA GÖRE YAPILMALIDIR.

        */
public class Runner {

    public static void main(String[] args) {




        ArrayList<Ogrenci> ogrList = new ArrayList<>();

        Ogrenci ogrenci1 = new Ogrenci("Ali", "Yılmaz", "1111", 34, 55, 2);
        Ogrenci ogrenci2= new Ogrenci("Zeynep", "Öztürk", "2222", 32, 56, 1);
        Ogrenci ogrenci3 = new Ogrenci("Rıfat", "Gül", "3333", 35, 57, 4);

        ogrList.add(ogrenci1);
        ogrList.add(ogrenci2);
        ogrList.add(ogrenci3);



        Islemler islemler=new Islemler();
        islemler.menu(ogrList);

    }
}