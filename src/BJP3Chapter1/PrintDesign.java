package BJP3Chapter1;
/*
Write a method called printDesign that produces the following output. Use nested for loops to capture the structure of the figure.
-----1-----
----333----
---55555---
--7777777--
-999999999-
 */

public class PrintDesign {

    public static void printDesign() {
        int number = 1;
        int minusNumber = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = minusNumber; j > 0; j--) {
                System.out.print("-");
            }
            for (int h = 0; h < number; h++) {
                System.out.print(number);
            }
            for (int j = minusNumber; j > 0; j--) {
                System.out.print("-");
            }
            minusNumber--;
            number = number + 2;
            System.out.println();
        }

    }
}
