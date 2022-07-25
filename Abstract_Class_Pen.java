abstract class pen{
	abstract public void write();
	abstract public void refill();
	}
class fountain extends pen{
	public void write(){
		System.out.println("This is a fountain pen u are writing from");
	}
	public void refill(){
		System.out.println("You have to refill the pen every 5 days");
	}
	void nib(){
		System.out.println("The nib of the fountain pen is thick");
	}
}
public class Abstract_Class_Pen {

	public static void main(String[] args) {
		fountain f = new fountain();
		f.write();
		f.refill();
		f.nib();

	}

}
