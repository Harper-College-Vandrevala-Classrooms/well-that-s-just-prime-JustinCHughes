package com.csc;
import java.util.Stack;
public class Factorizer {

  // You should implement your solution here.
  // Feel free to delete this example method when you implement your solution.
  
  public String primeListGeneration(int primeFactors)
  {
    // As per instructions, program returns null if entry is equal to or less than 1
    if(primeFactors <= 1)
    {
      return null;
    }
    // Create a stack to store the prime divisors
    Stack<Integer> primeStack = new Stack<>();

    // Iterates over possible divisors of primeFactors argument
    for(int divisor = 2; divisor <= primeFactors; divisor++)
    {
      // Calls isPrime function below to check if divisor is a prime number
      if(isPrime(divisor))
      {
        // Continues dividing and adding to primeStack as long as primeFactors is still
        // divisible with no remainder and primeFactors is still > 0
        // sets primeFactors to divided amount then adds it to the stack
        while(primeFactors % divisor == 0 && primeFactors > 0)
        {
          primeFactors = primeFactors / divisor;
          primeStack.add(divisor);
        }
      }
      // Checks if primeFactors is now 0 and then begins to build returnString
      if (primeFactors == 1)
      {
        String returnString = Integer.toString(primeStack.pop());
        while(!primeStack.isEmpty())
        {
          returnString = returnString + "x" + Integer.toString(primeStack.pop());
        }
        return returnString;
      }
    }
    // primeFactors was unable to get to 0 and thus this integer is not "Prime"
    return null;
  }

  // Checks if the divisor to be used is a prime number
  public boolean isPrime(int divisor)
  {
    // Automatically returns false if anything is less than or equal to 1
    if (divisor <= 1)
    {
      return false;
    }
    // Returns true if its 2 or 3
    else if (divisor <= 3)
    {
      return true;
    }
    // Checks to see if the numbers are divisible by 2 and 3 to quickly check if not prime numbers
    else if (divisor % 2 == 0 || divisor % 3 == 0)
    {
      return false;
    }
    // Was unable to think of a way to make this part faster
    // Program iterates over every other possible number and checks if it is divisible with no remainder
    else
    {
      for (int i = 4; i < divisor; i++)
      {
        if (divisor % i == 0)
        {
          return false;
        }
      }
      // Returns true because no divisible numbers were found
      return true;
    }
  }
}
