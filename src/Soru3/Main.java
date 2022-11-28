package Soru3;

public class Main {

	public static void main(String[] args) {
		
		HayvanatBahcesi hayvanatBahcesi =new HayvanatBahcesi();
		Aslan aslan= new Aslan("Simba", 100, 120,true);
		Yilan yilan = new  Yilan("Terminator", 40, 225, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50,false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200,true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Leo", 2, 35,false));
		
		
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		System.out.println("\n-+-+-+-+-+-+-+");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Simba", aslan);
		hayvanatBahcesi.hayvanBilgileriniYazdir("asl", aslan);
		System.out.println("\n-+-+-+-+-+-+-+");
		hayvanatBahcesi.hayvaniHareketEttir("Simba", aslan);
		System.out.println("\n-+-+-+-+-+-+-+");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba", aslan);
		hayvanatBahcesi.hayvaninCinsiniBul("Terminator", yilan);
		

	}

}
