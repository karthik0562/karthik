class  Odd{
	
	public void display()
	{
		System.out.println("KKR");
	}
   public void display(int x) {
	   System .out.println("x,y "+ x );
	 }
   public int display(int x,int y) 
    {
    	System.out.println("x,y "+ (x+y));
		return y;
    }
   public String hello() {
	   String a="Hello karthik";
	   return a;
   }
}

 public class Method {
	public static void main(String args[]) {
		Odd obj=new Odd();
		obj.display();
		obj.display(5);
		System.out.println(obj.hello());
		/*int retun=*/
		//obj.display(7,6);
		int retun=obj.display(7,6);
		//System.out.println(retun);
	}

}
