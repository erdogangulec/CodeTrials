//ERDO�AN G�LE�
//19410051033
//Be� basamakl� Lynch-Bell say�lar�n� bulan program.
//A��klama:
//Belirledi�imiz aral�ktaki say�lar� teker teker alarak her bir basama�� b�t�n olan say�ya b�l�yoruz e�er b�t�n basamaklar say�y� b�l�yorsa Lynch-Bell say�s� anlam�na gelir. 
//ve ard�ndan yazd�r�yoruz.
// Tabii ki s�f�ra b�l�nma hatas� almamak i�in bir if blo�unda hi�bir basama��n s�f�r olmamas� i�in k�s�tlama yap�yoruz. 
package vize;

public class LynchBellsayilari {

	public static void main(String[] args) {
		
       int birler = 0, onlar, yuzler, binler, onbinler = 0;//b�t�n basamak de�erlerini tan�mlad�k.
    
       
       int adet= 0;//ka� adet say� oldu�unu bulmak i�in int tan�mlad�k.
       for(int i=10000; i<=99999; i++)//for d�ng�s� ile be� basamakl� say�lar� �retiyoruz.
        		  {
     
         onbinler = (i%100000)/10000;
		 binler = (i%10000)/1000;
		 yuzler = (i%1000)/100;
		 onlar = (i%100)/10; 				
		 birler = (i%100)%10;
		//ald��� tam say�lar� tek tek basamaklar�na ay�r�yor.

		 
		if ((onbinler!=0) && (binler!=0) && (yuzler!=0) && (onlar!=0) && (birler!=0)){						
		//s�f�ra b�l�nme hatas� almamak i�in hi�bir basamakta s�f�r olmamas� i�in tan�ml�yoruz.
			

		if((i%onbinler==0) && (i%binler==0) && (i%yuzler==0) && (i%onlar==0) && (i%birler==0)){			 
		//her basamaktaki say� b�t�n olan say�y� kalans�z b�lmesi i�in bir if olu�turduk.	
			 	
			  adet++;//yaz�lan her say�dan sonra kendini bir artt�r�yor.

		      System.out.println(+adet+". Lynch-Bell say�:"+"\t"+i);//terminale yazd�r�yoruz.
		     

	  }
      }

       
	}	

    }
    }
