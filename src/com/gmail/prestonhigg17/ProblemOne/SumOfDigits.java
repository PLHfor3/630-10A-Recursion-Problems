package com.gmail.prestonhigg17.ProblemOne;

import java.util.ArrayList;

public class SumOfDigits
{
    public int sum(int input)
    {
        if (input == 0)
        {
            return input;
        }
        return ((input % 10) + (sum(input / 10)));
    }
}


//    public int sum(int input)
//    {
//        ArrayList<String> digits = new ArrayList<String>();
//        String digitParser = Integer.toString(input);
//        for (int index = 0; index < digitParser.length(); index++)
//        {
//            if (index < digitParser.length())
//            {
//                digits.add(digitParser.substring(index, index + 1));
//            } else if (index == digitParser.length())
//            {
//                digits.add(digitParser.substring(index));
//            }
//        }
//        int sum = 0;
//        for (int index = 0; index < digits.size(); index++)
//        {
//            sum += Integer.parseInt(digits.get(index));
//        }
//        return sum;
//    }