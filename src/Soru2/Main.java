package Soru2;

public class Main {

	public static void main(String[] args) {
		CustomStringTR customStr = new CustomStringTR("merhaba");
		
		//1
		System.out.println("h harfinin indis numarası:" +customStr.indisNo()); 
		//2
		System.out.println("0-2 arası harfler: " +customStr.altDizi()); 
		//3
		System.out.println("Küçük harfe çevir: " +customStr.kucukHarf()); 
		//4
		System.out.println("Büyük harfe çevir: " +customStr.buyukHarf()); 
		//5
		System.out.println("m harfi le H harfini değiştir: " +customStr.degistir());
		//6
		System.out.println("j harfi içeriyor mu?: " +customStr.icerme()); 
		//7
		System.out.println("metin Selam kelimesi ile aynı mı? " +customStr.aynıMı());
		//8
		System.out.println("metin'i sınıf kelimesi ile birleştir " +customStr.birlestir()); 
		//9
		System.out.println("2. indiste hangi harf var?: " +customStr.karakter()); 
		//10
		System.out.println("metin M ile mi başlıyor " +customStr.baslama()); 

	}

}
