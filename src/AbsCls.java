abstract class Human
{
	public void sayHello()
	{
		System.out.println("Hello!");
	}

	public abstract void sayBye();
}

class Dennis extends Human
{
	int age;

	public void sayBye()
	{
		System.out.println("Bye!");
	}
}


public class AbsCls
{
	public static void main(String[] args)
	{
		Dennis ich = new Dennis();
		ich.sayHello();
		ich.sayBye();
	}
}
