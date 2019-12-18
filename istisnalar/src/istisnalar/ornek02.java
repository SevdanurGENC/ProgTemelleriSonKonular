package istisnalar;

public class ornek02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = new int[7];
		//a[4] = 30 / 0;
		
		
		try {
			int a[] = new int[7];
			a[4] = 30 / 0;
			System.out.println("Try blogundaki ilk print cumlesi");
		} catch (ArithmeticException e) {
			System.out.println("Uyari: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uyari: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Uyari: Bazi baska istisnalar");
		}
		System.out.println("Try-catch blogu disinda");

	}

}
