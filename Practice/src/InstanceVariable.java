

public class InstanceVariable {
	int b=20,c=30;
    int sum;
	
	public void display() {
	System.out.println(b);
	System.out.println(c);
	sum= b+c;
      System.out.println(sum);

	
	}

	public static void main(String []args)
	{
	InstanceVariable d=new InstanceVariable();
  
	d.display();
	}
	
}
	   