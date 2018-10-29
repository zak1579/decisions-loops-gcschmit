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
        double sum = 0.0;
        int num = 0;
        double value = 0;
        System.out.println("Continue entering numbers (enter a letter to end the loop): ");
        do {
            if (s.hasNextDouble() == false){
                break;
            }
            value = s.nextDouble();
            sum += value;
            num ++;
        } while (s.hasNextDouble() == true);

        return sum/num;
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
        Scanner s= new Scanner(System.in);
        int x=0;
        System.out.print("Enter a string: ");
        do
        {
            String str= s.next();
            if (str.length()>5)
            {
                break;
            }

            x+=1;
        }
        while (0==0);
        return x;
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
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Enter a positive integer less than 100: ");
        } while((a = sc.nextInt()) >= 100 || a <= 0);
        return a;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        Scanner s = new Scanner(System.in);
        int max = s.nextInt();

        while(s.hasNextInt() == true)
        {
            int currentValue = s.nextInt();
            if(max < currentValue)
            {
                max = currentValue;
            }
        }
        return max;
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();

        while(s.hasNextInt() == true)
        {
            int currentValue = s.nextInt();
            if(min > currentValue)
            {
                min = currentValue;
            }
        }
        return min;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * if an adjacent duplicate number is entered, the loop is exited
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner (System.in);

        int currentValue = -999999999;
        int previousValue = 999999999;
        do
        {
            System.out.print("Enter an integer (letter to quit): ");
            if (s.hasNextInt() == false)
            {
                currentValue = 0;
                break;
            }

            previousValue = currentValue;
            currentValue = s.nextInt();
        }
        while(previousValue != currentValue);

        return currentValue;
    }

}