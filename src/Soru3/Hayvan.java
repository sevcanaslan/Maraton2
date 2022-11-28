package Soru3;

public abstract class Hayvan {
	
	private String ad;
	private int kilodu, uzunluğu;
	private boolean tehlikeliMi;
	
	public Hayvan(String ad, int kilodu, int uzunluğu, boolean tehlikeliMi) {
		super();
		this.ad = ad;
		this.kilodu = kilodu;
		this.uzunluğu = uzunluğu;
		this.tehlikeliMi=tehlikeliMi;
		
	}

	public abstract String sesCikar();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilodu() {
		return kilodu;
	}

	public void setKilodu(int kilodu) {
		this.kilodu = kilodu;
	}

	public int getUzunluğu() {
		return uzunluğu;
	}

	public void setUzunluğu(int uzunluğu) {
		this.uzunluğu = uzunluğu;
	}

	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}

	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilodu=" + kilodu + ", uzunluğu=" + uzunluğu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}
	
	
	
	
}
