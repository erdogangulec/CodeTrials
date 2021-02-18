//ERDO�AN G�LE�
//19410051033
//ASCII kodlar�n�(sesli harfler i�in 65-90) kullanarak 5 harfli 10000 adet rastgele stringler �reten ve Ard�ndan en az iki sesli harf i�eren elemanlar� ba�ka bir diziye aktaran kod.
package finall;
import java.util.Random;
public class dde1 {
	public static void main (String args [] ) {
		String xyz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//string olarak harflerimizi tan�mlad�k.
		String[] sozlukdizi = new String[10000];//string dizisi olu�turduk tan�mlad�k
		String[] seslisozlukdizi = new String[10000]; // ��inde en az iki sesli kelime ge�en harfler i�in tan�mlad�k.
		Random rasgele = new Random();//random komutunu rasgele ye tan�mlad�k.
		for (int i=0; i<10000; i++){//onbin adet string �retiyoruz.
		//rasgele 5 adet harf �retiyoruz
		char a = xyz.charAt(rasgele.nextInt(xyz.length()));
		char b = xyz.charAt(rasgele.nextInt(xyz.length()));
        char c = xyz.charAt(rasgele.nextInt(xyz.length()));
        char d = xyz.charAt(rasgele.nextInt(xyz.length()));
        char e = xyz.charAt(rasgele.nextInt(xyz.length()));
        String beslikelime =String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d)+String.valueOf(e);      
      //stringe atayan fonksiyon karakterini stirnge �evirdik 
        sozlukdizi[i] = beslikelime;//sozlukdizi[i] yi beslikelime ye atad�k.
        System.out.println("Rasgele 5 harfli S�zl�k Dizi :" +i+"  "+sozlukdizi[i]);
                System.out.print(beslikelime);
     // �retti�in 5 harfli kelimelerde Sesli harf var m�, kontrol et.
		}
        int seslindeks = 0;//sesli indeksi tan�mlad�k.
	    for (int i=0; i<10000; i++){// 0 dan 10000 e kadar s�zl�k dizisine att���m�z stringleri tan�mlad�k. 		
	    	String sozcuk = sozlukdizi[i];
	    	char[] sozdizi = new char[5];// s�zdizi yi be� karakterli bir char olarak tan�mlad�k.
	        int seslisay = 0;//sesli harfleri bulan indeks.
	        for(int j = 0; j< 5; j++) { 
	        char a = sozcuk.charAt(j);
	        sozdizi[j] = a; // Sesli harfleri buluyoruz.
	        if ((sozdizi[j] == 'A' ) || (sozdizi[j] == 'E' ) || (sozdizi[j] == 'I' )|| (sozdizi[j] == 'O' ) || (sozdizi[j] == 'U' ) ) {
	        	//sozdizi adl� dizinin i�inde olan sesli harfleri kontrol ediyoruz.
	        	seslisay += 1; }
	        }  
	        // Sesli harfler 2 ve daha fazlaysa ayr� bir diziye atad�k.
	        if (seslisay > 1) { System.out.println(seslindeks+ ". En az iki harfi Sesli S�zl�k Dizi :" +seslisay+"  "+sozlukdizi[i]);//sesli say� iki ve daha fazlaydsa s�zli�k dizisindekileri sesli att�k
	        seslisozlukdizi[seslindeks] =sozlukdizi[i];//s�zl�k dizideki indekslerini tan�mlad�k.
	        seslindeks +=1;}//her seferinde bir art�rarak s�ras�na g�re yazmas�n� sa�lad�k.
	    }
	 // Rasgele harfli kelimeleri ve En az iki sesli kelimeleri ayr� ayr� yazd�r�yoruz.
	    System.out.println("Rasgele S�zl�k Dizisi : ");  
	    for (int i=0; i<10000; i++){ System.out.print(" - "+ sozlukdizi[i]);}
	    System.out.println(" - ");
	    System.out.println("En az iki Sesli harfli S�zl�k Dizisi : ");
	    for (int i=0; i<seslindeks; i++){ System.out.print(" - "+ seslisozlukdizi[i]);}//ka� tane sesli harf bulduysak yazd�rd�k.
	}	
}	

