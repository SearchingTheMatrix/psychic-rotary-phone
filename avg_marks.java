import java.util.Scanner;
public class avg_marks {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float sum=0;
	float []marks = {78,78,98,56,78,89,67};
	for(int i=0;i<marks.length;i++){
		
		sum+= marks[i];
	}
	float avg_marks ;
	avg_marks = sum/marks.length;
	System.out.println("The average score of the class in physics is "+avg_marks);
	
}
}
