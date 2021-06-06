/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise15 {
    public static void main(String[] args)
    {
        String password = "abC$123";

        Scanner in = new Scanner(System.in);
        System.out.print("What is the password? ");
        String guess = in.nextLine();

        if (password.equals(guess))
        {
            System.out.println("Welcome!");
        }
        else
            System.out.println("I don't know you.");
    }
}
