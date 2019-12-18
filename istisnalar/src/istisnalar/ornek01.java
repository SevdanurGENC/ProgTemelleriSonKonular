package istisnalar;

public class ornek01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int sayi1, sayi2;
		//sayi1 = 0;
		//sayi2 = 62 / sayi1;
		//System.out.println(sayi2);

		int sayi1, sayi2;
		try {
			sayi1 = 0;
			sayi2 = 62 / sayi1;
			System.out.println(sayi2);
			System.out.println("try blogunun sonu.");
		} catch (ArithmeticException e) {
			// Bu blok sadece try blogunda herhangi bir Aritmetik istisna meydana gelirse
			// calisir.
			System.out.println("Bir sayiyi sifira bolmemelisiniz!");
		} catch (Exception e) {
			// Genel bir istisna isleyicisidir (tum hatalari alabilir).
			System.out.println("Istisna gerceklesti!");
		}
		System.out.println("Try-Catch blogunun disidir.");

	}

}
