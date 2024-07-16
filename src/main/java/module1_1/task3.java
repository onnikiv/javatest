package module1_1;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Give the first number:");
            int first = Integer.parseInt(scanner.nextLine());

            System.out.println("Give the second number:");
            int second = Integer.parseInt(scanner.nextLine());

            System.out.println("Give the third number:");
            int third = Integer.parseInt(scanner.nextLine());

            float sum = first + second + third;
            float product = first * second * third;
            float average = sum / 3;

            System.out.println("\nThe outcome of your numbers");
            System.out.println("Sum: " + (sum));
            System.out.println("Product: " + (product));
            System.out.println("Average: " + (average));

        }
    }

}
