package BJP3Chapter2;
/*
Write a method called processName that accepts a Scanner for the console
as a parameter and that prompts the user to enter his or her full name,
then prints the name in reverse order (i.e., last name, first name).
You may assume that only a first and last name will be given. You should
read the entire line of input at once with the Scanner and then break it
apart as necessary. Here is a sample dialogue with the user:

Please enter your full name: Sammy Jankis
Your name in reverse order is Jankis, Sammy
 */

import java.util.Scanner;

public class ProcessName {
    public static void processName(Scanner scan){
        System.out.print("Please enter your full name: ");
        String fullName=scan.nextLine();
        String[] splitedName=fullName.split("\\s+");
                System.out.print("Your name in reverse order is ");

        for(int i=splitedName.length-1; i>=0; i--){
            System.out.print(splitedName[i]);
            if(i==0){
                break;
            }
            System.out.print(", ");
        }
    }
}
