//ERDO�AN G�LE�
//19410051033
//On ile y�z aras�nda 20 tane rastgele say� �retip bunu bir ArrayList�e aktar�n�z. Daha sonra bu listeden tek olanlar� bir listeye, �ift olanlar� farkl� bir listeye aktar�n�z. Ard�ndan olu�an en b�y�k �ift say� ile en b�y�k tek say�n�n mutlak fark�n� bulan kod.
package butodev;

import java.util.ArrayList;//Arraylist k�t�phanesi.
import java.util.Collections;//sort'u tan�mlamam�z i�in gerekli Collections k�t�phanesi.
public class tekciftfark {

	public static void main (String args [] ) {
	    ArrayList<Integer> liste = new ArrayList<>();//random say�lar�m�z�n aktar�ld��� Arraylist'imizi tan�mlad�k.
	    ArrayList<Integer> tekliste = new ArrayList<>();//�retilen random say�lar�n i�inden tek olanlar� aktard���m�z yeni Arraylist'i tan�mlad�k.
		ArrayList<Integer> ciftliste = new ArrayList<>();//�retilen random say�lar�n i�inden �ift olanlar� aktard���m�z yeni Arraylist'i tan�mlad�k.
		int enbuyuktek, enbuyukcift, fark;//integer'lar�m�z� tan�mlad�k.
		
		for (int i=0; i<20; i++){//0 ile 20 aras�nda say� �rettik.			  
		 liste.add(10+(int)(Math.random()* 90));//10 ile 100 aras�nda random say� �rettik.
	
		}
		System.out.println("rastgele say�lar:" + liste);{//random say�lar� aktard���m�z listeyi yazd�rd�k.
    		
			for (int i=0; i<20; i++)//�retilen yirmi adet random say�y� al�yoruz.
			{
				
			if (liste.get(i) %2 == 0) { // �ift olanlar� bulduk.
				ciftliste.add(liste.get(i));//�ift olan random say�lar� tek tek �ift olan Arraylist'e ekledik.				
			}
			else {//di�er senaryo yani tek ise.//(ikiye b�l�m�nden kalan� "1" olan say�lar tek say�lard�r).
				tekliste.add(liste.get(i));//random �retilen tek olan say�lar� Tek Arraylist'e ekledik.
								
			}
			}
			System.out.println("");//random say� listesi ile di�er listeler aras�nda bo�luk olmas� i�in bo�luk  print yapt�k.
			System.out.println("�ift liste:" + ciftliste);//random �retilen �ift say�lar� yazd�rd�k.
			System.out.println("tek liste:" + tekliste);//random �retilen tek say�lar� yazd�rd�k.
		}
	//	�ift ve tek arraylisteyi sort ile (s�rala).		
		Collections.sort(tekliste);//tek listesindeki say�lar� k���kten b�y��e s�ralamak i�in "sort" u kulland�k.
		Collections.sort(ciftliste);//�ift listesindeki say�lar� k���kten b�y��e s�ralamak i�in "sort" u kulland�k
		System.out.println("S�ral� Tek say�lar:"+tekliste);//tek listesini yazd�rd�k.
		System.out.println("S�ral� �ift say�lar:"+ciftliste);//�ift listesini yazd�rd�k.
	// �ift ve tek listenin boyutunu (size) ile buluruz. En b�y�k say�lar, s�raland��� i�in en sondad�r.		
		enbuyuktek = tekliste.size()-1;//tek listemizdeki say�lar�n indeksini buluyoruz ve bunu "enbuyuktek" e e�itliyoruz
		enbuyukcift = ciftliste.size()-1;//�ift listemizdeki say�lar�n indeksini buluyoruz ve bunu "enbuyukcift" e e�itliyoruz
		System.out.println("S�ral� tek say�lar�n indeksi: "+enbuyuktek);//S�ral� tek say�lar�n indeksini yazd�r�yoruz
		System.out.println("S�ral� �ift say�lar�n indeksi: "+enbuyukcift);//S�ral� �ift say�lar�n indeksini yazd�r�yoruz.

		System.out.println("En b�y�k S�ral� Tek say�: "+tekliste.get(enbuyuktek));// get komutu ile s�ral� tek listesindeki say�lar�n en b�y���n� al�p yazd�r�yoruz.
		System.out.println("En b�y�k S�ral� �ift say�: "+ciftliste.get(enbuyukcift));// get komutu ile s�ral� �ift listesindeki say�lar�n en b�y���n� al�p yazd�r�yoruz.

		fark = Math.abs(tekliste.get(enbuyuktek) - ciftliste.get(enbuyukcift) );//mutlak fark� bulmak i�in fark de�i�keni ni yazd�k.enbuyuktekten enbuyukcift i ��kard�k.
		System.out.println("Tek-�ift say� fark�: "+fark);//fark� yazd�rd�k.	
	}
}

