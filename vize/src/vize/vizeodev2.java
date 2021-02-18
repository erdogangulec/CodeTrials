
//Erdoðan Güleç
//19410051033
//KULLANICININ GÝRDÝÐÝ SAYI ASAL ÝSE "true" ASAL SAYI DEÐÝLSE "false" DEÐERÝNÝ YAZAN KOD
package vize;


import java.util.Scanner;


public class vizeodev2 {
	
	public static void main(String[] args) {
		 int s, x=0;// bir int tanýmlýyoruz ve bir sayac olarak x i sýfýra eþitledim.
	        Scanner oku=new Scanner(System.in);//kullanýcýdan veri almak için tanýmlýyoruz
	        System.out.print("Bir sayý giriniz: ");//kullanýcýdan veri alýyoruz
	        s=oku.nextInt();//s int deðerini baþka bir int e tanýmlýyoruz.
	        for(int i=2; i<=s/2; i++){//kullanýcýnýn girdiði sayýnýn asal olup olmadýýný bulmak için for döngümüzü oluþtursuk.
	            if(s%i==0){
	                  x++;//bir arttýrdýk
	                  break;//break ile for dögüsünü kýrdýk.
	    }
	   }
	        Boolean boolValue;//true false u bulmak için boolean oluþturuyoruz.
	        if(x==0) {
	        	Boolean durum = true;//girilen sayý asal ise true döndürecek.
	        	System.out.println(s);//tanýmladýðýmýz s yi çalýþtýrýyor.
	        	System.out.println(durum);//durumu çalýþtýrýyor.
	        }else {
	        	boolean durum = false;//girilen sayý asal deðil ise false deðerini döndürüyor.	        
	        	System.out.println(s);//tanýmladýðýmýz s yi çalýþitýrýyor
	        	System.out.println(durum);//durumu çalýþtýrýyor.
	        }	
	
	}	
	
}	