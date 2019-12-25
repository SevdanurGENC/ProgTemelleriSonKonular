package recursiveMetodlar;

public class ornek03 {
	public static int diziyazdir(int dizi[], int uzunluk) {
		if (uzunluk == dizi.length - 1) {
			System.out.println(dizi[uzunluk]);
			return dizi[dizi.length - 1];
		} else {
			System.out.println(dizi[uzunluk]);
			return diziyazdir(dizi, uzunluk + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dizi[] = { 22, 9, 15, 63, 21, 47, 56 };
		diziyazdir(dizi, 0);
	}
}
