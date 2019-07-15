package com.lambdaschool;

import java.text.DecimalFormat;
import java.util.*;

public class Bank
{
	ArrayList<Coin> money = new ArrayList<>();
	double total = 0;

	public String addCoin(Coin coin)
	{
		money.add(coin);
		if (coin.getName() == "Dollar")
		{
			return "$1";
		}else{
			return 1 + " " + coin.getName();
		}

	}

	public String addCoin(Coin coin, int count)
	{
		for (int i = 0; i < count; i++)
		{
			money.add(coin);
		}
		if (coin.getName() == "Dollar")
		{
			return "$" + count;
		}else{
			if (count > 1){
				return count + " " + coin.getName() + "s";
			}else{
				return count + " " + coin.getName();
			}
		}
	}

	public String getTotal()
	{
		for(int i=0; i < money.size(); i++)
		{
			total = total + money.get(i).getValue();

		}

		DecimalFormat formatTotal = new DecimalFormat("#.00");
		return "The bank holds $" + formatTotal.format(total);
	}
}
