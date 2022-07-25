import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Binary_Numbers_Using_A_Queue {
private ListNode front,rear;
private int length;
private class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
}
public Binary_Numbers_Using_A_Queue(){
	front = null;
	rear = null;
	length=0;
}
public boolean isempty(){
	return length==0;
}
public int length(){
	return length;
}
public void enqueue(int data){
	ListNode temp = new ListNode(data);
		if(isempty()){
			front = temp;
		}
		else{
			rear.next = temp;
		}
		rear= temp;
		length++;
	
}
public int dequeue(){
	if(isempty()){
		throw new NoSuchElementException();
	}
	if(front==null){
		rear =null;
	}
	int result = front.data;
	front = front.next;
	length--;
	return result;
}
public String[] binary(int number){
	String []result = new String[number];
	Queue<String> q = new LinkedList<>();
	q.offer("1");
	for(int i =0;i<number;i++){
		result[i]=q.poll();
		String n1 = result[i]+"0";
		String n2 = result[i]+"1";
		q.offer(n1);
		q.offer(n2);
		}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Numbers_Using_A_Queue s = new Binary_Numbers_Using_A_Queue();
		System.out.println(s.binary(5));
		
	}

}
