package Baumrekursion;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(fib(1,0,0));
        System.out.println(fib(1,1,0));
        System.out.println(fib(1,2,0));
        System.out.println(fib(1,3,0));
        System.out.println(fib(1,4,0));
        System.out.println(fib(1,5,0));
        System.out.println(fib(1,6,0));
        System.out.println(fib(1,7,0));
        System.out.println(fib(1,8,0));
        System.out.println(fib(1,9,0));
        System.out.println(fib(1,10,0));



    }

    public static long fib(int num, int wanted_n, int previous_num)
    {
        return wanted_n == 0
                ? previous_num
                : fib(num+previous_num,wanted_n-1, num);
    }

}
