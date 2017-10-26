import java.util.Scanner;


/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 24 October 2017
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      evaluates a boolean condition
         *      if true, executes the body and then re-evaluates the condition
         *      if false, skips the body and continues
         */

        int count = 1;  // initialization

        while( count <= 5 )     // condition
        {
            System.out.println( count );    // body

            count += 1;     // change the condition variable
        }

        System.out.println( "done" );
    }

    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         * 
         *  A better approach would be:
         *      while( count < 50 )
         */
        int count = 1;      // initialization

        while( count != 50 )    // condition
        {
            System.out.println( count );    // body

            count += 2;     // update the condition variable
        }

        System.out.println( "done" );
    }

    public static void forExample()
    {
        /*
         * for loop:
         *  three parts of the for loop statement:
         *      1. initialization- executed once
         *      2. boolean condition - tested at the start of each iteration
         *      3. update the conditional variable - executed at the *end*
         *          of each iteration *before* testing the condition again
         */
        for( int count = 1;     // initialization
                count <= 5;     // boolean condition
                count += 1 )    // update the condition variable
        {
            System.out.println( count );    // body
        }
        
        System.out.println( "done" );
        
        /*
         * variables declared within the for statement are scoped to the
         *      for statement and its body
         */
        //System.out.println( "final value of count: " + count );
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop):
         *      1. executes the body the loop
         *      2. evaluates the boolean condition
         *          if true, executes the body of the loop again
         *          if false, continues execution after the loop
         */
        int count = 1;                      // initialization
        
        do
        {
            System.out.println( count );    // body
            
            count +=1;                      // update the condition variable
        }
        while( count <= 5 );                // condition
        
        System.out.println( "done" );
    }
    
    public static void sum()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print( "enter a positive integer (-1 to quit): " );
            /*
             * Sentinel value
             *      value (e.g., -1) used to terminate a loop
             *      it is often entered by a user
             */
            value = s.nextInt();
            
            sum += value;   // this is a bug! sum is 1 less than it should be
        }
        while( value != -1 );
        
        System.out.println( "sum: " + sum );
    }
    
    public static void sum2()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print( "enter a positive integer (-1 to quit): " );
            value = s.nextInt();
            
            if( value == -1 )
            {
                /*
                 * break: exits the inner-most loop it is in
                 *  (similiar behavior as used in switch statement)
                 */
                break;
            }
            
            sum += value;
        }
        while( value != -1 );
        
        System.out.println( "sum: " + sum );
    }
    
    public static void sum3()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print( "enter a positive integer (-1 to quit): " );
            
            /*
             * The hasNextInt method of the Scanner class returns true
             *      if the next token to be read is an integer; otherwise,
             *      it returns false. It does not read the next token.
             */
            if( s.hasNextInt() == false )
            {
                s.next(); // read the unexpected token
                
                /*
                 * continue:
                 *      1. skips to the end of the inner-most loop it is in
                 *      2. re-evaluates the loop condition at that point
                 *  
                 *  "we are done with this iteration, go to the next one"
                 */
                continue;
            }
            
            value = s.nextInt();
            
            if( value == -1 )
            {
                break;
            }
            
            sum += value;
        }
        while( value != -1 );
        
        System.out.println( "sum: " + sum );
    }
    
    

}




