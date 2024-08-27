package com.csc;
import java.util.List;
import java.util.ArrayList;
public class Factorizer {

  // You should implement your solution here.
  // Feel free to delete this example method when you implement your solution.
  public String primeListGeneration(int primeFactors)
  {
    if(primeFactors <= 1)
    {
      return null;
    }
    List<Integer> primeList = new ArrayList<>();

    for(int divisor = 2; divisor <= primeFactors; divisor++)
    {
      if(isPrime(divisor))
      {
        while(primeFactors % divisor)
      }
    }
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
