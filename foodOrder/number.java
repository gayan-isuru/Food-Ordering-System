package foodOrder;

import java.util.Scanner;

public class number {

    public static void main(String[] args) {

        // int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        // for (int num : numbers) {
        // System.out.println(num);
        // }

        // for (int i = 0; i <= numbers.length; i++) {
        // System.out.println(numbers[i] + " ");
        // }

        // Input data and store the Array

        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number" + i);
            num[i] = sc.nextInt();
        }

        for (int arr : num) {
            System.out.println(arr);
        }
    }

}
