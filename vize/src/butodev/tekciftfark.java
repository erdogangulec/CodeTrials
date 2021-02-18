//ERDOÐAN GÜLEÇ
//19410051033
//On ile yüz arasýnda 20 tane rastgele sayý üretip bunu bir ArrayList’e aktarýnýz. Daha sonra bu listeden tek olanlarý bir listeye, çift olanlarý farklý bir listeye aktarýnýz. Ardýndan oluþan en büyük çift sayý ile en büyük tek sayýnýn mutlak farkýný bulan kod.
package butodev;

import java.util.ArrayList;//Arraylist kütüphanesi.
import java.util.Collections;//sort'u tanýmlamamýz için gerekli Collections kütüphanesi.
public class tekciftfark {

	public static void main (String args [] ) {
	    ArrayList<Integer> liste = new ArrayList<>();//random sayýlarýmýzýn aktarýldýðý Arraylist'imizi tanýmladýk.
	    ArrayList<Integer> tekliste = new ArrayList<>();//üretilen random sayýlarýn içinden tek olanlarý aktardýðýmýz yeni Arraylist'i tanýmladýk.
		ArrayList<Integer> ciftliste = new ArrayList<>();//üretilen random sayýlarýn içinden çift olanlarý aktardýðýmýz yeni Arraylist'i tanýmladýk.
		int enbuyuktek, enbuyukcift, fark;//integer'larýmýzý tanýmladýk.
		
		for (int i=0; i<20; i++){//0 ile 20 arasýnda sayý ürettik.			  
		 liste.add(10+(int)(Math.random()* 90));//10 ile 100 arasýnda random sayý ürettik.
	
		}
		System.out.println("rastgele sayýlar:" + liste);{//random sayýlarý aktardýðýmýz listeyi yazdýrdýk.
    		
			for (int i=0; i<20; i++)//üretilen yirmi adet random sayýyý alýyoruz.
			{
				
			if (liste.get(i) %2 == 0) { // çift olanlarý bulduk.
				ciftliste.add(liste.get(i));//çift olan random sayýlarý tek tek çift olan Arraylist'e ekledik.				
			}
			else {//diðer senaryo yani tek ise.//(ikiye bölümünden kalaný "1" olan sayýlar tek sayýlardýr).
				tekliste.add(liste.get(i));//random üretilen tek olan sayýlarý Tek Arraylist'e ekledik.
								
			}
			}
			System.out.println("");//random sayý listesi ile diðer listeler arasýnda boþluk olmasý için boþluk  print yaptýk.
			System.out.println("çift liste:" + ciftliste);//random üretilen çift sayýlarý yazdýrdýk.
			System.out.println("tek liste:" + tekliste);//random üretilen tek sayýlarý yazdýrdýk.
		}
	//	Çift ve tek arraylisteyi sort ile (sýrala).		
		Collections.sort(tekliste);//tek listesindeki sayýlarý küçükten büyüðe sýralamak için "sort" u kullandýk.
		Collections.sort(ciftliste);//çift listesindeki sayýlarý küçükten büyüðe sýralamak için "sort" u kullandýk
		System.out.println("Sýralý Tek sayýlar:"+tekliste);//tek listesini yazdýrdýk.
		System.out.println("Sýralý Çift sayýlar:"+ciftliste);//çift listesini yazdýrdýk.
	// çift ve tek listenin boyutunu (size) ile buluruz. En büyük sayýlar, sýralandýðý için en sondadýr.		
		enbuyuktek = tekliste.size()-1;//tek listemizdeki sayýlarýn indeksini buluyoruz ve bunu "enbuyuktek" e eþitliyoruz
		enbuyukcift = ciftliste.size()-1;//çift listemizdeki sayýlarýn indeksini buluyoruz ve bunu "enbuyukcift" e eþitliyoruz
		System.out.println("Sýralý tek sayýlarýn indeksi: "+enbuyuktek);//Sýralý tek sayýlarýn indeksini yazdýrýyoruz
		System.out.println("Sýralý çift sayýlarýn indeksi: "+enbuyukcift);//Sýralý çift sayýlarýn indeksini yazdýrýyoruz.

		System.out.println("En büyük Sýralý Tek sayý: "+tekliste.get(enbuyuktek));// get komutu ile sýralý tek listesindeki sayýlarýn en büyüðünü alýp yazdýrýyoruz.
		System.out.println("En büyük Sýralý Çift sayý: "+ciftliste.get(enbuyukcift));// get komutu ile sýralý çift listesindeki sayýlarýn en büyüðünü alýp yazdýrýyoruz.

		fark = Math.abs(tekliste.get(enbuyuktek) - ciftliste.get(enbuyukcift) );//mutlak farký bulmak için fark deðiþkeni ni yazdýk.enbuyuktekten enbuyukcift i çýkardýk.
		System.out.println("Tek-çift sayý farký: "+fark);//farký yazdýrdýk.	
	}
}

