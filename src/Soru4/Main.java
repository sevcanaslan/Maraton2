package Soru4;

public class Main {

	public static void main(String[] args) {
	Yolcu yolcu = new BusinessYolcu(7755, "Mert ", "Kaya", true);
	Yolcu yolcu2 = new EkonomiYolcu(889, "Ahmet ", "Demir");
	Yolcu yolcu3 = new BusinessYolcu(555, "Mert ", "Kaya", false);
	yolcu.biletiniAl(EFirmaAdi.THY);
	yolcu3.biletiniAl(EFirmaAdi.THY);
	yolcu2.biletiniAl(EFirmaAdi.THY);
	}

}
