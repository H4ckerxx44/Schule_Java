public class Human2
{
	String name;
	int age;
	boolean isHuman;
	boolean isRobot;

	Human2(String name, int age, boolean isRobot)
	{
		this.name = name;
		this.age = age;
		this.isHuman = !isRobot;
	}

	public boolean isHuman(boolean override)
	{
		return !(isRobot) && isHuman;
	}
}
