
public class Binary__Max_Heap {
	Integer[] heap;
	int n;
	public Binary__Max_Heap(int cap){
		heap = new Integer[cap+1];
		n=0;
	}
	public boolean isempty(){
		return n==0;
		
	}
	public int size(){
		return n;
	}
	public void insert(int x){
		if(n==heap.length-1){
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	private void swim(int k){
		while(k>1 && heap[k/2]<heap[k]){
			int temp = heap[k];
			heap[k]= heap[k/2];
			heap[k/2]=temp;
			k=k/2;
		}
	}
	private void resize(int cap) {
		Integer[] temp = new Integer[cap];
		for(int i=0;i<heap.length;i++){
			temp[i]=heap[i];
		}
		heap=temp;
	}
	
	public void printheap(){
		for(int i=1;i<n;i++){
			System.out.print(heap[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary__Max_Heap s = new Binary__Max_Heap(3);
		s.insert(4);
		s.insert(5);
		s.insert(2);
		s.insert(6);
		s.insert(1);
		s.insert(3);
		
		//System.out.println(s.size());
		//System.out.println(s.isempty());
		s.printheap();
	}

}
