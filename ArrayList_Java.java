import java.util.*;

public class ArrayList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> l1 = new ArrayList<>();
			ArrayList<Integer> l2 = new ArrayList<>(5);
			l2.add(40);
			l2.add(67);
			l2.add(45);
			l2.add(23);
			l2.add(78);
			
			l1.add(6);
			l1.add(7);
			l1.add(8);
			l1.add(9);
			l1.add(10);
			l1.add(6);
			l1.add(0,5);
			l1.add(1,6);
			l1.addAll(0,l2);
			for(int i=0;i<l1.size();i++){
				System.out.println(l1.get(i));
			}
			System.out.println(l1.contains(87));
			System.out.println("Index of 6 in the arraylist is " +l1.indexOf(6));
			System.out.println("Last Index of 6 in the arraylist is "+l1.lastIndexOf(6));
	}

}
