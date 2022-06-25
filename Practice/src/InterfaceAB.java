interface F
{
	void Fdisplay();// we need not write abstract interface automatically have abstract
	void Fshow();
}
interface E{
	void Edisplay();
	void Eshow();
}
class G implements F,E{

	public void Edisplay() {
	System.out.println(" E Display");
		
	}

	public void Eshow() {
		
		System.out.println(" E Show");
	}

	public void Fdisplay() {
		System.out.println(" F Display");
	}

	
	public void Fshow() {
		System.out.println(" F Show");
		
	}
	
}
public class InterfaceAB {
public static void main(String args[]) {
	G obj=new G();
	obj.Fdisplay();
	obj.Fshow();
	obj.Edisplay();
	obj.Eshow();
	
}
}
