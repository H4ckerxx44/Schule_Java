package RandomStuff;

public class Car
{
	String brand;
	String model;
	String color;
	int doors;
	int hp;

	Car(String brand, String model, String color, int doors, Engine engine)
	{
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.doors = doors;
	}

	String stateReport()
	{
		String state = String.format("Brand: %s\nColor: %s\nDoors: %s\nHP: %s", this.brand, this.color, this.doors, this.hp);
		return state;
	}
}
