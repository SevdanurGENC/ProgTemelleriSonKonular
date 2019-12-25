package recursiveMetodlar;

import java.util.Scanner;

public class ornek02 {
	public static int toplam(int sayi) {
		if (sayi == 1) {
			return 1;
		} else {
			return sayi + toplam(sayi - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz :");
		int sayi = s.nextInt();
		System.out.println("Toplam : " + toplam(sayi));
	}

}
