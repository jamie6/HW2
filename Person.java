// Person class
public class Person
{
	private String firstName, lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() { return firstName; }
	public String setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName() { return lastName; }
	public String setLastName()
	{
		this.lastName = lastName;
	}
	
	public int getAge() { return age; }
	public int setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person [firstName= " + firstName + ", lastName= " + lastName + ", age=" + age "]";
	}
}