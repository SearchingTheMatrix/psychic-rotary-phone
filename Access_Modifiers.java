import java.util.Scanner;
class c1{
	public int x=5;
	protected int y=6;
	int  z= 9;
	private int p =56;
	public void meth(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
	}
}
class c2 extends c1{
	void meth2(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
public class Access_Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 c = new c1();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
	//	System.out.println(c.p);
		c2 m = new c2();
		m.meth2();
		//System.out.println(t.p);
	}

}
