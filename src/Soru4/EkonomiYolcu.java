package Soru4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {
	


	private int EKONOMIFIYAT= 100;
	HashMap <String, Integer> biletler2 = new HashMap<>();
	
	
	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void biletiniAl(EFirmaAdi fitmaAdi) {
		String firmaAdi=fitmaAdi.toString();  
		for (int i =0; i<biletler2.size();i++) {
			if(biletler2.containsKey(firmaAdi)) {
				int fiyat= biletler2.replace(firmaAdi, biletler2.get(getBASEFIYAT()+EKONOMIFIYAT));
				System.out.println(getAd()+ " isimli yolcu için Ekonomik bilet alınmıştır. Biletiniz-> "+ biletler2 );
			}else {
				int fiyat2= getBASEFIYAT()+EKONOMIFIYAT;
				biletler2.put(firmaAdi, fiyat2);
				System.out.println(getAd()+ " isimli yolcu için Ekonomik bilet alınmıştır. Biletiniz-> "+ biletler2 );
			}
		
		
	}

}
}
