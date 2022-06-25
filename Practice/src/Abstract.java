/*abstract class C{
	abstract void display();
	
}
class B extends C{
	void display() {
		System.out.println("Abstract method in A");
	}
}
public class Abstract {
	public static void main(String args[]) {
		B obj= new B();
		obj.display();
	}

}*/
abstract class D
{
abstract void display();
}
class B extends D
{
void display()
{
System.out.println("Abstract Method in A");
}
}
public class Abstract
{
public static void main(String args[])
{
B obj =new B();
obj.display();
}
}
