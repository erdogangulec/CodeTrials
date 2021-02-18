package vize;
import java.util.ArrayList;
import java.util.Scanner;
public class bell01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//kullanýcýnýn veri girmesi inin scan tanýmlýyoruz
        
		System.out.println("Kelimenizi giriniz :");// kullanýcýdan veri alýyoruz
        String sozcuk = scan.nextLine();
        
        ArrayList<Object> harf = new ArrayList<>(); //harfler için  yeni bir arrylist açýyoruz
        
//        for (int i = 0; i < kelime.length(); i++) {
        for(int i = 0; i<= sozcuk.length()-1; i++) { // tek tek karakterleri bölüyor//sözcük uzunluðu i den küçükse  i yi bir arttýr
        char a = sozcuk.charAt(i);// a yý karakter olarqak tanýmladýk// i deki karakterleri ayýrdýk
            harf.add(a);//harf olarak ekliyoruz.
        }  
        System.out.println("Ýlk List  :" + harf);//ilk listemizi yazdýrýyoruz
        
        for (int i = 0; i < harf.size(); i++) {// 
            if(harf.get(i).equals('a') || harf.get(i).equals('e') ||  harf.get(i).equals('ý') || harf.get(i).equals('i') || harf.get(i).equals('u') || harf.get(i).equals('ü') || harf.get(i).equals('o') || harf.get(i).equals('ö')){
                harf.remove(i);

            }
        }    
      System.out.println("-------------------------------");
      System.out.println("-------------------------------");
      System.out.println("Son List :" + harf);//sesli harflerin silinmiþ olduðu listeyi çalýþtýrýyoruz.
        
            
    }

}
