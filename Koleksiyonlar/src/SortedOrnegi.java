import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sorted listeleme icin kullanilir
		SortedSet<String> ss = new TreeSet<String>();
		ss.add("Volkan");
		ss.add("Gokhan");
		ss.add("Sabri");
		ss.add("Merve");
		ss.add("Ipek");
		
		Iterator it = ss.iterator();
		while (it.hasNext()) {
			String value = (String) it.next();
			System.out.println("Deger :" + value);
		}
	}

}
