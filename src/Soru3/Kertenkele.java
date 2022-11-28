package Soru3;

import java.util.ArrayList;

public class Kertenkele extends Surungen {
	private String tur = "Kertenkele";

	public Kertenkele(String ad, int kilodu, int uzunluğu, boolean tehlikeliMi) {
		super(ad, kilodu, uzunluğu,tehlikeliMi );
		this.setTehlikeliMi(false);
		
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String surun() {
		String metin ="  sürünüyor...";
		return metin;
	
	}

	@Override
	public String sesCikar() {
		String metin ="  tıslıyor...";
		return metin;
		
	}
	public String tur() {
		 String tur = "Kertenkele";
			return tur;
		}
}
