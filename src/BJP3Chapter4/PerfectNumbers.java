package BJP3Chapter4;

import java.util.ArrayList;

/*
A "perfect number" is a positive integer that is the sum of all its proper factors
(that is, factors including 1 but not the number itself). The first two perfect
numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. Write a static method
perfectNumbers that takes an integer max as an argument and prints out all perfect
numbers that are less than or equal to max.

Here is the console output from a call to perfectNumbers(6):
Perfect numbers up to 6: 6
Here is the console output from a call to perfectNumbers(500):
Perfect numbers up to 500: 6 28 496
 */
public class PerfectNumbers {
    public static void perfectNumbers(int max){
        ArrayList perfectNumsToMax = new ArrayList();
        System.out.print("Perfect numbers up to "+max+": ");
        for(int i=2; i<=max; i++){
            if (isPerfectNumber(i)){System.out.print(i+" ");}
        }
    }

    private static boolean isPerfectNumber(int number){
        ArrayList<Integer> divisors=new ArrayList<>();
        int sumDivisors=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                divisors.add(i);
            }
        }
        for (Integer divisor : divisors) {
            sumDivisors += divisor;
        }
        return sumDivisors==number;
    }
}
