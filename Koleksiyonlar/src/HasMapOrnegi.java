import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");

		System.out.println(hashMap.toString());
		
		Set s = hashMap.entrySet();
		//set, map icindeki anahtar oge ciftlerini ceker
		//iterator map icindeki degerleri tarar.
		for (Iterator i = s.iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		hashMap.remove(3);
		System.out.println(hashMap.toString());
	}

}
