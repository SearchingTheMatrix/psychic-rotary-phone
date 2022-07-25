


public class Adding_Two_Number_In_SIngky_Linked_List {
private ListNode head;
public static class ListNode{
	private ListNode next;
	private int data;
	public int val;
	
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
}
public static ListNode Add(ListNode A,ListNode B){
	ListNode Dummy = new ListNode(0);
	ListNode tail = Dummy;
	int carry =0;
	while(A!=null||B!=null){
		int x = (A!=null)?A.val:0;
		int y = (B!=null)?B.val:0;
		int sum = x+y+carry;
		carry = sum/10;
		tail.next = new ListNode(sum%10);
		tail=tail.next;
		if(A!=null)	A= A.next;
		if(B!=null)	B=B.next;
		}
	if(carry>0){
		tail.next = new ListNode(carry);
	}
	return Dummy.next;
}
public void dis(){
	ListNode Current = head;
	while(Current!=null){
		System.out.print(Current.data+"-->");
		Current =Current.next;
	}
	System.out.print("Null");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adding_Two_Number_In_SIngky_Linked_List s = new Adding_Two_Number_In_SIngky_Linked_List();
		s.head = new ListNode(7);
		ListNode Sec = new ListNode(4);
		ListNode Three = new ListNode(8);
		s.head.next = Sec;
		Sec.next = Three;
		Adding_Two_Number_In_SIngky_Linked_List s1 = new Adding_Two_Number_In_SIngky_Linked_List();
		s1.head = new ListNode(7);
		ListNode Four = new ListNode(7);
		ListNode Five = new ListNode(5);
		s1.head.next = Four;
		Four.next = Five;
		Adding_Two_Number_In_SIngky_Linked_List result = new Adding_Two_Number_In_SIngky_Linked_List();
		result.head = Add(s.head,s1.head);
		result.dis();
	}

}
