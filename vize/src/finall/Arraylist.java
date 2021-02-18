//Erdoðan GÜLEÇ
//19410051033
//Kullanýcýdan alýnan bir stringi harf harf ayýrarak bir ArrayListe yükleyiniz. Daha sonra Arraylist'teki sesli harfleri remove eden kod.
package finall;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//kullanýcýnýn veri girmesi inin scan tanýmlýyoruz     
		System.out.println("Kelimenizi giriniz :");// kullanýcýdan veri alýyoruz
        String sozcuk = scan.nextLine();       
        ArrayList<Object> harf = new ArrayList<>(); //harfler için  yeni bir arrylist açýyoruz. bunu tanýmladýktan sonra get, add, remove benzeri özellikleri kullanabildik.
        char sesliharf;
        for(int i = 0; i<= sozcuk.length()-1; i++) { // tek tek karakterleri bölüyor//sözcük uzunluðu i den küçükse  i yi bir arttýr
        char a = sozcuk.charAt(i);// a yý karakter olarqak tanýmladýk, i deki karakterleri ayýrdýk
            harf.add(a);//harf olarak ekliyoruz.
        }  
        System.out.println("Ýlk Liste  :" + harf);//ilk listemizi yazdýrýyoruz. 
        for (int i = 0; i < harf.size(); i++)
        {// Döngü içinde sesli harfleri bulup siliyoruz.
        	sesliharf = (Character) harf.get(i);//þeklinde objecti char yaptýk
             if ( (sesliharf == 'a') || (sesliharf == 'e') || (sesliharf == 'ý') || (sesliharf == 'i') || (sesliharf == 'o') || (sesliharf == 'ö') || (sesliharf == 'u') || (sesliharf == 'ü'))
             {//bunu if döngüsüne alarak, Arraylist'in içindeki her kelimeyi kontrol edebildik.
                harf.remove(i);//remove'i kullanarak listenin içindeki sesli harfleri sildik.
            }
        }    
      System.out.println("-------------------------------");
      System.out.println("Sesli harfleri silinmiþ Liste :" + harf);//sesli harflerin silinmiþ olduðu listeyi yazdýrýyoruz.               
    }
}
