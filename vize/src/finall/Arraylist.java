//Erdo�an G�LE�
//19410051033
//Kullan�c�dan al�nan bir stringi harf harf ay�rarak bir ArrayListe y�kleyiniz. Daha sonra Arraylist'teki sesli harfleri remove eden kod.
package finall;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//kullan�c�n�n veri girmesi inin scan tan�ml�yoruz     
		System.out.println("Kelimenizi giriniz :");// kullan�c�dan veri al�yoruz
        String sozcuk = scan.nextLine();       
        ArrayList<Object> harf = new ArrayList<>(); //harfler i�in  yeni bir arrylist a��yoruz. bunu tan�mlad�ktan sonra get, add, remove benzeri �zellikleri kullanabildik.
        char sesliharf;
        for(int i = 0; i<= sozcuk.length()-1; i++) { // tek tek karakterleri b�l�yor//s�zc�k uzunlu�u i den k���kse  i yi bir artt�r
        char a = sozcuk.charAt(i);// a y� karakter olarqak tan�mlad�k, i deki karakterleri ay�rd�k
            harf.add(a);//harf olarak ekliyoruz.
        }  
        System.out.println("�lk Liste  :" + harf);//ilk listemizi yazd�r�yoruz. 
        for (int i = 0; i < harf.size(); i++)
        {// D�ng� i�inde sesli harfleri bulup siliyoruz.
        	sesliharf = (Character) harf.get(i);//�eklinde objecti char yapt�k
             if ( (sesliharf == 'a') || (sesliharf == 'e') || (sesliharf == '�') || (sesliharf == 'i') || (sesliharf == 'o') || (sesliharf == '�') || (sesliharf == 'u') || (sesliharf == '�'))
             {//bunu if d�ng�s�ne alarak, Arraylist'in i�indeki her kelimeyi kontrol edebildik.
                harf.remove(i);//remove'i kullanarak listenin i�indeki sesli harfleri sildik.
            }
        }    
      System.out.println("-------------------------------");
      System.out.println("Sesli harfleri silinmi� Liste :" + harf);//sesli harflerin silinmi� oldu�u listeyi yazd�r�yoruz.               
    }
}
