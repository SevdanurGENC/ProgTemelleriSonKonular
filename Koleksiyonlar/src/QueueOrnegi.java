import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FIFO(First in First out) yapisindadir. Yani ilk giren ilk cikar
		Queue<Integer > kuyruk = new PriorityQueue< Integer >();
		kuyruk.add(new Integer(1));
		kuyruk.add(new Integer(2));
		kuyruk.add(new Integer(3));
		kuyruk.add(new Integer(4));

		System.out.println(kuyruk.poll()); 
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println("Size="+kuyruk.size()); 
		
		
	}

}
