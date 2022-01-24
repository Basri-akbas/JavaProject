package KitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.

	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir

 */
public class Kitapci {

    static List<Kitap> kitapListe = new ArrayList<>();
    // static Scanner scan = new Scanner(System.in);
    // static int kitapNo = 1000;

    public static void main(String[] args) {

        KitapMethod.kitaplarEkle(kitapListe);

        Kitap manuelKitap = new Kitap();
        manuelKitap.setKitapAdi("manuel giris javaCan");
        manuelKitap.setNo(1003);
        manuelKitap.setYayinYili(2010);
        manuelKitap.setYazarAdi("hasan fidan");
        manuelKitap.setFiyat(123);

        kitapListe.add(manuelKitap);
        KitapMethod.menu(kitapListe);

    }


}
