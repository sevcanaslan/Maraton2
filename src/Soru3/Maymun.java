package Soru3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilodu, int uzunluğu, boolean tehlikeliMi) {
		super(ad, kilodu, uzunluğu,tehlikeliMi);
		this.setTehlikeliMi(false);
		
	}

	@Override
	public String yuru() {
		String metin =" yürüyor...";
		return metin;
		
	}

	@Override
	public String sesCikar() {
		String metin =" ses çıkarıyor...";
		return metin;
		
		
	}	public String tur() {
		 String tur = "Maymun";
			return tur;
		}

}
