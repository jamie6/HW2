public class Greeter
{
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	 
	public static void main(String[] args)
	{
		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.print("Hello World!");
		
		Greeting innerClassGreeting = new Greeting()
		{
			public void perform()
			{
				System.out.print("Hello world!");
			}
		};
		
		lambdaGreeting.perform();
	}
}