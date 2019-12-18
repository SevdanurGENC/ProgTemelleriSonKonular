import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapOrnegi {
//MAP : anahtar - deger ciftleri ile calisir
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> ogrenci = new TreeMap<String, String>();
		ogrenci.put("20895229 ", "AKDENIZ YAGMUR DENIZ ");
		ogrenci.put("20794622 ", "ALP CEMRE MELEK ");
		ogrenci.put("20793656 ", "AYKUL FATMA BERNA ");
		ogrenci.put("20893958 ", "BAYDAR CANSU ");
		ogrenci.put("20794287 ", "DAGLIOGLU GOKHAN ");
		Set s = ogrenci.entrySet();
		//set, map icindeki anahtar oge ciftlerini ceker
		//iterator map icindeki degerleri tarar.
		for (Iterator i = s.iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		System.out.println();
	//	for (Iterator i = s.iterator(); i.hasNext();) {
	//		Map.Entry me = (Map.Entry) i.next();
	//		if (me.getValue() == "ALP CEMRE MELEK ")
	//			me.setValue("ERTONGA MERVE ");
	//		System.out.println(me.getKey() + " : " + me.getValue());
	//	}
	}

}
