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
         *  Conditional expressions must go inside of parentheses.
         *  Statements are grouped by blocks (i.e., { } ) not by
         *      indentation like in Python
         *  There is no colon after the conditional expression
         *      unlike Python
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
         *  else block is executed if the condition for the if
         *      is false
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

        // simulate the roll of a four-sided die [1-4]
        int dieRoll = (int)(Math.random() * 4) + 1;

        /*
         * if-else if-else statement
         *  In Java, "else if" is used instead of "elif" like Python
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
         * If we use the equality operator (==) for doubles, it
         *      will only return true if all binary digits match.
         *  For "equal" numbers this is probably not the case due
         *      to floating-point rounding and, therefore, not what
         *      we want.
         *  We will check if they are "close enough" (i.e., epsilon
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
        System.out.print("Enter two strings: ");
        String str1 = s.next();
        String str2 = s.next();

        /*
         * The equality operator (==) returns true if the two variables
         *      (e.g., str1 and str2) contain the same value. For
         *      objects, including Strings, this means they contain
         *      the same reference. That is, they refer to the same
         *      object in memory, not that two Strings have the
         *      same sequence of characters.
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
         *      equals means is defined by that class. For Strings,
         *      it means that the two objects have the same sequence
         *      of characters.
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
        
        /*
         * This is an example a "short circuit".
         *      If the left operand is false, the right operand
         *      will not be evaluated because the AND operation
         *      is already false.
         */
        if(firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than 3 characters.");
        }
        
        /*
         * This is another "short circuit" example.
         *      If the left operand is true, the right operand will
         *      not be evaluated because the OR operation is
         *      already true.
         *      
         *  This may result in a bug, if the first word entered is
         *      "kiwi", we will never read the second word from
         *      the stream which may result in unexpected behavior
         *      later.
         */
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorite fruits too!");
        }
        
        System.out.print("Enter your favorite ice cream flavor.");
        String flavor = s.next();
        System.out.println("Favorite flavor " + flavor ); // could print a fruit
    }
    
    public static String getStudentClass(int gradeNumber)
    {
        /*
         * switch statement
         *      Another conditional decision statement (like if
         *      statement). Preferred when evaluating several
         *      *discrete* values. Can be used for byte, short, char,
         *      int primitives types. It can also be used for
         *      enumerations and String objects.
         *      
         *  The condition is evaluated, the flow of execution jumps
         *      to the case that matches.
         */
        String studentClass = "";
        
        switch(gradeNumber)
        {
            case 9:
            {
                studentClass = "freshman";
                
                /*
                 * break causes the flow of execution to leave the
                 *      switch. (Without a break, the flow of
                 *      execution continues into the next case.)
                 */
                break;
            }
            
            case 10:
            {
                studentClass = "sophomore";
                break;
            }
            
            case 11:
            {
                studentClass = "junior";
                break;
            }
            
            case 12:
            {
                studentClass = "senior";
                break;
            }
            
            /*
             * By leaving out the break, multiple cases can run
             *      the same code.
             */
            case 6:
            case 7:
            case 8:
            {
                studentClass = "junior high";
                break;
            }
            
            /*
             * default matches everything not matched by one of
             *      the cases
             */
            default:
            {
                studentClass = "elementary";
                break;
            }
        }
        
        return studentClass;
    }
    
    public static void assignmentOperatorExample()
    {
        /*
         * augmented assignment operators: +=, -=, *=, /=, %=
         *  These are same as in Python.
         *  Perform the specified mathematical operation and then
         *      assign the resulting value.
         */
        int x = 7;
        int y = 7;
        int z = 7;
        
        x = x + 1;
        y += 1;
        z++;
        
        System.out.println(" x = " + x + "; y = " + y + "; z = " + z);
        
        /*
         * post increment/decrement operators
         *  equivalent to adding/subtracting 1
         *  return the value before performing the
         *      increment/decrement
         */
        int a = 7;
        int b = a++;
        System.out.println("a = " + a + "; b = " + b); // a = 8; b = 7
        
        /*
         * pre increment/decrement operators
         *  return the value after performing the
         *      increment/decrement
         */
        int c = 7;
        int d = ++c;
        System.out.println("c = " + c + "; d = " + d); // c = 8; d = 8
    }
}


