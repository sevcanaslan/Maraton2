package Soru3;

public class Aslan extends MemeliHayvan {
	
	
	
	

	public Aslan(String ad, int kilodu, int uzunluğu, boolean tehlikeliMi) {
		super(ad, kilodu, uzunluğu, tehlikeliMi);
		this.setTehlikeliMi(true);
		
		
	}
	
	public String yuru() {
		String metin =" yürüyor...";
		return metin;
	
		
	}



	@Override
	public String sesCikar() {
		String metin =" kükrüyor...";
		return metin;
		
	}

	@Override
	public String tur() {
	 String tur = "Aslan";
		return tur;
	}

}
