package com.gmail.prestonhigg17.ProblemFive;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSeperator
{
    BinarySearchTree tree = new BinarySearchTree();
    // string data to put in search tree
    // String s = "now is the time for all good people to come to the aid of their party";
    String s = "four score and seven years ago our fathers brought forth "
            + "on this continent a new nation conceived in liberty "
            + "and dedicated to the proposition that all men are created "
            + "equal now we are engaged in a great civil war testing "
            + "whether that nation or any nation so conceived and so "
            + "dedicated can long endure we are met on a great battle field "
            + "of that war we have come to dedicate a portion of that field "
            + "as a final resting place for those who here gave their "
            + "lives that that nation might live it is altogether fitting "
            + "and proper that we should do this "
            + "but in a larger sense we can not dedicate we can not "
            + "consecrate we can not hallow this ground the brave men living "
            + "and dead who struggled here have consecrated it far above our "
            + "poor power to add or detract the world will little "
            + "note nor long remember what we say here but it can never "
            + "forget what they did here it is for us the living rather "
            + "to be dedicated here to the unfinished work which they who "
            + "fought here have thus far so nobly advanced it is rather "
            + "for us to be here dedicated to the great task remaining "
            + "before us that from these honored dead we take increased "
            + "devotion to that cause for which they gave the last full "
            + "measure of devotion that we here highly resolve that these "
            + "dead shall not have died in vain that this natio under God "
            + "shall have a new birth of freedom and that government "
            + "of the people by the people for the people shall not perish "
            + "from the earth";
    private String[] seperatedWords = s.split(" ");

    public void run()
    {
        System.out.println(Arrays.toString(seperatedWords));
        for (int index = 0; index < seperatedWords.length; index++)
        {
            tree.insert(seperatedWords[index]);
        }
        tree.inorder();
    }
}
