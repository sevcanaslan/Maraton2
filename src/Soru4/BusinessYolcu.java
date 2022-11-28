package Soru4;

import java.util.HashMap;

public class BusinessYolcu extends Yolcu {
	
	private boolean vipMi = false;
	private int BUSINNESFIYAT = 200, BUSINNESVIPFIYAT = 150;
	HashMap <String, Integer> biletler = new HashMap<>();
	
	
	
	public BusinessYolcu(int id, String ad, String soyad, boolean vipMi ) {
		super(id, ad, soyad);
		// TODO Auto-generated constructor stub
		this.vipMi = vipMi;
	}



	@Override
	public void biletiniAl(EFirmaAdi fitmaAdi) {
		//BASEFIYAT+ BUSINNESFIYAT +BUSINNESVIPFIYAT
		String firmaAdi=fitmaAdi.toString();  
		if(vipMi== true) {
			
			int fiyat= getBASEFIYAT()+BUSINNESFIYAT+BUSINNESVIPFIYAT;
			
			biletler.put(firmaAdi, fiyat);
			System.out.println(getAd()+ " isimli yolcu için VIP bilet alınmıştır. Biletiniz-> "+ biletler );
		}else {
			int fiyat2= getBASEFIYAT()+BUSINNESFIYAT;
			biletler.put(firmaAdi, fiyat2);
			System.out.println(getAd()+ " isimli yolcu için Business bilet alınmıştır. Biletiniz-> "+ biletler );
		}
		
	}

}
