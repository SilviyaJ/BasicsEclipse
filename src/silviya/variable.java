package silviya;

public class variable {

int a=1;
static int b=2;
public void A()
{
	int c=3;
	System.out.println(c);
}
	public static void main(String[]args) {
		int d=4;
		System.out.println(d);
		System.out.println(b);
		variable n=new variable ();
		n.A();
	}

}
