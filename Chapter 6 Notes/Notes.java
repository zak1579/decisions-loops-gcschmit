import java.util.Scanner;

/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 25 October 2018
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop
         * 
         *  Evaluates a boolean expression
         *      if true, executes the body of the loop
         *          and then re-evaluates the condition
         *      if false, skips the body of the loop and continues
         */
        int count = 1;                  // initialization
        
        while(count <= 5)               // condition
        {
            System.out.println(count);  // body
            
            count++;                    // update the condition variable
        }
        
        System.out.println("done");
    }
    
    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         * 
         *  A better approach would be:
         *      while(count < 50)
         */
        int count = 1;                  // initialization
        
        while(count != 50)              // condition
        {
            System.out.println(count);  // body
            
            count += 2;                 // update the condition var
        }
        
        System.out.println("done");
    }
    
    public static void forExample()
    {
        /*
         * for loop
         * 
         *  Three parts of the for loop statement:
         *      1. initialization - executed once
         *      2. boolean expression - evaluated at the start
         *          of each iteration
         *      3. update the condition variable - executed at
         *          the *end* of each iteration *before* evaluating
         *          the condition again
         */
        for(int count = 1;              // initialization
                count <= 5;             // boolean expression
                count++)                // update the condition var
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done");
        
        /*
         * variables declared with the for statement are scoped
         *      to the for statement and its body
         */
        //System.out.println("final value of count: " + count);
    }
    
    public static void forExample2()
    {
        int count = 1;                  // initialization
        for(    ;
                count <= 5;             // boolean expression
                count++)                // update the condition var
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done");
        
        System.out.println("final value of count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops
         *      executing one too many or one too few times.
         *      
         *  Carefully ask: should the initial value start at 0 or 1?
         *                 should the condition be < or <= ?
         *                 
         *      "Think! Don't compile and try at random!"
         */
        
        // we want to print five "*"
        for(int i = 0;
                i <= 5;     // should be i < 5;
                i++)
        {
            System.out.println("*");
        }
        
        System.out.println("done");            
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop):
         * 
         *  1. executes the body of the loop
         *  2. evaluates the conditional expression
         *      if true, executes the body of the loop again
         *      if false, continues execution after the loop
         */
        int count = 1;                  // initialization
        
        do
        {
            System.out.println(count);  // body
            
            count++;                    // update the condition var
        }
        while(count <= 5);              // condition
        
        System.out.println("done");
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit: ");
            
            /*
             * Sentinel Value
             *      value (e.g., -1) used to terminate a loop
             *      it is often entered by a user
             */
            value = s.nextInt();
            
            // this is a bug! sum is 1 less than it should be
            sum += value;
        }
        while(value != -1);
        
        return sum;
    }
    
    public static int sum2()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit): ");
            value = s.nextInt();
            
            if(value == -1)
            {
                /*
                 * break: immediately exits the inner-most loop
                 *      it is in (similar behavior as used in
                 *      switch statements)
                 */
                break;
            }
            
            sum += value;
        }
        while(value != -1);
        
        return sum;
    }
    
    public static int sum3()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit): ");
            
            /*
             * The hasNextInt method of the Scanner class returns
             *      true if the next token to be read is an integer;
             *      otherwise, it returns false. It does not consume
             *      the next token.
             */
            if(s.hasNextInt() == false)
            {
                System.out.println(s.next() +
                        " is not an integer; try again.");
                /*
                 * continue:
                 *      1. immediately skips to the end of the
                 *          inner-most loop it is in
                 *      2. re-evaluates the loop condition at that
                 *          point and continues if the condition is
                 *          true
                 */        
                continue;
            }
            
            value = s.nextInt();
            
            if(value == -1)
            {
                break;
            }
            
            sum += value;
        }
        while(value != -1);
        
        return sum;
    }
    
    
}




