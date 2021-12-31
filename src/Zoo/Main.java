package Zoo;

public class Main
{
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();

		Gehege affengehege = new Gehege("Eduard-Spranger Affengehege", "Affe", 1990);
		Gehege nashorngehege = new Gehege("Reichstag der Nashörner", "Nashorn", 1991);
		Gehege stirnlappenbasilisk = new Gehege("Nest der Stirnlappenbasilisken", "Stirnlappenbasilisk", 1992);

		zoo.addGehege(affengehege);
		zoo.addGehege(nashorngehege);
		zoo.addGehege(stirnlappenbasilisk);

		zoo.allesReinigen();

		Gehege[] neubau = {
				new Gehege("Kuhgehege", "Kuh", 2021),
				new Gehege("Ziegengehege", "Ziege", 2021),
				new Gehege("Schafgehege", "Schafe", 2021),
				new Gehege("Giraffengehege", "Giraffe", 2021),
				new Gehege("Tiefseegehege", "Anglerfische", 2021)
		};

		zoo.addGehege(neubau);

		Gehege walgehege = new Gehege("Walgehege", "Wal", 2022);

		Gehege[] abriss = {affengehege, nashorngehege};


		System.out.println(zoo.gehege.size());

		zoo.removeGehege(abriss);
		System.out.println(zoo.gehege.size());

		zoo.removeGehege(walgehege);

		System.out.println(zoo.gehege);
		System.out.println(zoo.gehege.get(2).getGehegename());
		zoo.gehege.get(2).setGehegename("Neues Ziegengehege");
		System.out.println(zoo.gehege.get(2).getGehegename());

		zoo.allesReinigen();

		zoo.zooGröße();

		Gehege[] neubau2 = {
				new Gehege("Komm kuscheln", "Panda", 2022),
				new Gehege("Rawr!", "Löwe", 2022),
				new Gehege("Ich will schlafen", "Koala", 2022),
				new Gehege("USA! USA!", "Adler", 2022),
				new Gehege("Riesenschnabelvogel", "Tukan", 2022)
		};
		zoo.addGehege(neubau2);

		zoo.zooGröße();

		for (int i = 0; i < zoo.gehege.size(); i++)
		{
			System.out.println(zoo.gehege.get(i).getGehegename() + "||" +zoo.gehege.get(i).getTierart());
		}

		System.out.println("-----------------------");
		Gehege neu = zoo.gehege.get(2);
		zoo.gehege.remove(2);
		System.out.println(neu.getTierart());
		System.out.println(neu.getGehegename());

		neu.setTierart("Elefant");
		neu.setGehegename("Elefantastisches Elefantencasino");

		System.out.println(neu.getTierart());
		System.out.println(neu.getGehegename());

		zoo.gehege.add(neu);

		for (int i = 0; i < zoo.gehege.size(); i++)
		{
			System.out.println(zoo.gehege.get(i).getGehegename() + "||" + zoo.gehege.get(i).getTierart());
		}
	}
}
