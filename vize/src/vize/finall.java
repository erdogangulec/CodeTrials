package vize;

abstract class soyut{//yeni sýnýfýmýzý tanýmladýk. 
	abstract void soyutMetot();//içinde herhangi bir iþlem yapmayan metotu tanýmladýk.
	
	void somutMetot(){//somut metot rezervi edilmiþ durumda bekliyor.
		System.out.println("somut metot");
		//somut metotu yazdýrdýk.
	}
}

class somut extends soyut{//somut bir metodu somut bir metoda extends ediyoruz(türettik).	
	void soyutMetot() {//soyut metot tanýmladýk.
		System.out.println("soyut metot");//yazdýrdýk.
	}
		
	}


public class finall {

	public static void main(String[] args) {
		somut s = new somut();//somut metodu çoðaltýyoruz yani nesne haline getirdik.
		s.somutMetot();//somut metodu yazdýrýyoruz.
		s.soyutMetot();//soyut metodu yazdýrýyoruz.
		

	}

}
