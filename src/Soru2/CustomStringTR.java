package Soru2;

public class CustomStringTR {
	
	String metin;
	
	
	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}


	public int uzunluk() {
		return metin.length();
		
	}
	//1-
	public int indisNo() {
		return metin.indexOf("h");
		
	}
	//2-
	public String altDizi() {
		return metin.substring(0,2);
		
	}
	//3-
	public String kucukHarf() {
		return metin.toLowerCase();
		
	}
	//4-
	public String buyukHarf() {
		return metin.toUpperCase();
		
	}
	//5-
	public String degistir() {
		return metin.replace('m', 'H');
		
	}
	//6-
	public Boolean icerme() {
		return metin.contains("J");
		
	}
	//7-
	public Boolean aynıMı() {
		return metin.equals("Selam");
		
	}
	//8-
	public String birlestir() {
		return metin.concat(" sınıf");
		
	}
	//9-
	public char karakter() {
		return metin.charAt(2);
		
	}
	//10-
	public Boolean baslama() {
		return metin.startsWith("M");
	}


}
