import java.util.Scanner;
interface bicycle{
	void brake(int d);
	void speed(int i);
	
}
interface blow{
	void horn(int s);
}
class hero implements bicycle,blow{
	int s =8;
	public void horn(int r){
		
		System.out.println("Blowing horn at speed "+r);
		
	}
	public void brake(int d){
		s = s-d;
		System.out.println("The speed of the cycle after decrement is "+s);
	}
	public void speed(int i){	
		s = s+i;
		System.out.println("The speed of the cycle after increment is "+s);
	}
}
public class Abstract_Vs_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h1 = new hero();
		h1.horn(5);
		h1.brake(4);
		h1.speed(4);
	}

}
