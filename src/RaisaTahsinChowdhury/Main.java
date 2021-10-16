package RaisaTahsinChowdhury;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AdvancedArithmetic advancedArithmetic = new MyCalculator();

        int n, N;

        System.out.print("Enter a number which is between 100: ");
        n = input.nextInt();

        while(n>100)
        {
            System.out.println("Try again.Number is not valid");
            System.out.println();
            System.out.print("Enter a number which is between 100: ");
            n = input.nextInt();
        }

        System.out.println("Sum of the divisors of "+n+": "+advancedArithmetic.divisorSum(n));

        System.out.println();

        System.out.print("Enter a number which is between 50: ");
        N = input.nextInt();

        while(N>50)
        {
            System.out.println("Try again.Number is not valid");
            System.out.println();
            System.out.print("Enter a number which is between 50: ");
            N = input.nextInt();
        }

        System.out.println("Factorial of "+N+": "+advancedArithmetic.findFactorial(N));
    }
}

/*
Name- Raisa Tahsin Chowdhury
Id- 2012020140
Section- 53(C)
Email - cse_2012020140@lus.ac.bd
Date- 16-10-2021
 */

