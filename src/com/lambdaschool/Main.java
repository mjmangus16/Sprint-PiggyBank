package com.lambdaschool;

public class Main
{

    public static void main(String[] args)
    {
        Coin penny = new Coin("Penny", 0.01);
        Coin nickel = new Coin("Nickel", 0.05);
        Coin dime = new Coin("Dime", 0.10);
        Coin quarter = new Coin("Quarter", 0.25);
        Coin dollar = new Coin("Dollar", 1);


        Bank bank = new Bank();

        System.out.println(bank.addCoin(quarter));
        System.out.println(bank.addCoin(dime));
        System.out.println(bank.addCoin(dollar, 5));
        System.out.println(bank.addCoin(nickel, 3));
        System.out.println(bank.addCoin(dime, 7));
        System.out.println(bank.addCoin(dollar));
        System.out.println(bank.addCoin(penny, 10));

        System.out.println(bank.getTotal());
    }
}
