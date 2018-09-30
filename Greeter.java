public class Greeter
{
	public void greet()
	{
		System.out.print("Hello World");
	}
	 
	public static void main(String[] args)
	{
		Greeter greeter = new Greeter();
		greeter.greet();
	}
}