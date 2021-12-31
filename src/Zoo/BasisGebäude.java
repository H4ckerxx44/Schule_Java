package Zoo;

public class BasisGebäude
{
	protected boolean sauber;
	protected boolean eingestürzt;
	protected int baujahr;

	BasisGebäude(boolean sauber, boolean eingestürzt, Integer baujahr)
	{
		this.sauber = sauber;
		this.eingestürzt = eingestürzt;
		this.baujahr = baujahr;
	}

	public void machSauber()
	{
		System.out.println("BasisGebäude wird nun gereinigt.");
		this.sauber = true;
	}
}
