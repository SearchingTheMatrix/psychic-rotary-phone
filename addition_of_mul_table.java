import java.util.Scanner;
public class addition_of_mul_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num = sc.nextInt();
		int sum=0;
		for(int i =1;i<=10;i++){
			sum+=i*num;
			int mul = i*num;
			System.out.println("The value of mul table "+ mul);
		}
		System.out.println("The value of sum of mul table "+sum);

	}

}
