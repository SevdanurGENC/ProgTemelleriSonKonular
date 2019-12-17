import java.util.HashMap;

public class HasMapOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");

		System.out.println(hashMap.toString());
		hashMap.remove(3);
		System.out.println(hashMap.toString());
	}

}
