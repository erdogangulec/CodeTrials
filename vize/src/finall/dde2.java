package finall;

import java.util.ArrayList;

public class dde2 {

	public static void main(String[] args) {
		
	String[] allStrings = new String[1000];
	ArrayList<String> atLeastTwoVowles = new ArrayList<String>();
	int[] vowels = { 65, 69, 73, 79, 85 };
	for (int i = 0; i < 1000; i++) {
		int[] arr = new int[5];
		char[] arr2 = new char[5];
		int k = 0;
		for (int j = 0; j < 5; j++) {
			arr[j] = (int) (Math.random() * (90 - 65 + 1) + 65);
		}

		for (int j = 0; j < 5; j++) {
			arr2[j] = (char) arr[j];
		}
		for (int j = 0; j < 5; j++) {
			for (int l = 0; l < 5; l++) {
				if (arr[j] == vowels[l])
					k++;
			}

		}
		String string = new String(arr2);

		if (k >= 2)
			atLeastTwoVowles.add(string);

		allStrings[i] = string;
	}
	System.out.println(allStrings[0]);
	System.out.println(atLeastTwoVowles.size());

}

}