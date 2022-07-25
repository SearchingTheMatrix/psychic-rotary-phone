import java.util.Scanner;
class myEmployer{
	private String name;
	private int id;
	public void setname(String n){
		name = n;
	}
	public void setid(int n){
		id = n;
		
	}
	public String getname(){
		return name;
	}
	public int getid(){
		return id;
	}
}
public class Access_Modifiers_In_Java {

	public static void main(String[] args) {
		myEmployer Anand = new myEmployer();
		Anand.setname("Harry");
		Anand.setid(11);
		System.out.println("The name of the employee is "+Anand.getname());
		System.out.println("The id of thd employee is "+Anand.getid());
		// TODO Auto-generated method stub

	}

}
