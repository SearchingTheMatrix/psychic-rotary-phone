
public class Binary_Search_In_Java {
public int search(int[] arr,int n,int x){
	int low=0;
	int high = arr.length-1;
	while(low<=high){
		int mid = (low+high)/2;
		if(arr[mid]==x){
			return mid;
		}
		if(arr[mid]>x){
			high = mid-1;
		}
		else{
			low = mid+1;
		}
	}
	return 1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search_In_Java s = new Binary_Search_In_Java();
		int[] num = {1,10,20,47,59,65,75,88,99};
		int n = num.length;
		System.out.print(s.search(num, n, 88));
	}

}
