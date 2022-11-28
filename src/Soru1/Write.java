package Soru1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Write {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Ali Kaya", "3123334455");
		hashMap.put("Seher Özkan", "2123236577");
		hashMap.put("Ahmet Genç", "2162223344");
		hashMap.put("Ali Öncü", "5353222288");

		BufferedWriter bf = null;
		File dosya = new File("rehber.txt");
		try {

			bf = new BufferedWriter(new FileWriter(dosya));
			for (Map.Entry<String, String> entry : hashMap.entrySet()) {

				// put key and value separated by a colon
				bf.write(entry.getKey() + ":" + entry.getValue());
				bf.newLine();
			}

			bf.flush();

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {

				// always close the writer
				bf.close();
			} catch (Exception e) {
			}
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen telefonunu aradığınız kişinin adı soyadını giriniz: ");
		String name = scanner.nextLine();

		try {
			FileReader file = new FileReader("rehber.txt");
			BufferedReader input = new BufferedReader(file);

			if (hashMap.containsKey(name)) {
				System.out.println(name + " isimli kişinin telefon numarası : " + hashMap.get(name));
			} else {
				System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
