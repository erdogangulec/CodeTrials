package vize;
class ogrenci{
	private String ad;
	private String soyad;
	private int yas;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		if(yas>0) this.yas = yas; else System.out.println("yaþ sýfýrdan küçük olamaz");
	}
	
	
}
public class den1 {
	
	public static void main(String[] args) {
		ogrenci ogr1 = new ogrenci();//obje
		ogr1.setAd("erdoðan");
		System.out.println(ogr1.getAd());
		ogr1.setYas(5);	
		System.out.println(ogr1.getYas());
	}

}
 