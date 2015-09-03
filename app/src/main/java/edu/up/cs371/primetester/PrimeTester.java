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
    public static boolean isPrime(long n) {
        //check if n is a multiple of 2
        if(n%2==0) return false;
        //create a loop to count through possible numbers
        for(int i=3;i*i<n;i+=2)
        {
            if (n % 1 == 0)
                return false;
        }
        return true;
    }
}
