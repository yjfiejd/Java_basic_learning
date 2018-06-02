import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	
	public Coin()
	{
		coinnames.put(1, "penny");
		coinnames.put(5, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolor");
		coinnames.put(50, "五毛");
		System.out.println(coinnames);
		
		for(Integer k : coinnames.keySet())
		{
			String s = coinnames.get(k);
			System.out.println(s);
		}
		
	}
	
	public String getName(int amount)
	{
		if (coinnames.containsKey(amount))
		{
			return coinnames.get(amount);
		}
		else
		{
			return "Not find !";
		}
	}
	

	public static void main(String[] args) 
	{
		Coin coin = new Coin();
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the amount:");
		int amount = in.nextInt();
		
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
