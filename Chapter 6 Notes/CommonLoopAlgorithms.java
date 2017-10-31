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
        Scanner s = new Scanner( System.in );
        double sum = 0;
        double value;
        double average;
        double count = 0;
        do
        {
            System.out.print( "enter a number (any letter to quit)" );

            value = s.nextDouble();
            sum += value; 
            count++;
        }
        while( s.hasNextDouble() == true );
        average = sum/count;
        return ( average );
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
        int num;
        String isItA = null;
        int numbersAbove100 = 0;
        System.out.println("Input an integer (Input 'A' exit): ");
        do
        {
            num = s.nextInt();

            if(num > 100)
            {
                numbersAbove100 += 1;
            }
            System.out.println("Input an integer (Input 'A' exit): ");
            if(s.hasNextInt() == false)
            {
                isItA = "A";
            }
        }
        while(isItA != "A");
        return numbersAbove100;

    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner s=new Scanner(System.in);
        int count=0;
        String words="";
        System.out.println("\nEnter a series of words: ");

        do
        {
            words=s.next();

            if (words.length()<=5)
            {
                count++;
            }
        }
        while (words.length()<=5);

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
        Scanner s = new Scanner(System.in);
        int i=100;
        while (i>=100 || i<=0){
            System.out.print("Enter a positive integer less than 100: ");
            if (s.hasNextInt() == false)
            {
                s.next();
                continue;
            }
            i = s.nextInt();
        }
        return i;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        int value, max;
        max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        do
        {
            value = scanner.nextInt();
            if (value > max)
            {
                max = value; 
            }
            System.out.print("Enter a number: ");
        }
        while(scanner.hasNextInt() == true);
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
        int minValue = 0;
        int counter = 0;
        do
        {
            System.out.print("Enter a positive integer, or a letter to quit: ");
            int n = s.nextInt();
            if (counter == 0 || n < minValue)
            {
                minValue = n;
            }

            counter++;
        }
        while (s.hasNextInt() == true);
        return minValue;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * if an adjacent duplicate number is entered, the loop is exited
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        int previous;
        Scanner s = new Scanner ( System.in);
        previous = s.nextInt();
        while (s.hasNextInt())
        {
            int number = s.nextInt();
            if ( number == previous)
            {
                System.out.println("adjacent number: " + number);
                return number;
            }
            previous = number;
        }
        System.out.println("no adjacent duplicates");
        return 0;
    }
}