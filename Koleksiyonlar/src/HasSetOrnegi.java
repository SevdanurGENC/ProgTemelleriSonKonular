import java.util.HashSet;

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
        hashSet.clear(); 
        System.out.print(hashSet.toString());
	}

}
