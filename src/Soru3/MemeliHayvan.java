package Soru3;

import java.util.ArrayList;

public abstract class MemeliHayvan extends Hayvan {
	
	
	private ArrayList <Hayvan> MemeliHayvanListesi;
	
	public abstract String yuru();
	public abstract String tur();
	

	public MemeliHayvan(String ad, int kilodu, int uzunluğu,boolean tehlikeliMi) {
		super(ad, kilodu, uzunluğu,tehlikeliMi);
		this.MemeliHayvanListesi = new ArrayList<>();
	}

	

	

	public ArrayList<Hayvan> getMemeliHayvanListesi() {
		return MemeliHayvanListesi;
	}


	public void setMemeliHayvanListesi(ArrayList<Hayvan> memeliHayvanListesi) {
		this.MemeliHayvanListesi = memeliHayvanListesi;
	}


	@Override
	public String toString() {
		return super.toString()+"MemeliHayvan [memeliHayvanListesi=" + MemeliHayvanListesi + ", getAd()=" + getAd() + ", getKilodu()="
				+ getKilodu() + ", getUzunluğu()=" + getUzunluğu() + ", isTehlikeliMi()=" + isTehlikeliMi() + "]";
	}
	
	

}
