
public class Variable {
	int a=20;
	int b=30;
	int sum;
	int div;
	public void display() {
		System.out.println(a);
		System.out.println(b);
		sum= a+b;
		div= a-b;
	}
	public void output() {
		System.out.println(sum);
		System.out.println(div);
		
	}
	public static void main(String args[]) {
		Variable obj= new Variable();
		obj.display();
		obj.output();
	}

}
