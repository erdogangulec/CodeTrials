//Erdoðan GÜLEÇ 
//19410051033
//Bilgisayarýn 2 den büyük 100 den küçük rastgele bir ÇÝFT sayý üretmesini saðlayarak. Bu çift sayýyý oluþturan asal çiftlerinin tamamýný yazdýran kod.
package finall;

import java.util.Random;

public class goldbach {

	public static void main(String[] args) {
		int n = 0;
        int p = 3;// en küçük tek asal sayý.
        int q = 0;
   // Rasgele sayý üretelim. Random özelliði kullanýyoruz.     
        Random rand = new Random(); //random tanýmlýyoruz.
        int rasgelesayi = rand.nextInt(100);// 100 ekadar random sayý üretiyoruz.
   // Rasgele sayýnýn 4-100 aralýðýnda ve çift olmasýný saðlýyoruz.     
        if (rasgelesayi < 4) { rasgelesayi = 4;}
        if (rasgelesayi%2 != 0) { rasgelesayi += 1;}//bu satýr tek random sayýyý en yakýn çifte getiriyor.
  // Rasgele sayý basýyoruz.     
        System.out.println("Rasgele sayý = "+ rasgelesayi);
        System.out.println("Goldbach teoremi asal sayý çiftleri: ");
        while(p < rasgelesayi){
            q = rasgelesayi - p;//p ve q sayýlarýný asal sayýmý diye kontrol ediyoruz. 
            if(asalmý(p) && asalmý(q) && p <= q)
  // Rasgele çift sayýyý oluþturan asal sayý çiftlerini yazýyoruz.           	
             System.out.println(p + " + " + q);
             p += 2;
        }
  // Tek çift asal sayý.       
        if (rasgelesayi == 4) { System.out.println("2, 2");}
    }
   
    public static boolean asalmý(int n){// burada asal sayý çiftlerini arýyoruz.
        int f = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                f++;
        }// asal sayýlarý buluyoruz.
        if(f == 2)//sayý yý bolen iki asal sayý olduðu alamýna geliyor.
            return true;//iki sayý asalsa true döndürüyor.
        return false;
    }// f 2 den büyük olmasý o sayýnýn asal olmadýðý anlamýna gelir ve false döndürür.
		
} 

	
		
		

				 
		
		
		
		
		
	 


