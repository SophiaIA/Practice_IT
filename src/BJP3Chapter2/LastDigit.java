package BJP3Chapter2;
/*
Write a method named lastDigit that returns the last digit of an integer.
For example, lastDigit(3572) should return 2. It should work for negative
numbers as well. For example, lastDigit(-947) should return 7.

Call	Value Returned
lastDigit(3572)	2
lastDigit(-947)	7
lastDigit(6)	6
lastDigit(35)	5
lastDigit(123456)	6
 */

public class LastDigit {
    public static int lastDigit(int a){
            if (a >= 10 || a <= -10) {
                return lastDigit(a % 10);
            }
            else return Math.abs(a);
    }
}
