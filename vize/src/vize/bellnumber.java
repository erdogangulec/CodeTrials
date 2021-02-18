package vize;

public class bellnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int basamak1,basamak2,basamak3,basamak4,basamak5;
	int birler,onlar,yuzler,binler,onbinler;
	int adet=0;
	for(int sayac = 10000; sayac<100000; sayac++) {
		
		birler=sayac%10;
		onlar=(sayac%100-birler/10);
		yuzler=((sayac%1000-onlar)-birler)/100;
		binler=(((sayac%10000-yuzler)-onlar)-birler)/1000;
		onbinler=((((sayac%100000-binler)-yuzler)-onlar)-birler)/10000;
		
		if(birler!=0&&onlar!=0&&yuzler!=0&&binler!=0&&onbinler!=0) {
	    
		basamak1=sayac%birler;
		basamak2=sayac%onlar;
		basamak3=sayac%yuzler;
		basamak4=sayac%binler;
		basamak5=sayac%onbinler;
		
		if(basamak1==0&&basamak2==0& basamak3==0&&basamak4==0&&basamak5==0) {
			adet++;
		 System.out.print(adet);
		 System.out.print("bell sayý");
		 System.out.println(sayac);
		}
		
			
		
		
		}

	}
	}

	}
