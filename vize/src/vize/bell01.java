package vize;
import java.util.ArrayList;
import java.util.Scanner;
public class bell01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//kullan�c�n�n veri girmesi inin scan tan�ml�yoruz
        
		System.out.println("Kelimenizi giriniz :");// kullan�c�dan veri al�yoruz
        String sozcuk = scan.nextLine();
        
        ArrayList<Object> harf = new ArrayList<>(); //harfler i�in  yeni bir arrylist a��yoruz
        
//        for (int i = 0; i < kelime.length(); i++) {
        for(int i = 0; i<= sozcuk.length()-1; i++) { // tek tek karakterleri b�l�yor//s�zc�k uzunlu�u i den k���kse  i yi bir artt�r
        char a = sozcuk.charAt(i);// a y� karakter olarqak tan�mlad�k// i deki karakterleri ay�rd�k
            harf.add(a);//harf olarak ekliyoruz.
        }  
        System.out.println("�lk List  :" + harf);//ilk listemizi yazd�r�yoruz
        
        for (int i = 0; i < harf.size(); i++) {// 
            if(harf.get(i).equals('a') || harf.get(i).equals('e') ||  harf.get(i).equals('�') || harf.get(i).equals('i') || harf.get(i).equals('u') || harf.get(i).equals('�') || harf.get(i).equals('o') || harf.get(i).equals('�')){
                harf.remove(i);

            }
        }    
      System.out.println("-------------------------------");
      System.out.println("-------------------------------");
      System.out.println("Son List :" + harf);//sesli harflerin silinmi� oldu�u listeyi �al��t�r�yoruz.
        
            
    }

}
