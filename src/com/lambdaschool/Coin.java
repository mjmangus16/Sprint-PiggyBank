package com.lambdaschool;

public class Coin
{
	private String name;
	private double value;

	public Coin(String name, double value)
	{
		this.name = name;
		this.value = value;
	}

	public String getName()
	{
		return name;
	}

	public double getValue()
	{
		return value;
	}
}
