package Market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class market {
   static  List<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuç", "Elma", "Muz  ", "Çilek", "Kavun", "Üzüm", "Limon"));
    static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static List<String> sepetUrunlerin = new ArrayList<>();
    static double kg;
    static double toplamfiyat;
    static  Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {


        String devam;
        do {
            urunListesi();
            System.out.println("Lutfen secim yapiniz");
            int urun= scan.nextInt();
            System.out.println("Kac kilo alacaksiniz");
            double miktar= scan.nextDouble();
            alinanUrunler(urun,miktar);
            sepetIcerigi();
            System.out.println("Devam etmek istiyorsan e ye basiniz");
            devam=scan.next();


        }while(devam.equalsIgnoreCase("e"));

        odeme();

        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.\n Yine bekleriz.");


    }

    private static void sepetIcerigi() {
        System.out.println("Aldiginiz urunler: "+sepetUrunlerin+"\n"+"Toplam kilo="+kg+"\t"+"Toplam fiyat: "+toplamfiyat);
    }

    private static void odeme() {
        double odeme;
        double tfiyat=toplamfiyat;
        do {
            System.out.println("Odemeniz gereken miktar:"+tfiyat);
            odeme=scan.nextDouble();
            tfiyat-=odeme;
            if (tfiyat>0){
                System.out.println(tfiyat+"   Daha odeme yapmaniz gerekiyor");
            }else{
                System.out.println(-tfiyat+" Para ustunuz");
                break;
            }

        }while(!(tfiyat==0));


    }

    private static void alinanUrunler(int urun, double miktar) {

        sepetUrunlerin.add(urunler.get(urun));
        kg=kg+miktar;
        toplamfiyat+=fiyatlar.get(urun)*miktar;

    }

    private static void urunListesi() {

        System.out.println(" No\t\t Urunler \t Fiyatlar");
        System.out.println("====\t ======== \t =======");

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(" " + i + "\t\t" + urunler.get(i) + "\t\t" + fiyatlar.get(i));
            ;

        }
    }
}