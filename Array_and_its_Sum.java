
public class Array_and_its_Sum {

	public static void main(String[] args) {
		float []marks = {10.0f,11.0f,12.4f,15.5f};
		float sum =0;
		for(int i=0;i<marks.length;i++){
			sum+=marks[i];
		}
		System.out.println("The sum of elements of float of marks is "+sum);

	}

}
