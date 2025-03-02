package com.example.Autharizang.java_Interview;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Prime_Number number = new Prime_Number();
        number.primeNumber();
    }
    public void primeNumber(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] inputArray = input.split(" ");
        int demo[] = new int[inputArray.length];
        for (int i = 0; i<demo.length; i ++){
            demo[i] = Integer.parseInt(inputArray[i]);
        }
        for (int i =0 ; i<demo.length; i++){
            if (demo[i]==0 ) {
                System.out.println("the array is empty");
            }
            else if (demo[i] == 1){
                System.out.println(demo[i] + " is not a prime number");
            }
            else {
                int count = 0;
                for (int j = 2; j < demo[i]; j++) {
                    if (demo[i] % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(demo[i] + " is a prime number");
                } else {
                    System.out.println(demo[i] + " is not a prime number");
                }
            }
        }
    }
    }

