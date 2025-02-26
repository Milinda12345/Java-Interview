package com.example.Autharizang.java_Interview;
import java.util.Scanner;

public class ArrayShort {
    private int[] k;

    public static void main(String[] args) {
        ArrayShort arrayShort = new ArrayShort();
        arrayShort.sample();
    }

    public void sample() {
        while (true ) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter the your sort list number : ");
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            int demo[] = new int[inputArray.length];

            for (int i = 0; i < demo.length; i++) {
                demo[i] = Integer.parseInt(inputArray[i]);
                this.k = demo;
            }

            for (int i = 0; i < demo.length; i++) {
                for (int j = 0; j < demo.length - 1 - i; j++) {
                    if (demo[j] > demo[j + 1]) {
                        int temp = demo[j];
                        demo[j] = demo[j + 1];
                        demo[j + 1] = temp;
                    }
                }

            }
            for (int i = 0; i < demo.length; i++) {
                System.out.print(" " + demo[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
    }
}
