package vize;

abstract class soyut{//yeni s�n�f�m�z� tan�mlad�k. 
	abstract void soyutMetot();//i�inde herhangi bir i�lem yapmayan metotu tan�mlad�k.
	
	void somutMetot(){//somut metot rezervi edilmi� durumda bekliyor.
		System.out.println("somut metot");
		//somut metotu yazd�rd�k.
	}
}

class somut extends soyut{//somut bir metodu somut bir metoda extends ediyoruz(t�rettik).	
	void soyutMetot() {//soyut metot tan�mlad�k.
		System.out.println("soyut metot");//yazd�rd�k.
	}
		
	}


public class finall {

	public static void main(String[] args) {
		somut s = new somut();//somut metodu �o�alt�yoruz yani nesne haline getirdik.
		s.somutMetot();//somut metodu yazd�r�yoruz.
		s.soyutMetot();//soyut metodu yazd�r�yoruz.
		

	}

}
