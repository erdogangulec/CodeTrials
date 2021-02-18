package vize;

import java.util.Scanner;

public class ders3 {
//dersler
	public ders3() {
		
		
		Scanner scan = new Scanner(System.in);
		
		String kd;
		
		System.out.println("bir yazý giriniz: ");
		kd = scan.next();
		
		int i,sayac,uzunluk;
		
		uzunluk = kd.length();
		
		sayac = 0;
		
		for(i=0;i<uzunluk;i++){
			if(kd.charAt(i)=='a') sayac++;
		}
	
		System.out.println("string " + sayac + "a harfi vardýr ");
		
	
	}
	

}
