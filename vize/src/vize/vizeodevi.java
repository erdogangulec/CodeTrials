//19410051033
//Erdo�an G�le�
//Kendisine g�nderilen say� tek ise true, �ift ise false de�eri d�nd�ren method

package vize;


import java.util.Scanner;


public class vizeodevi {
	static Scanner a=new Scanner(System.in);//a i�in bir scanner tan�mlad�m.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bir say� giriniz: ");//kullan�c�dan bir say� girmesini istiyorum.
	int b=a.nextInt();//girilen verinin bir int oldu�unu kay�t ediyorum.
	
	Boolean boolValue;//Boolean� kullanmak i�in boolValuei a��yorum. 
	if(b%2==0) {//girilen say� e�er �ift ise komutu.
		Boolean durum = false;//Boolean yard�m� ile �ift say� false d�nd�r�yor.
		System.out.println(durum);//konsola yazd�r�yor.
	}else {// e�er bu olas�l�klar�n tersi olursa yani say� tek ise
		boolean durum = true;//Boolean yard�m� ile true d�nd�r�yor
		System.out.println(durum);//konsola yazd�r�yor.
		
		
	}
		
	}
}	

	
	


