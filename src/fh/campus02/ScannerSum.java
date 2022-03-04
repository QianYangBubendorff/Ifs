package fh.campus02;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s.nextInt();
        int sum = 0;
        sum = sum + number;

        while (number > 0) {
            if (number == 3) {
                sum = sum * 3;
                System.out.println("Triple Bonus!");
                System.out.println("Enter another number: ");
                number = s.nextInt();
            } else if (number == 2) {
                sum = sum * 2;
                System.out.println("Double Bonus!");
                System.out.println("Enter another number: ");
                number = s.nextInt();
            } else if (number == 22) {
                sum = sum / 2;
                System.out.println("Sum halved ");
                System.out.println("Enter another number: ");
                number = s.nextInt();
            } else {
                sum += number;
                System.out.println("Enter another number: ");
                number = s.nextInt();
            }

        }
        System.out.println("Your total sum is: " + sum);
    }
}
