
package yares;

import java.util.Scanner;


public class yares2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Inputted number Zero");
        } else if (number > 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
}

