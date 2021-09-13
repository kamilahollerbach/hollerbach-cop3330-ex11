/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */

package com.company;
import java.util.Scanner;
import java.lang.*;
class CurrencyExchange
{
    double currency;
    double rate;
    public void read()
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner sc = new Scanner(System.in);
        this.currency = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        this.rate = sc.nextDouble();
    }
    public void print()
    {
        System.out.println(currency+" euros at an exchange rate of "+rate+" is");
        double currencyConverted = currency*rate;
        System.out.printf("%.2f U.S dollars.",currencyConverted);
    }
}
public class Main{
    public static void main(String args[])
    {
        CurrencyExchange ca = new CurrencyExchange();
        ca.read();
        ca.print();

    }
    }

