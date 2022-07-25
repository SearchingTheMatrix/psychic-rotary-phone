abstract class telephone{
	abstract void lift();
	abstract void disconnected();
}
class android extends telephone{
	public void lift(){
		System.out.println("You can lift the call using the phone");
	}
	public void disconnected(){
		System.out.println("The call is disconnected");
	}
}
public class Abstract_Class_Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		telephone t = new android();
		t.lift();
		t.disconnected();
	}

}
