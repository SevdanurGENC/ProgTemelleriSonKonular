import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosyaislemleri {

	public static void DosyaOlustur(String URL) {
		File dosya = new File(URL);
		//File, var olan dosyalar icin bilgi almada kullanilir.
		try {
			if (!dosya.exists()) {
				dosya.createNewFile();
				System.out.println(dosya.getName() + " adli dosya olusturuldu..");
			} else {
				System.out.println("Dosya oldugundan olusturma islemi yapilmayacaktir. ");
			}
		} catch (IOException e) {  //temel girdi cikti islemleriyle ilgilidir,
			//bekleneinin disinda bir deger girildiginde olusan hatadir.
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void DosyaSil(String URL) {
		File dosya = new File(URL);
		if (!dosya.exists()) {
			System.out.println("Dosya bulunamadigindan silinemedi");
		} else {
			dosya.delete();
			System.out.println(dosya.getName() + " adli dosya basarili bir sekilde silinmistir.");
		}
	}

	public static void DosyaOku(String URL) {
		File dosya = new File(URL);
		try { //Byte tabanlidir. Byte dizilerin ya da byte’larin tek tek okunmasini saglar.
			FileInputStream fis = new FileInputStream(dosya);
			int dosyaBoyutu = (int) dosya.length();
			System.out.println("\nDosya uzunlugu : " + dosyaBoyutu);
			for (int i = 0; i < dosyaBoyutu; i++) {
				System.out.print((char) fis.read());
			}
			fis.close();
		} catch (FileNotFoundException e) { //file bulunamadiysa gerceklesen istisna durumu.
			// TODO: handle exception
			System.out.println("Dosya Bulunamadi..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void DosyaYazma(String URL) {
		File dosya = new File(URL);
		try { //Byte tabanlidir. Byte dizilerin ya da byte’larin tek tek yazilmasini saglar.
			FileOutputStream fos = new FileOutputStream(dosya);
			String icerik = "Taskopru MYO. \nBilgisayar Programciligi";
			fos.write(icerik.getBytes());
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void DosyaOkumaWithScanner(String URL) {
		File dosya = new File(URL);
		try {
			Scanner dosyaOku = new Scanner(dosya);
//	          while(scanner.hasNext()){ // kelime kelime okur. bosluklar silinir.
//	              System.out.print(scanner.next());
//	          }

			while (dosyaOku.hasNextLine()) {
				System.out.println(dosyaOku.nextLine()); // satir satir okur
			}

			dosyaOku.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Dosya Bulunamadi..");
		}

	}

	public static void DosyayaVeriEkleme(String URL) {

		BufferedWriter bw = null;  //Karakterlerin dosyalara yazilmasini saglar.
		File dosya = new File(URL);
		try { // fileWriter nesnesine true parametre yazarsak eklenen content'i dosyanin
				// sonuna ekler
			FileWriter dosyayaYazma = new FileWriter(dosya, true);
			bw = new BufferedWriter(dosyayaYazma);

			String icerik = "Merhaba Dünya";
			bw.write(icerik);
			bw.flush();
			bw.close();
			System.out.println("\nicerik dosyaya eklendi...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosyaislemleri.DosyaOlustur("deneme.txt");
		dosyaislemleri.DosyaOku("deneme.txt");
		dosyaislemleri.DosyaYazma("deneme.txt"); // var olan dosyayi silip uzerine yazar 
		dosyaislemleri.DosyaOku("deneme.txt");

		dosyaislemleri.DosyayaVeriEkleme("deneme.txt");
		dosyaislemleri.DosyaOku("deneme.txt");

		// dosyaislemleri.DosyaOkumaWithScanner("deneme.txt");
		// dosyaislemleri.DosyaSil("deneme.txt");
	}

}
