package Zoo;


import java.util.ArrayList;
import java.util.Collections;

public class Zoo
{
	public ArrayList<Gehege> gehege = new ArrayList<Gehege>();

	public void addGehege(Gehege gehege)
	{
		this.gehege.add(gehege);
	}

	public void addGehege(Gehege[] gehege)
	{
		Collections.addAll(this.gehege, gehege);
	}

	public void removeGehege(Gehege gehege)
	{
		this.gehege.remove(gehege);
	}

	public void removeGehege(Gehege[] gehege)
	{
		for (int i = 0; i < gehege.length; i++)
		{
			this.gehege.remove(gehege[i]);
		}
	}

	public void allesReinigen()
	{
		for (Gehege gehege : this.gehege)
		{
			gehege.machSauber();
		}
	}

	public void zooGröße()
	{
		if (this.gehege.size() == 0)
		{
			System.out.println("Der Zoo hat keinerlei Gehege lol, 1/5 Sterne");
		} else if (this.gehege.size() < 10)
		{
			System.out.println("Kleiner Vorstadt Zoo");
		} else
		{
			System.out.println("Woah so ein feuerzoo jonge!");
		}
	}
}
