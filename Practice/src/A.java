
class  Overload {
	 Overload(){
	System.out.println("CONSTRUCTOR");
}
	 Overload(int n){
	System.out.println("a = "+ n);
}
}
class A{
	public static void main(String args[]) {
		 Overload Obj1=new  Overload();
		 Overload obj2=new  Overload(20);
	}
	
}
