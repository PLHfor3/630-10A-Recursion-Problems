package com.gmail.prestonhigg17.ProblemTwo;

public class StringReverser
{
    public String reverseString(String s)
    {
        if (s.equals(null) || s.length() <= 1)
        {
            return s.substring(s.length() - 1);
        }

        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
}
