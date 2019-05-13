/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    private static final double PHI = (1 + Math.sqrt(5)) / 2;
    private static final double PSI = (1 - Math.sqrt(5)) / 2;

    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if(n < 2)
            return n;
        else
            return fib_recurrence(n - 1) + fib_recurrence(n - 2);
    }
     /* These are class methods because...
        they return the same value for the same input and don't
        apply to any singular instance of the problem.
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int fib , nextFib , nextSum , i;

        for(fib = 0, nextFib = 1, nextSum = 0, i = 0; i < n; i++){
            nextSum = fib + nextFib;
            fib = nextFib;
            nextFib = nextSum;
        }
        return fib;
    }
    /* Time complexity:
       Consider the size of the problem to be ... n
       As the proxy for the time required, count...
            number of loops thru for
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because solving fib n requries looping thru for loop n times.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        return (Math.pow(PHI , n) - Math.pow(PSI, n)) / (PHI - PSI);
    }
    /* Time complexity:
       Consider the size of the problem to be ... n
       As the proxy for the time required, count...
       number of calculations
       Then cost of the the recurrence algorithm is constant
       as the size of the problem increases,
       because it only requires raising numbers to the specified
       power and performing arithmetic
     */
}
