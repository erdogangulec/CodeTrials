
//Erdo�an G�le�
//19410051033
//KULLANICININ G�RD��� SAYI ASAL �SE "true" ASAL SAYI DE��LSE "false" DE�ER�N� YAZAN KOD
package vize;


import java.util.Scanner;


public class vizeodev2 {
	
	public static void main(String[] args) {
		 int s, x=0;// bir int tan�ml�yoruz ve bir sayac olarak x i s�f�ra e�itledim.
	        Scanner oku=new Scanner(System.in);//kullan�c�dan veri almak i�in tan�ml�yoruz
	        System.out.print("Bir say� giriniz: ");//kullan�c�dan veri al�yoruz
	        s=oku.nextInt();//s int de�erini ba�ka bir int e tan�ml�yoruz.
	        for(int i=2; i<=s/2; i++){//kullan�c�n�n girdi�i say�n�n asal olup olmad��n� bulmak i�in for d�ng�m�z� olu�tursuk.
	            if(s%i==0){
	                  x++;//bir artt�rd�k
	                  break;//break ile for d�g�s�n� k�rd�k.
	    }
	   }
	        Boolean boolValue;//true false u bulmak i�in boolean olu�turuyoruz.
	        if(x==0) {
	        	Boolean durum = true;//girilen say� asal ise true d�nd�recek.
	        	System.out.println(s);//tan�mlad���m�z s yi �al��t�r�yor.
	        	System.out.println(durum);//durumu �al��t�r�yor.
	        }else {
	        	boolean durum = false;//girilen say� asal de�il ise false de�erini d�nd�r�yor.	        
	        	System.out.println(s);//tan�mlad���m�z s yi �al��it�r�yor
	        	System.out.println(durum);//durumu �al��t�r�yor.
	        }	
	
	}	
	
}	