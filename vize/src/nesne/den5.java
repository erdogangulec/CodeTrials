package nesne;

import java.util.ArrayList;

public class den5 {

	public static void main(String[] args) {
		int dizi[] = new int[10];
		
		ArrayList<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(78);
		sayilar.add(90);
		sayilar.add(190);
		sayilar.add(34);
		sayilar.add(1, 82);
		sayilar.add(4, 13);
		System.out.println(sayilar);
		 
		System.out.println(sayilar.get(1));
		
		for (Integer x : sayilar) {
			System.out.print(x+" - ");
		}
		
		sayilar.remove(0);
		System.out.println(sayilar); 
		
	}

}
