
public class PS2 extends PS3{
	
	int a,b;
	// parameterised constructor
	public PS2(int a) {
		super(a);           // parent class constructor is invoked
		this.a=a;          // this keyword (it refers to the current class variable)
	}

	/*public PS2(int i, int j) {
		this.a=i;
		this.b=j;
	}*/

	public int increment()
	{
		a=a+1;
		//b=b+1;
		return a;
		//return b;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
