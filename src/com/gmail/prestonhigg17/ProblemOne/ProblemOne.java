package com.gmail.prestonhigg17.ProblemOne;

import java.util.Scanner;

public class ProblemOne
{
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    SumOfDigits sumCalc = new SumOfDigits();

    public void run()
    {
        System.out.println("Sum of Digits: Please enter an integer > ");
        int number = Integer.parseInt(scan.next());
        int sum = sumCalc.sum(number);
        System.out.println("Sum of your number's digits is: " + sum);
    }
}
