package com.example.Autharizang.java_Interview;
import java.util.Scanner;


public class Multiarray {

    public static void main(String[] args) {
        Multiarray m = new Multiarray();
        m.Displayarray();
    }

    public void Displayarray() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the number of rows : ");
                int rows = sc.nextInt();
                System.out.println("Enter the number of columns : ");
                int columns = sc.nextInt();
                sc.nextLine();
                int[][] demo = new int[rows][columns];

                for (int i = 0; i < rows; i++) {
                    System.out.println("Enter your number :" + (i + 1) + " ");
                    String input = sc.nextLine();
                    String[] inputArray = input.split(" ");

                    for (int j = 0; j < columns; j++) {
                        demo[i][j] = Integer.parseInt(inputArray[j]);
                    }
                }
                System.out.println("\n you input array is    : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(" " + demo[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("Again input the array please Enter the number : ");
                System.out.println("1 = yes: \n2 = no : ");
                int a = sc.nextInt();
                if (a == 2) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}