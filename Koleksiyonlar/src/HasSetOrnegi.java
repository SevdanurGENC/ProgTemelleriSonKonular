import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasSetOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet();
		hashSet.add("Pubtekno");
		hashSet.add("Java Dersleri");
		hashSet.add("Collections Örnekleri");

		System.out.println(hashSet.toString());
		hashSet.remove("Collections Örnekleri");
		System.out.println(hashSet.toString());

		Iterator it = hashSet.iterator();
		while (it.hasNext()) {
			String value = (String) it.next();
			System.out.println("Deger : " + value);
		}
		System.out.println("Boyutu : " + hashSet.size()); 
		hashSet.clear();
		System.out.print(hashSet.toString());
	}

}
