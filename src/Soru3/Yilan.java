package Soru3;

import java.util.ArrayList;

public class Yilan extends Surungen {
	
	private String tur = "Yilan";
	
	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public Yilan(String ad, int kilodu, int uzunluğu, boolean tehlikeliMi) {
		super(ad, kilodu, uzunluğu,tehlikeliMi);
		this.setTehlikeliMi(true);
		// TODO Auto-generated constructor stub
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
		 String tur = "Yılan";
			return tur;
		}

}
