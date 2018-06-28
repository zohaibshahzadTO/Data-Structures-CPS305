// Euclids GCD Theorem
public class GCD {

  public static double GCD (double p, double q) {
    if (q = 0) {
      return p;
    }
    else {
      return GCD(q, p % q);
    }
  }

  public static void main(String[] args) {
    System.out.println(" " + GCD(16, 12));
  }

}

// Fibonacci
public static int fib(int n) {
  if (n <= 1) {
    return n;
  }
  return fib(n-1) + fib(n-2);
}


// Palindrome

public static boolean isPalindrome(String text)
{
    int length = text.length();
    // Separate case for shortest strings.
    if (length <= 1) { return true; }
    else
    {
      // Get first and last characters, converted to lowercase.
      char first = Character.toLowerCase(text.charAt(0));
      char last = Character.toLowerCase(text.charAt(length - 1));
      if (Character.isLetter(first) && Character.isLetter(last))
      {
      // Both are letters.
      if (first == last)
      {
      // Remove both first and last character.
      String shorter = text.substring(1, length - 1);
      return isPalindrome(shorter);
      }
      else
      {
      return false;
      }
    }
    else if (!Character.isLetter(last))
    {
      // Remove last character.
      String shorter = text.substring(0, length - 1);
      return isPalindrome(shorter);
    }
    else
    {
      // Remove firsts character.
      String shorter = text.substring(1);
      return isPalindrome(shorter);
    }
  }
}
