//ERDOÐAN GÜLEÇ
//19410051033
//ASCII kodlarýný(sesli harfler için 65-90) kullanarak 5 harfli 10000 adet rastgele stringler üreten ve Ardýndan en az iki sesli harf içeren elemanlarý baþka bir diziye aktaran kod.
package finall;
import java.util.Random;
public class dde1 {
	public static void main (String args [] ) {
		String xyz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//string olarak harflerimizi tanýmladýk.
		String[] sozlukdizi = new String[10000];//string dizisi oluþturduk tanýmladýk
		String[] seslisozlukdizi = new String[10000]; // Ýçinde en az iki sesli kelime geçen harfler için tanýmladýk.
		Random rasgele = new Random();//random komutunu rasgele ye tanýmladýk.
		for (int i=0; i<10000; i++){//onbin adet string üretiyoruz.
		//rasgele 5 adet harf üretiyoruz
		char a = xyz.charAt(rasgele.nextInt(xyz.length()));
		char b = xyz.charAt(rasgele.nextInt(xyz.length()));
        char c = xyz.charAt(rasgele.nextInt(xyz.length()));
        char d = xyz.charAt(rasgele.nextInt(xyz.length()));
        char e = xyz.charAt(rasgele.nextInt(xyz.length()));
        String beslikelime =String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d)+String.valueOf(e);      
      //stringe atayan fonksiyon karakterini stirnge çevirdik 
        sozlukdizi[i] = beslikelime;//sozlukdizi[i] yi beslikelime ye atadýk.
        System.out.println("Rasgele 5 harfli Sözlük Dizi :" +i+"  "+sozlukdizi[i]);
                System.out.print(beslikelime);
     // Ürettiðin 5 harfli kelimelerde Sesli harf var mý, kontrol et.
		}
        int seslindeks = 0;//sesli indeksi tanýmladýk.
	    for (int i=0; i<10000; i++){// 0 dan 10000 e kadar sözlük dizisine attýðýmýz stringleri tanýmladýk. 		
	    	String sozcuk = sozlukdizi[i];
	    	char[] sozdizi = new char[5];// sözdizi yi beþ karakterli bir char olarak tanýmladýk.
	        int seslisay = 0;//sesli harfleri bulan indeks.
	        for(int j = 0; j< 5; j++) { 
	        char a = sozcuk.charAt(j);
	        sozdizi[j] = a; // Sesli harfleri buluyoruz.
	        if ((sozdizi[j] == 'A' ) || (sozdizi[j] == 'E' ) || (sozdizi[j] == 'I' )|| (sozdizi[j] == 'O' ) || (sozdizi[j] == 'U' ) ) {
	        	//sozdizi adlý dizinin içinde olan sesli harfleri kontrol ediyoruz.
	        	seslisay += 1; }
	        }  
	        // Sesli harfler 2 ve daha fazlaysa ayrý bir diziye atadýk.
	        if (seslisay > 1) { System.out.println(seslindeks+ ". En az iki harfi Sesli Sözlük Dizi :" +seslisay+"  "+sozlukdizi[i]);//sesli sayý iki ve daha fazlaydsa sözliük dizisindekileri sesli attýk
	        seslisozlukdizi[seslindeks] =sozlukdizi[i];//sözlük dizideki indekslerini tanýmladýk.
	        seslindeks +=1;}//her seferinde bir artýrarak sýrasýna göre yazmasýný saðladýk.
	    }
	 // Rasgele harfli kelimeleri ve En az iki sesli kelimeleri ayrý ayrý yazdýrýyoruz.
	    System.out.println("Rasgele Sözlük Dizisi : ");  
	    for (int i=0; i<10000; i++){ System.out.print(" - "+ sozlukdizi[i]);}
	    System.out.println(" - ");
	    System.out.println("En az iki Sesli harfli Sözlük Dizisi : ");
	    for (int i=0; i<seslindeks; i++){ System.out.print(" - "+ seslisozlukdizi[i]);}//kaç tane sesli harf bulduysak yazdýrdýk.
	}	
}	

