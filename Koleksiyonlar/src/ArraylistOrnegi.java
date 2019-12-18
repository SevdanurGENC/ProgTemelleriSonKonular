import java.util.ArrayList;
import java.util.List;

public class ArraylistOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List liste = new ArrayList();
		liste.add("IZMIR");
		liste.add("ERZURUM");
		liste.add("GIRESUN");
		liste.add("KONYA");
		liste.add("ANTALYA");
		System.out.println("ArrayList'in elemanlari" + liste);
		System.out.println("3: " + liste.get(3));
		System.out.println("0: " + liste.get(0));

		System.out.println("Liste bos mu? " + liste.isEmpty());

		System.out.println("Deger iceriyor mu? " + liste.contains("GIRESUN"));

		System.out.println("Listeden silinecek deger : " + liste.remove(1));
		System.out.println("Silme isleminden sonra ArrayList : " + liste);

		liste.add(3, "DASGOPRU");
		System.out.println("ArrayList'in elemanlari : " + liste);
		System.out.println("Kacinci Sirada : " + liste.indexOf("DASGOPRU"));

		liste.set(3, "TASKOPRU");
		System.out.println("ArrayList'in elemanlari : " + liste);
		System.out.println("Kacinci Sirada : " + liste.lastIndexOf("RIZE"));

		System.out.println("Listenin Boyutu : " + liste.size());

		liste.add(3, "KASTAMONU");
		System.out.println("ArrayList'in elemanlari : " + liste);
		System.out.println("Listenin Boyutu : " + liste.size());
 
		liste.clear();
		System.out.println("Liste bosaltildi : " + liste);
	}

}
