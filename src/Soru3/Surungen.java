package Soru3;

import java.util.ArrayList;

public abstract class Surungen extends Hayvan {
	
	
	private ArrayList <Surungen> surungenHayvanListesi;
	public abstract String tur();
	
	
	public Surungen(String ad, int kilodu, int uzunluğu, boolean tehlikeliMi) {
		super(ad, kilodu, uzunluğu,tehlikeliMi);
		this.surungenHayvanListesi = new ArrayList<Surungen>();
	}







	public ArrayList<Surungen> getSurungenHayvanListesi() {
		return surungenHayvanListesi;
	}







	public void setSurungenHayvanListesi(ArrayList<Surungen> surungenHayvanListesi) {
		this.surungenHayvanListesi = surungenHayvanListesi;
	}







	public abstract String surun();









}
