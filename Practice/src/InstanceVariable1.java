
public class InstanceVariable1 {
	 int a=20;
			 int b=30;
	  //int b=30;
	     int sum;
	     int diff;

	    public void inputdata() {
	       //canner in = new Scanner(System.in);
	        System.out.println("Enter first number: "+ a);
	       // = in.nextInt();
	        System.out.println("Enter second number: " +b);
	       // = in.nextInt();
	        sum= a+b;
	      diff= a-b;
	    }
	    
/*public void display() {
	       //sum= a + b;
	      //diff = a - b;
	    }*/
	    
	    public void outputdata() {
	        System.out.println("Sum = " + sum);
	        System.out.println("Difference = " + diff);
	    }
	    
	    public static void main(String args[]) {
	    	InstanceVariable1 obj = new InstanceVariable1();
	        obj.inputdata();
	        //j.calculate();
	        obj.outputdata();
	    }
	}

