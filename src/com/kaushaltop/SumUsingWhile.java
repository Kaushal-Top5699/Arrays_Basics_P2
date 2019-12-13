package com.kaushaltop;

import java.util.Scanner;

public class SumUsingWhile {

    private static Scanner scanner = new Scanner(System.in);


    public static int[] getIntegers(int number) {

        int[] values = new int[number];

        System.out.println("Enter "+number+" integer values: \r");

        int start = 0;

        while (start < values.length) {

            System.out.println("Enter "+start+" position integer: \r");

            values[start] = scanner.nextInt();

            start++;

        }
        return values;
    }

    public static void getSum() {

        int sum = 0;
        int start = 0;

        System.out.println("SUM OF ARRAY ELEMENTS USING WHILE LOOP");
        System.out.println("Define array size: ");

        int arraySize = scanner.nextInt();
        scanner.nextLine();

        int[] superArray = getIntegers(arraySize);

        while (start < superArray.length) {

            sum += superArray[start];

            start++;

        }
        System.out.println("Sum of array elements = "+sum);
    }

}
