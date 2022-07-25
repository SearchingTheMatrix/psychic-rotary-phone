import java.util.Scanner;
 abstract class Shape{
	abstract public void side();
	}
 class square4 extends Shape{
	 @Override
	 public void side(){
		 System.out.println("Please enter the side of sqaure and then multiply it with itself to find the area of sqaure");
	 }
 }	 
 class rect3 extends Shape{
	 public void side(){
		 System.out.println("Enter the len, bre and multiply them to find the area of the rectangle");
	 }
 }
 
public class Abstract_class_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect3 r1 = new rect3();
		r1.side();
		square4 s1 = new square4();
		s1.side();
		//Shape s2 = new Shape();
		
	}

}
