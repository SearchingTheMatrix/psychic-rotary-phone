
public class Array_Intro {
	public void print(int []arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void array(){
		int []arr = new int[4];
		arr[0]=19;
		arr[1] = 5;
		arr[2] = 6;
		arr[3]  =6;
		print(arr);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		
	}
public static void main(String[] args){
	Array_Intro s = new Array_Intro();
	s.array();
	}
}
