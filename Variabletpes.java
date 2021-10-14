
public class Variabletpes {
	int b = 20; //instance variables 
	static int c = 30 ; //can access from anywhere  // static variable/class level variable 
	//Static variable can be loaded withot depending instance 
	final int d = 40; // Final variable,, fixed value.. cannnot change
	volatile int e = 50; //Volatile variable, frequently changed
	transient int f = 60; //Transient variable,, not fixed at one particular position
	
	
	public static void main(String[] args) {
		Variabletpes obj = new Variabletpes(); //obj = reference (like the cast used by kids) // instance
		int a = 10; // local variable
		System.out.println("Local Variable:"+a);
		System.out.println("Instance Variable:"+obj.b);
		System.out.println("Static Variable:"+c);
		System.out.println("Final variable:"+obj.d);
		System.out.println("Volatile variable:"+obj.e); 

	}
	public void m1() 
	{
		System.out.println("Static variable called"+c);
	}

}
