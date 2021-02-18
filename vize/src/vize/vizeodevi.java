//19410051033
//Erdoðan Güleç
//Kendisine gönderilen sayý tek ise true, çift ise false deðeri döndüren method

package vize;


import java.util.Scanner;


public class vizeodevi {
	static Scanner a=new Scanner(System.in);//a için bir scanner tanýmladým.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bir sayý giriniz: ");//kullanýcýdan bir sayý girmesini istiyorum.
	int b=a.nextInt();//girilen verinin bir int olduðunu kayýt ediyorum.
	
	Boolean boolValue;//Booleaný kullanmak için boolValuei açýyorum. 
	if(b%2==0) {//girilen sayý eðer çift ise komutu.
		Boolean durum = false;//Boolean yardýmý ile çift sayý false döndürüyor.
		System.out.println(durum);//konsola yazdýrýyor.
	}else {// eðer bu olasýlýklarýn tersi olursa yani sayý tek ise
		boolean durum = true;//Boolean yardýmý ile true döndürüyor
		System.out.println(durum);//konsola yazdýrýyor.
		
		
	}
		
	}
}	

	
	


