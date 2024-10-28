package basicsofjava;

public class VariableDemo {
	int id=10;//instance variables
	void print()
	{
		String msg="hello";//local variable
		System.out.println( msg);
	}
	static String message ="hello students";//static variable

	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);
	}
}
