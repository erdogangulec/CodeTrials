//Erdo�an G�LE� 
//19410051033
//Bilgisayar�n 2 den b�y�k 100 den k���k rastgele bir ��FT say� �retmesini sa�layarak. Bu �ift say�y� olu�turan asal �iftlerinin tamam�n� yazd�ran kod.
package finall;

import java.util.Random;

public class goldbach {

	public static void main(String[] args) {
		int n = 0;
        int p = 3;// en k���k tek asal say�.
        int q = 0;
   // Rasgele say� �retelim. Random �zelli�i kullan�yoruz.     
        Random rand = new Random(); //random tan�ml�yoruz.
        int rasgelesayi = rand.nextInt(100);// 100 ekadar random say� �retiyoruz.
   // Rasgele say�n�n 4-100 aral���nda ve �ift olmas�n� sa�l�yoruz.     
        if (rasgelesayi < 4) { rasgelesayi = 4;}
        if (rasgelesayi%2 != 0) { rasgelesayi += 1;}//bu sat�r tek random say�y� en yak�n �ifte getiriyor.
  // Rasgele say� bas�yoruz.     
        System.out.println("Rasgele say� = "+ rasgelesayi);
        System.out.println("Goldbach teoremi asal say� �iftleri: ");
        while(p < rasgelesayi){
            q = rasgelesayi - p;//p ve q say�lar�n� asal say�m� diye kontrol ediyoruz. 
            if(asalm�(p) && asalm�(q) && p <= q)
  // Rasgele �ift say�y� olu�turan asal say� �iftlerini yaz�yoruz.           	
             System.out.println(p + " + " + q);
             p += 2;
        }
  // Tek �ift asal say�.       
        if (rasgelesayi == 4) { System.out.println("2, 2");}
    }
   
    public static boolean asalm�(int n){// burada asal say� �iftlerini ar�yoruz.
        int f = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                f++;
        }// asal say�lar� buluyoruz.
        if(f == 2)//say� y� bolen iki asal say� oldu�u alam�na geliyor.
            return true;//iki say� asalsa true d�nd�r�yor.
        return false;
    }// f 2 den b�y�k olmas� o say�n�n asal olmad��� anlam�na gelir ve false d�nd�r�r.
		
} 

	
		
		

				 
		
		
		
		
		
	 


