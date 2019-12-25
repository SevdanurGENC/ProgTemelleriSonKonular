package recursiveMetodlar;

// Recursive Özyinelemeli Fonksiyon,Bir problemi çözerken alt problemlere bölerek basite indirgeyen,kendi kendini çağırarak bir döngü gibi çalışan fonksiyonlardır.
// Recursive fonksiyon oluşturulurken dikkat edilmesi gereken nokta,fonksiyonun bitmesini sağlayan şart mutlaka belirtilmelidir.


public class ornek01 {

	public static int sayiyazdir(int sayi) {
		if (sayi == 10) {
			System.out.println(sayi);
			return sayi;
		} else {
			System.out.println(sayi);
			return sayiyazdir(sayi + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sayiyazdir(1));
	}
}
