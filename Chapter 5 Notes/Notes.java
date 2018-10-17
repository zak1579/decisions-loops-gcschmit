import java.util.Scanner;

/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 16 October 2018
 */
public class Notes
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);
        
        /*
         * if statement
         *  Statements are executed if the conditional expression
         *      is true.
         *  Conditional expressions evaluate to either true or false.
         *  The conditional express must go inside of parentheses.
         *  Statements are grouped by blocks (i.e., { }), not by
         *      indentation like in Python.
         *  There is no colon after the conditional express, unlike
         *      Python.
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        
        /*
         * { } are not required for a single statement.
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        if(coinFlip == 0)
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        
        /*
         * if-else statement
         *  The else block is exectued if the condition evaluates
         *      to false
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        else
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        }
        
        // simulate the roll of a four-side die [1-4]
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if-else if-else statement
         *  In Java, "else if" is used instead of "elif" like Python.
         */
        if(dieRoll == 1)
        {
            System.out.println("rolled a 1");
        }
        else if(dieRoll == 2)
        {
            System.out.println("rolled a 2");
        }
        else if(dieRoll == 3)
        {
            System.out.println("rolled a 3");
        }
        else
        {
            System.out.println("rolled a 4");
        }
    }
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator (==) for doubles, it will
         *      only return true if all binary digits match.
         *  For "equal" numbers, this is probably not the case due
         *      to floating-point rounding and, therefore, not what
         *      we want.
         *  We will check if they are "close enough" (ie., epsilon
         *      value).
         */
        final double EPSILON = 1e-14;
        
        if(Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use an if statement
        //return (Math.abs(num1 - num2) < EPSILON);
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two
         *      variables (e.g., str1 and str2) contain the same
         *      value. For variables of a class type, including
         *      Strings, this means they contain the same reference.
         *      That is, they refer to the same object in memory,
         *      not that two Strings have the same sequence of
         *      characters.
         */
        if(str1 == str2)
        {
            System.out.println("string references are equal");
        }
        else
        {
            System.out.println("string references are not equal");
        }
        
        /*
         * The equals method returns true if the two objects
         *      referenced by the variables are "equal". What
         *      equals means is defined by the class. For Strings,
         *      it means that the two objects have the same
         *      sequence of characters.
         */
        if(str1.equals(str2))
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }
        
        /*
         * We will determine which string comes first lexographically
         *      using the compareTo method of the String class.
         *  
         *  compareTo returns an int:
         *      0:      if the strings are equal (same sequence of
         *                  characters)
         *      < 0:    if str1 < str2 lexographically
         *      > 0:    if str1 > str2 lexographically
         */
        int result = str1.compareTo(str2);
        String firstStr = null;
        
        if(result < 0)
        {
            firstStr = str1;
        }
        else if(result > 0)
        {
            firstStr = str2;
        }
        
        if(firstStr != null)
        {
            System.out.println("The first string is: " + firstStr);
            System.out.println("Its length is: " + firstStr.length());
        }
        else
        {
            System.out.println("strings are equal");
        }       
    }
    
    
}





