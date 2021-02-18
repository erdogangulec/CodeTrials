package vize;

import java.util.Random;
import java.util.Scanner;
public class denemee {

   
	        static boolean asal(int n) {
	            for(int i=2; i<=n/2; i++) {
	                if(n%i == 0) {
	                    return false;
	                }
	            }

	            return true;
	        }

	        static void goldbach(int n) {
	            if(n%2 != 0) { 
	                System.out.print("e�it de�il");
	                return;
	            }
	            if(n < 2) {
	                System.out.println("2'den az");
	                return;
	            }

	            for(int i=2; i<n/2 +1; i++) {
	                if(asal(i) && asal(n-i)) {
	                    System.out.println("iki asal toplam� = "+
	                          i +" + "+ (n-i) );
	                }
	            }
	        }

	        public static void main(String[] args) {
	            Scanner in = new Scanner(System.in);
	            System.out.println("Goldbach Say�lar� \n");

	            int num = in.nextInt();
	            System.out.println(" Bir say� giriniz: "+ num);
	            goldbach(num);


	    }

	}