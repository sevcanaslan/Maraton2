package Soru3;

import java.util.ArrayList;

public class HayvanatBahcesi {

	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
	memeliHayvan.getMemeliHayvanListesi().add(memeliHayvan);
	}
	
	public void bahceyeSurungenEkle(Surungen surungen) {
		surungen.getSurungenHayvanListesi().add(surungen);
	}
	
	
	public void hayvanSesCikarsin(Hayvan h) {
		System.out.println(h.getAd()+h.sesCikar());
	}
	
	
	public void hayvanBilgileriniYazdir(String hayvanAdi, MemeliHayvan memeliHayvan) {
		
		if(memeliHayvan.getAd()==hayvanAdi) {
			System.out.println("Hayvan adı:"+ memeliHayvan.getAd()+ "\nHayvanın kilosu: "+ memeliHayvan.getKilodu()+ "\nHayvanın uzunluğu: "+ memeliHayvan.getUzunluğu()+
					"\nHayvan tehlikeli mi? "+ memeliHayvan.isTehlikeliMi());
		}else {
			System.out.println(hayvanAdi+ " isimli hayvan hayvanat bahçesinde yoktur!");
		}
			
		}
	
	public void hayvanBilgileriniYazdir(String hayvanAdi,  Surungen surungen) {
		
		if(surungen.getAd()==hayvanAdi) {
			System.out.println("Hayvan adı:"+ surungen.getAd()+ "\nHayvanın kilosu: "+ surungen.getKilodu()+ "\nHayvanın uzunluğu: "+ surungen.getUzunluğu()+
					"\nHayvan tehlikeli mi? "+ surungen.isTehlikeliMi());
		}else {
			System.out.println(hayvanAdi+ " isimli hayvan hayvanat bahçesinde yoktur!");
		}
			
		}
	
	public void hayvaniHareketEttir(String hayvanAdi, MemeliHayvan memeliHayvan) {
		if(memeliHayvan.getAd()==hayvanAdi) {
			System.out.println(memeliHayvan.getAd()+memeliHayvan.yuru());
		}else {
			System.out.println(hayvanAdi+ " isimli hayvan hayvanat bahçesinde yoktur!");
		}
			
		
	}
	public void hayvaniHareketEttir(String hayvanAdi, Surungen surungen) {
		if(surungen.getAd()==hayvanAdi) {
			System.out.println(surungen.getAd()+surungen.surun());
		}else {
			System.out.println(hayvanAdi+ " isimli hayvan hayvanat bahçesinde yoktur!");
		}
			
		
	}

	public void hayvaninCinsiniBul(String hayvanAdi, MemeliHayvan memeliHayvan) {
		if(memeliHayvan.getAd()==hayvanAdi) {
			System.out.println(memeliHayvan.getAd()+ " bir " + memeliHayvan.tur());
		}
		
	}
	public void hayvaninCinsiniBul(String hayvanAdi,Surungen surungen) {
		if(surungen.getAd()==hayvanAdi) {
			System.out.println(surungen.getAd()+ " bir " + surungen.tur());
		}
		
	}
		
	
		
	}
	
	
	

