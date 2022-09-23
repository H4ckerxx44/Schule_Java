package Problemstellungen;

public class StromverbrauchsRechner
{
	public static void main(String[] args)
	{
		System.out.println(daysConsumption(1000, 10, 2));
	}

	public static double get_kwH(double watts, double time)
	{
		double kilowattHours = (watts * time) / 1000;
		return kilowattHours;
	}

	public static double daysConsumption(double watts, double time, double days)
	{
		double daily = get_kwH(watts, time) * days;
		return daily;
	}

	public static double weeklyConsumption(double watts, double time)
	{
		double weekly = daysConsumption(watts, time, 7);
		return weekly;
	}

	public static double yearlyConsumption(double watts, double time)
	{
		double yearly = daysConsumption(watts, time, 365);
		return yearly;
	}

	public static double calculatePrice(double kilowatthours, double price)
	{
		double endPrice = kilowatthours * price;
		return endPrice;
	}
}
