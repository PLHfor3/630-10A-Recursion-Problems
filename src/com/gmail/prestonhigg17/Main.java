package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.ProblemFive.StringSeperator;
import com.gmail.prestonhigg17.ProblemOne.ProblemOne;
import com.gmail.prestonhigg17.ProblemTwo.StringReverser;

import static com.gmail.prestonhigg17.Functions.randomFunctions.*;

public class Main
{
    public static void main(String[] args)
    {
        clearTypingSpace();
        StringSeperator stringSeperator = new StringSeperator();
        stringSeperator.run();
        waitInSeconds(8);
        clearTypingSpace();
        ProblemOne p1executer = new ProblemOne();
        p1executer.run();
        waitInSeconds(2);
        clearTypingSpace();
        StringReverser stringReverser = new StringReverser();
        System.out.println("String to be reversed: \"String\"");
        System.out.print("Reversed String: ");
        String test = stringReverser.reverseString("String");
        System.out.println(test);
        waitInSeconds(5);
        System.out.println("Program Completed");
        shutdownSequence();

    }
}
