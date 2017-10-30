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
        Scanner s= new Scanner(System.in);
        double total=0;
        double num=0;
        double input=0;
        System.out.print("Enter a number (enter a letter to end program)");

        while( s.hasNextInt()== true)
        {
            num=s.nextInt();
            input+=1;
            total+=num;
            System.out.print("Enter a number (enter a letter to end program)");
        }
        double average= total/input;
        System.out.println(average);
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
        int count = 0;
        Scanner s = new Scanner(System.in);
        double answer;
        do
        {
            System.out.println("Please enter a number (or letter to exit): ");

            if(s.hasNextDouble() == false)
            {
                break;
            }
            answer = s.nextDouble();
            if(answer>100)
            {
                count++;
            }
        }
        while(true);
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
        Scanner s = new Scanner(System.in);

        String word;
        int wordCount = -1;
        do
        {
            System.out.print("Enter a word: ");
            word = s.next();
            wordCount ++;
        }
        while(word.length() < 6);

        System.out.println(wordCount);
        return wordCount;
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
        int guess = 101;
        while (!(guess > 0) || !(guess < 100))
        {
            System.out.println("Please give a positive integer less than 100");
            if( s.hasNextInt() == false )
            {
                continue;
            }
            guess = s.nextInt();
        }
        return guess;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        Scanner s = new Scanner(System.in);
        int num = 0;
        int max = Integer.MIN_VALUE;
        do{
            System.out.println("Tell me the number!!!!!!(stops when a letter is entered): ");


            num = s.nextInt(); 
            if (num > max){
                max = num;
            }

        }
        while( s.hasNextInt() != false );
        System.out.println("The biggest number is " + max);
        return max;
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
        int previous, current;

        System.out.print("Enter a number: ");
        current = s.nextInt();
        do
        {
            previous = current;

            System.out.print("Enter a number(enter a letter to exit): ");
            if( s.hasNextInt() == false)
            {
                current = 0;
                break;
            } 
            current = s.nextInt();
        }
        while(previous != current);
        return current;
    }
}