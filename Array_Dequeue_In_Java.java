import java.util.*;
public class Array_Dequeue_In_Java {

	public static void main(String[] args) {
		ArrayDeque<Integer> d1 = new ArrayDeque<>();
		d1.add(45);
		d1.add(78);
		d1.add(23);
		d1.add(52);
		d1.add(67);
		d1.addFirst(56);
		d1.addLast(90);
		
			System.out.println(d1.getFirst());
			System.out.println(d1.getLast());
		}
	}

