package nesne;

class cokgen{
	protected int yukseklik;
	protected int genislik;
	
	public void set_genyuk(int a, int b) {
		yukseklik = a;
		genislik = b;
		
	}
}
class dortgen extends cokgen{
	public int alan() {
		return yukseklik*genislik;
	}
}
class dikUcgen extends cokgen{
	public int alan() {
		return yukseklik*genislik/2;
	}
}
public class den3 {

	public static void main(String[] args) {
		dortgen d = new dortgen();

		d.set_genyuk(5, 10);
		System.out.println("dörtgen alan: "+d.alan());
		
		dikUcgen du = new dikUcgen();
		du.set_genyuk(8, 4);
		System.out.println("dik üçgen alaný:"+ du.alan());
	
	}

}
