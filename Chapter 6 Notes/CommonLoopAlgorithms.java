import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Average
     * reads a series of numbers (ends with a letter)
     * calculates the average of the numbers
     * @return the average of the numbers
     */
    public static double average()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        double average = 0;
        while(true)
        {
            if (s.hasNextInt())
            {
                System.out.print("Enter a number (letter to exit): ");
                sum += s.nextInt();
                average = (double) sum/count;
                count++;
            }
            else
            {
                return average;
            }
        }
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner s = new Scanner(System.in);
        int numWords = 0;
        System.out.print("Enter a series of words separated by whitespace: ");
        do
        {
            /*
             * Challenge: finding a way to know if we are out of words
             * Solution: Using a do loop (fixed the problem accidentally)
             */ 
            if(s.next().length() > 5)
            {
                break;
            }
            numWords++;
        }
        while(s.hasNext());
        return numWords;
    }

    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * @return the number that matched the criteria
     */
    public static int promptUntilMatch()
    {
        Scanner s = new Scanner(System.in);
        int value = 0;
        int n = 0;

        do
        {
            System.out.println("enter a positive integer less than 100: ");
            if(s.hasNextInt() == false)
            {
                System.out.println("\"" + s.next() + "\" is not an integer; try again.");

                continue;
            }

            value = s.nextInt();
            n++;

            if(value < 0 || value > 100)
            {
                System.out.println("\"" + value + "\" is not a positive integer less than 100; try again.");

                continue;
            }
            else
            {
                break;
            }
        }
        while(value < 0 || value > 100);

        System.out.println("" + n);
        return value;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
    }
}