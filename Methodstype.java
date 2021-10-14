
public class Methodstype {
 // these methods are called as a instance methods	
	public void display() {
		System.out.println("Welcome to core java");
	}
	
	public int add(int i, int j) 
	{
		return i+j;
		
	}
	
	//static method
	public static void m1() {
		System.out.println("This is static method so no need to depend in instance");
	}
	
	//Final method
	public final void m2() {
		System.out.println("This is final void method and it is depend upon instance");
	}
	
	//abstract method
	//when you don't know code and waiting friends to write, we can create abstract method
	// just writing abstract keyword even withot implementation.
	//public abstract void m3();
	//if we have abstract method, we cannot instantiating  class
	
	public synchronized void m3()
	{
		//example: ticketing system
		//if another person is accessing and block for second person 
		//locking mechanisms 
		System.out.println("This is final synchronized method and it is depend upon instance");
	}
	
	public static void main(String[] args) 
	{
		Methodstype obj = new Methodstype(); //instance of object
		obj.display();
		System.out.println("Result = :"+obj.add(55,56));
		m1();
		obj.m2();
		obj.m3();
	}

}
