package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n)
    {
        int result = 0;
        for(int i=2;i<=n/2;i++)
        {
            if (n % i == 0)
                result = 1;
        }
        if(result ==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
