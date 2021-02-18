package vize;

import java.util.Random;

public class denemeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Random rand = new Random();
	        int rasgelesayi = rand.nextInt(100);       
	        if (rasgelesayi%2 != 0) { rasgelesayi += 1;}    
	        System.out.println("Rasgele sayý = "+ rasgelesayi);
	}

}
