
public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("Constructor with out arrays");
	}
	ConstructorOverloading(int a){
		System.out.println("a= "+ a);
	}
}
class Data {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading(10);
	}
}