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
        int total = 0;
        int count = 0;
        boolean hasInt;
        do
        {
            System.out.print("Enter a number: ");
            hasInt = s.hasNextInt();
            if (hasInt == false)
            {
                break;
            }
            int newNum = s.nextInt();
            total += newNum;
            count += 1;
        }
        while (hasInt == true); 
        double average = (double) total / count;
        System.out.println("Average: " + average);
        return average;
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        Scanner s = new Scanner(System.in);

        int count = 0;
        int entry;

        do
        {
            System.out.println("Enter a number (exit with letter): ");

            if (s.hasNextInt() == false)
            {
                break;
            }

            entry = s.nextInt();

            if ( entry > 100 )
            {
                count++;
            }
        }
        while ( true );
        System.out.println("There were " + count + " numbers greater than 100.");
        return count;
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        int counter = -1;
        boolean var = false;
        int index1 = 0;
        String str = "";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a list of strings separated by whitespace: ");

        while(var == false)
        {
            str  = s.next();

            if(str.length() >= 5)
                var = true;

            counter += 1;
        }

        return counter;
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
        int check = 100;
        do{
            System.out.println("Please enter an interger value less than 100 to exit the loop");
            if (scanner.hasNextInt()){
                check = scanner.nextInt();
            }
        }
        while(check >= 100);
        return check;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        int maxNum = Integer.MIN_VALUE;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (enter a letter to quit): ");
        while (s.hasNextInt()==true)
        {
            int x = s.nextInt();
            if (x>maxNum)
            {
                maxNum = x;
            }
            System.out.print("Enter a number (enter a letter to quit): ");
        }

        return maxNum;
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
        return 0;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * if an adjacent duplicate number is entered, the loop is exited
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        int value = 0;
        int previous = 0;
        System.out.print("enter a series of integers (letter to quit): ");
        do
        {
            value = s.nextInt();
            if(value == previous)
            {
                break;
            }
            previous = value;
        }
        while(s.hasNextInt() == true);

        return value;
    }
}