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
        double value = 0;
        int count = 0;
        while (true)
        {
            System.out.print("Enter a number (Any letter to stop): ");
            if (s.hasNextDouble() == false)
            {
                break;
            }
            value += s.nextDouble();
            count++;
        }
        double avg = value / count;
        return avg;
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        String exit = "y";
        Scanner s = new Scanner(System.in);
        int nums_over_100 = 0;

        while (!exit.equals("n"))
        {
            System.out.println("Enter a number or enter n to exit: ");

            if (s.hasNextInt() == false)
            {
                exit = s.next();
                continue;
            }

            int value = s.nextInt();
            if (value > 100)
            {
                nums_over_100++;
            }

        }

        return nums_over_100;
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
        int count = 0;
        String str = "";
        do
        {
            str = s.next();
            if (str.length()<5)
            {
                count++;
            }
        }
        while(str.length()<5);
        return count;
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
        Scanner scanner = new Scanner(System.in);
        int last = -1; // The previously entered value
        int next = -2; // The next value entered by user
        while (last != next) { // While they are not the same number
            System.out.print("Enter a positive integer less than 100: ");
            last = next; // Set last to the previously entered number
            next = scanner.nextInt(); // Take new number from user
            if (next < 0 || next >= 100) { // Check if new number is in range
                System.out.println("Number is not in range [0,100). Try again");
                next = last; // Undo this loop's itteration
                last = -1; // Make sure last != next
            }
        }

        return last;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        boolean i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int max = s.nextInt();
        int value = 0;
        do{
            System.out.print("Enter a number (End with a letter): ");
            i = s.hasNextInt(); 
            if (i == true){
                value = s.nextInt();  
            }
            if (value >= max){
                max = value;  
            }
        }
        while(i != false);
        return max;
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
        boolean i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int min = s.nextInt();
        int value = 0;
        do{
            System.out.print("Enter a number (End with a letter): ");
            i = s.hasNextInt(); 
            if (i == true){
                value = s.nextInt();
            }
            if (value <= min){
                min = value;  
            }
        }
        while(i != false);
        return min;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * if an adjacent duplicate number is entered, the loop is exited
     * @return the adjacent duplicate number that was entered
     */
    public static String compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        // assume the user enters at least two numbers
        int lastValue = s.nextInt();
        int value = 0;
        System.out.print("Enter integers (enter a letter to end): ");
        do
        {
            value = s.nextInt();
            if (value == lastValue)
            {
                return value +"";
            } else {
                lastValue = value;
            }

        } while(s.hasNextInt() == true);

        return "No adjacent duplicates here.";
    }
}