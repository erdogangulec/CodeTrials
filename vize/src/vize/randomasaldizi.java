//ERDO�AN G�LE�
//19410051033
//S�f�r ile bin aras�nda 500 tane rastgele say� �retip bir diziye aktaran, ard�ndan dizi i�indeki asal say�lar� bulup yeni bir diziye kaydeden kod.
package vize;

import java.util.Random;

public class randomasaldizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dizi = new int[500]; //500 elemanl� dizi tan�ml�yoruz.
		 
		 Random r = new Random(); //Random s�n�f� tan�ml�yoruz.
		 
		 for(int i=0; i<500; i++) {//500 random say� �retiyoruz.
		 dizi[i] = r.nextInt(1000); //0-1000 aras�nda say�lar� Random �ekilde dizinin i�ine at�yoruz. 
		 System.out.print(dizi[i]+ "-");//random olu�turan kodun aktar�lan dizisini �al��t�r�yor.
		 }
		 int[] diziasal = new int[501];//yeni bir dizi tan�ml�yoruz.
		 int s;//yeni int tan�mlad�m
		int x= 0;//yeni tan�mlad���m int'i s�f�ra e�itledim
		int k = 0;//yeni tan�mlad���m int'i s�f�ra e�itledim
		for(int j=0; j<500; j++) {//ilk for d�g�s�n� olu�turdum. Yeni olu�turdu�um dizinin 501 eleman al�p bir artt�rmas�n� sa�l�yor.
			s=dizi[j];//tan�mlad���m int de olu�turulan say�lar� j dizisine aktar�yoruz.
			x = 0;// sayac g�revi g�ren int i s�f�ra e�itliyoruz.
				for(int i=2; i<=s/2; i++){//yeni diziye aktar�lan say�lar�n asal olup olmad���n� buluyoruz.
					if(s%i==0){
						x++;//d�ng�ye giren say�lar� bir artt�r�yoruz.
						break;//d�g�y� k�r�yoruz.
	    }
	   }
	        Boolean boolValue;//true ve false komutlar�n� �al��t�rmak i�in boolean � tan�ml�yoruz.
	        if(x==0) {
	        	//dizideki asal say� olanlar� do�ru olarak i�aretliyor.
	        	Boolean durum = true;
	        	diziasal[k] = s;//asal olanlar� s den al�p k dizisine at�yor.
	        	k++;//k dizisinindeki say�lar� bir artt�r�yor.
	        }else {
	        	boolean durum = false;	        
	        	
	        }	

		}		 	
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
		System.out.println("asal say� dizisi:");
		System.out.println("----------------------------------------------------------------------------");
	 			for(int i=0; i<k; i++) {//k de�i�kenindeki say�lar� al�p bir artt�r�yor.     
	 				System.out.print(diziasal[i]+ "-");//diziasal adl� diziyi terminale yazd�r�yoruz.
		 
	}

}
	
}	

