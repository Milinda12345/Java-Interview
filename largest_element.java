package com.example.Autharizang.java_Interview;

import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        largest_element element = new largest_element();
        element.largestElement();
    }

    public void largestElement() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int demo[] = new int[inputArray.length];

        for (int i = 0; i < demo.length; i++) {
            demo[i] = Integer.parseInt(inputArray[i]);
        }
        if ((demo.length == 0) || (demo[0] == 0)) {
            System.out.println("The array is empty");
        }
       else {
            int max = demo[0];
            for (int i = 0; i < demo.length; i++) {
                if (demo[i] > max) {
                    max = demo[i];
                }
            }
            System.out.println("The largest element in the array is : " + max);
        }
    }
}

