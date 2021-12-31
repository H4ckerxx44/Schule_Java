package Zoo;


public class Gehege extends BasisGebäude
{
	private String gehegename;
	private String tierart;

	public Gehege(String gehegename, String tierart, Integer baujahr)
	{
		super(true, false, baujahr);
		this.gehegename = gehegename;
		this.tierart = tierart;
	}

	public String getTierart()
	{
		return this.tierart;
	}

	public void setTierart(String tierart)
	{
		this.tierart = tierart;
	}

	public String getGehegename()
	{
		return this.gehegename;
	}

	public void setGehegename(String gehegename)
	{
		this.gehegename = gehegename;
	}

	public void füttern()
	{
		this.sauber = false;
	}

	@Override
	public void machSauber()
	{
		this.sauber = true;
	}
}
