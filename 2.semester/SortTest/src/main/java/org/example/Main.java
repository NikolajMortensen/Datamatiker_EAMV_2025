package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Integer array
        System.out.println("Integer array test");
        int[] intArray = {45, 12, 89, 3, 27, 56};

        System.out.println("Before sorting:" + Arrays.toString(intArray));

        // Sort whole numbers
        Arrays.sort(intArray);
        System.out.println("After sorting:" + Arrays.toString(intArray));

        // Search for number
        int targetNumber = 27;
        int indexNumber = Arrays.binarySearch(intArray, targetNumber);

        if (indexNumber >= 0) {
            System.out.println("Found " + targetNumber + " at index " + indexNumber);
        } else {
            System.out.println(targetNumber + " not found");
        }

        System.out.println();

        // String array
        System.out.println("--- String Array Test ---");
        String[] nameArray = {"Sofie", "Anders", "Mads", "Beatrix", "Christian"};

        System.out.println("Before sorting:" + Arrays.toString(nameArray));

        // Sort strings
        Arrays.sort(nameArray);
        System.out.println("After sorting: " + Arrays.toString(nameArray));

        // Target search
        String targetName = "Christian";
        int indexName = Arrays.binarySearch(nameArray, targetName);

        if (indexName >= 0) {
            System.out.println("Found " + targetName + " at index " + indexName);
        } else {
            System.out.println(targetName + " not found");
        }

    }
}
