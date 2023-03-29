package ogrenciYonetim;



import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    Scanner scan=new Scanner(System.in);
    Ogrenci ogrenci;

    int numara=1000;
    void menu(ArrayList<Ogrenci> ogrList){
        System.out.println("============== İŞLEMLER ==============\n"+
       "\t\t 1- EKLEME\n" +
       "\t\t 2- LİSTELEME\n"+
       "\t\t 3- ARAMA\n"+
       "\t\t 4- SİLME\n"+
       "\t\t Q- ÇIKIŞ\n"+
                "\n"+
                "\t SEÇİNİZ:");


        char secim=scan.next().toUpperCase().charAt(0);

       switch (secim){
           case '1':{
               ekleme(ogrList);

           }
           case '2':{
               listeleme(ogrList);

           }
           case '3':{
               arama(ogrList);

           }
           case '4':{
               silme(ogrList);

           }
           case 'Q':{

               System.exit(0);

           }
           default:{
               System.out.println("YANLIŞ DEĞER GİRDİNİZ");
               menu(ogrList);
           }
       }
    }

    private void silme(ArrayList<Ogrenci> ogrList) {
        int flag=0;
        System.out.println("SİLME YAPILACAK OGRENCİ TC NO: ");
        String silinecekTcNo=scan.next();

        for (int i = 0; i <ogrList.size() ; i++) {
            if (silinecekTcNo.equals(ogrList.get(i).getTcNo())){
                ogrList.remove(i);
                listeleme(ogrList);
                flag++;
            }

        }
        if (flag==0){
            System.out.println("ARADIĞINIZ TC NO YA AİT ÖĞRENCİ YOKTUR. ");
        }
        menu(ogrList);

    }

    private void arama(ArrayList<Ogrenci> ogrList) {
        int flag=0;
        System.out.println("ARAMA YAPILACAK TC NO: ");
        String aranacakTcNo=scan.next();
        for (Ogrenci each:ogrList
             ) {
            if (aranacakTcNo.equals(each.getTcNo())){
                System.out.println("ARADIĞINIZ OGRENCİ BİLGİLERİ\n"+each);
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("ARADIĞINIZ TC NO YA AİT ÖĞRENCİ YOKTUR.");
        }
        menu(ogrList);
    }

    private void listeleme(ArrayList<Ogrenci> ogrList) {
        for (Ogrenci each:ogrList
             ) {
            System.out.println(each);

        }
        menu(ogrList);


    }

    private void ekleme(ArrayList<Ogrenci> ogrList){
        scan.nextLine();
        System.out.println("ÖĞRENCİNİN ADINI GİRİNİZ");
        String ad=scan.nextLine();
        System.out.println("ÖĞRENCİNİN SOYADINI GİRİNİZ");
        String sAd=scan.nextLine();
        System.out.println("ÖĞRENCİNİN TC NO'SUNU GİRİNİZ");
        String tcNo=scan.nextLine();
        System.out.println("ÖĞRENCİNİN YASINI GİRİNİZ");
        int yas=scan.nextInt();
        System.out.println("ÖĞRENCİNİN SINIFINI GİRİNİZ");
        int sinif=scan.nextInt();

        ogrenci=new Ogrenci(ad,sAd,tcNo,yas,numara++,sinif);
        ogrList.add(ogrenci);
        listeleme(ogrList);



    }





}
