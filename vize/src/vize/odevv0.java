package vize;

interface personel{//interface'i tan�ml�yoruz.
	public void personelkod();
	public void personelad();
// bunlar� rezervi etmi� olduk.
}


class personelSinifi implements personel{//iki fonksiyonu kullanmak i�in implements ediyoruz
	public void personelkod() {
		System.out.println("000001486");
	}

	public void personelad() {
		System.out.println("Emre");
	}
		//fonksiyonlar�m�z tan�mlad�k hepsini g�revlendirdik
}	
	

public class odevv0 {

	public static void main(String[] args) {
		personelSinifi s = new personelSinifi();//s nesnesi olu�turduk
		s.personelkod();
		s.personelad();
	}// personel s�n�f�ndaki fonksiyonlar� �al��t�racak

}
