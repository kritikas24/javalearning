public class Fibonacci {
    public static void main (String[] s) {
       Fibonacci f= new Fibonacci();
       int result = f.fib(28);
        System.out.print(result);
    }

    int fib (int n) {
        if (n<0) {
            return -1;
          }
          if (n==0 || n==1) {
            return n;
          }
          return fib(n-1) + fib(n-2);
    }
}
