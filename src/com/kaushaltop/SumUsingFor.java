package com.kaushaltop;

import java.util.Scanner;

public class SumUsingFor {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {

        int[] values = new int[number];

        System.out.println("Enter "+number+" integer values: \r");

        for (int i=0; i<values.length; i++) {

            System.out.println("Enter "+i+" position integer: \r");

            values[i] = scanner.nextInt();

        }
        return values;
    }

    public static void getSum() {

        int sum = 0;

        System.out.println("SUM OF ARRAY ELEMENTS USING FOR LOOP");
        System.out.println("Define array size: ");

        int arraySize = scanner.nextInt();
        scanner.nextLine();

        int[] superArray = getIntegers(arraySize);

        for (int i=0; i<superArray.length; i++) {

            //System.out.println("Number at "+i+" is = "+superArray[i]+"\n");

            sum += superArray[i];
        }
        System.out.println("Sum of array elements = "+sum);
    }

}
