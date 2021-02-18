package nesne;

class hayvan{
	public void ses() {
		System.out.println("Hayvanın çıkarttığı ses");
		
	}
}

class kedi extends hayvan{
	public void ses() {
		System.out.println("miyav");
	}
}

class kopek extends kedi{
	public void ses() {
		System.out.println("hav hav ");
	}
}

class hses extends hayvan{
	public void hsesi(hayvan Hayvan) {
		Hayvan.ses();
	}
}


