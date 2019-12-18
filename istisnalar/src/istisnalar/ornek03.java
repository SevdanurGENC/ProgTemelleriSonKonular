package istisnalar;

public class ornek03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] sayilar = {1, 2, 3};
		// System.out.println(sayilar[10]); // hata

		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Bir seyler yanlis gitti : " + e);
		} finally {
			System.out.println("Try-Catch blogu biterken yapilmasi gereken isler.");
		}

	}

}
