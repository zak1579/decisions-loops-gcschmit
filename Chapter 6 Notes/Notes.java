
/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 24 October 2018
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      evaluates a boolean expression
         *          if true, executes the body and then
         *              re-evaluates the condition
         *          if false, skips the body and continues
         */
        int count = 1;                  // initialization
        
        while(count <= 5)               // condition
        {
            System.out.println(count);  // body
            
            count++;                    // update the condition variable
        }
        
        System.out.println("done");
    }
}





