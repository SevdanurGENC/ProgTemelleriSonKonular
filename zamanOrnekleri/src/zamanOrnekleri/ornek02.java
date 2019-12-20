package zamanOrnekleri;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ornek02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date simdiki = new Date();
		System.out.println(simdiki);

		DateFormat zamanformati = new SimpleDateFormat("yyyy/mm/dd");
		String strzaman = zamanformati.format(simdiki);
		System.out.println(strzaman);
	} 
}
