class monkey{
	public void jump(){
		System.out.println("It is one of the traits of monkey to jump which humans inherited from them");
	}
	public void bite(){
		System.out.println("Monkey bite in response to any threat same what humans used in early era" );
	}
}
interface basicanimal{
	void eat();
	void sleep();
}
class human extends monkey implements basicanimal{
	public void eat(){
		System.out.println("Humans needs to eat three times a day to function properly");
	}
	public void sleep(){
		System.out.println("Humans need atleat 8 hours of sleep to function properly");
	}
}
public class Abstract_Pen_Class {
	public static void main(String[] args){
		human h = new human();
		h.eat();
		h.sleep();
		h.bite();
		h.jump();
	}
}
