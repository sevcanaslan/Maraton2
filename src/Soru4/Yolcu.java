package Soru4;

import java.util.Random;

public abstract class Yolcu {
	private String  Ad, Soyad;
	private int İd,koltukNo;
	private boolean checkin;
	private int BASEFIYAT= 100;
	
	
	Random rand = new Random(); 
	
	public abstract void biletiniAl(EFirmaAdi fitmaAdi);
	
	
	
	
	public Yolcu(int id, String ad, String soyad) {
		super();
		this.İd = id;
		Ad = ad;
		Soyad = soyad;
		
		this.koltukNo = rand.nextInt(35);
		this.checkin = checkin;
		
	}

	public int getİd() {
		return İd;
	}




	public void setİd(int id) {
		İd = id;
	}




	public Random getRand() {
		return rand;
	}




	public void setRand(Random rand) {
		this.rand = rand;
	}




	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public String getSoyad() {
		return Soyad;
	}
	public void setSoyad(String soyad) {
		Soyad = soyad;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean isCheckin() {
		return checkin;
	}
	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}
	public int getBASEFIYAT() {
		return BASEFIYAT;
	}
	public void setBASEFIYAT(int bASEFIYAT) {
		BASEFIYAT = bASEFIYAT;
	}
	
	

}
