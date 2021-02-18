package vize;

interface personel{//interface'i tanýmlýyoruz.
	public void personelkod();
	public void personelad();
// bunlarý rezervi etmiþ olduk.
}


class personelSinifi implements personel{//iki fonksiyonu kullanmak için implements ediyoruz
	public void personelkod() {
		System.out.println("000001486");
	}

	public void personelad() {
		System.out.println("Emre");
	}
		//fonksiyonlarýmýz tanýmladýk hepsini görevlendirdik
}	
	

public class odevv0 {

	public static void main(String[] args) {
		personelSinifi s = new personelSinifi();//s nesnesi oluþturduk
		s.personelkod();
		s.personelad();
	}// personel sýnýfýndaki fonksiyonlarý çalýþtýracak

}
