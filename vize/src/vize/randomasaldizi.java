//ERDOÐAN GÜLEÇ
//19410051033
//Sýfýr ile bin arasýnda 500 tane rastgele sayý üretip bir diziye aktaran, ardýndan dizi içindeki asal sayýlarý bulup yeni bir diziye kaydeden kod.
package vize;

import java.util.Random;

public class randomasaldizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dizi = new int[500]; //500 elemanlý dizi tanýmlýyoruz.
		 
		 Random r = new Random(); //Random sýnýfý tanýmlýyoruz.
		 
		 for(int i=0; i<500; i++) {//500 random sayý üretiyoruz.
		 dizi[i] = r.nextInt(1000); //0-1000 arasýnda sayýlarý Random þekilde dizinin içine atýyoruz. 
		 System.out.print(dizi[i]+ "-");//random oluþturan kodun aktarýlan dizisini çalýþtýrýyor.
		 }
		 int[] diziasal = new int[501];//yeni bir dizi tanýmlýyoruz.
		 int s;//yeni int tanýmladým
		int x= 0;//yeni tanýmladýðým int'i sýfýra eþitledim
		int k = 0;//yeni tanýmladýðým int'i sýfýra eþitledim
		for(int j=0; j<500; j++) {//ilk for dögüsünü oluþturdum. Yeni oluþturduðum dizinin 501 eleman alýp bir arttýrmasýný saðlýyor.
			s=dizi[j];//tanýmladýðým int de oluþturulan sayýlarý j dizisine aktarýyoruz.
			x = 0;// sayac görevi gören int i sýfýra eþitliyoruz.
				for(int i=2; i<=s/2; i++){//yeni diziye aktarýlan sayýlarýn asal olup olmadýðýný buluyoruz.
					if(s%i==0){
						x++;//döngüye giren sayýlarý bir arttýrýyoruz.
						break;//dögüyü kýrýyoruz.
	    }
	   }
	        Boolean boolValue;//true ve false komutlarýný çalýþtýrmak için boolean ý tanýmlýyoruz.
	        if(x==0) {
	        	//dizideki asal sayý olanlarý doðru olarak iþaretliyor.
	        	Boolean durum = true;
	        	diziasal[k] = s;//asal olanlarý s den alýp k dizisine atýyor.
	        	k++;//k dizisinindeki sayýlarý bir arttýrýyor.
	        }else {
	        	boolean durum = false;	        
	        	
	        }	

		}		 	
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
		System.out.println("asal sayý dizisi:");
		System.out.println("----------------------------------------------------------------------------");
	 			for(int i=0; i<k; i++) {//k deðiþkenindeki sayýlarý alýp bir arttýrýyor.     
	 				System.out.print(diziasal[i]+ "-");//diziasal adlý diziyi terminale yazdýrýyoruz.
		 
	}

}
	
}	

