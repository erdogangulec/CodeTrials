//ERDOÐAN GÜLEÇ
//19410051033
//Beþ basamaklý Lynch-Bell sayýlarýný bulan program.
//Açýklama:
//Belirlediðimiz aralýktaki sayýlarý teker teker alarak her bir basamaðý bütün olan sayýya bölüyoruz eðer bütün basamaklar sayýyý bölüyorsa Lynch-Bell sayýsý anlamýna gelir. 
//ve ardýndan yazdýrýyoruz.
// Tabii ki sýfýra bölünma hatasý almamak için bir if bloðunda hiçbir basamaðýn sýfýr olmamasý için kýsýtlama yapýyoruz. 
package vize;

public class LynchBellsayilari {

	public static void main(String[] args) {
		
       int birler = 0, onlar, yuzler, binler, onbinler = 0;//bütün basamak deðerlerini tanýmladýk.
    
       
       int adet= 0;//kaç adet sayý olduðunu bulmak için int tanýmladýk.
       for(int i=10000; i<=99999; i++)//for döngüsü ile beþ basamaklý sayýlarý üretiyoruz.
        		  {
     
         onbinler = (i%100000)/10000;
		 binler = (i%10000)/1000;
		 yuzler = (i%1000)/100;
		 onlar = (i%100)/10; 				
		 birler = (i%100)%10;
		//aldýðý tam sayýlarý tek tek basamaklarýna ayýrýyor.

		 
		if ((onbinler!=0) && (binler!=0) && (yuzler!=0) && (onlar!=0) && (birler!=0)){						
		//sýfýra bölünme hatasý almamak için hiçbir basamakta sýfýr olmamasý için tanýmlýyoruz.
			

		if((i%onbinler==0) && (i%binler==0) && (i%yuzler==0) && (i%onlar==0) && (i%birler==0)){			 
		//her basamaktaki sayý bütün olan sayýyý kalansýz bölmesi için bir if oluþturduk.	
			 	
			  adet++;//yazýlan her sayýdan sonra kendini bir arttýrýyor.

		      System.out.println(+adet+". Lynch-Bell sayý:"+"\t"+i);//terminale yazdýrýyoruz.
		     

	  }
      }

       
	}	

    }
    }
