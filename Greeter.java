public class Greeter
{
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	 
	public static void main(String[] args)
	{
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		//MyLambda myLambdaFunction = () -> System.out.print("Hello World!");
		//MyAdd addFunction = (int a, int b) -> a + b;
		Greeting lambdaGreeting = () -> System.out.print("Hello World!");
		
		lambdaGreeting.perform();
	}
}

/*interface MyLambda
{
	void foo();
}

interface MyAdd
{
	int add(int x, int y);
}*/