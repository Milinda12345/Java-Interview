package com.example.Autharizang.java;

import java.util.Scanner;

public class Interview {
    private int q; private int p ; private int m =1 ;


    public static void main(String[] args) {
        Interview number = new Interview();
        number.input();
    }


        public void input () {
            try {
                while (m >= 1) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number of find the factorial : ");
                    int x = sc.nextInt();
                    StringBuilder sb = new StringBuilder();
                    p=1 ;
                    for (int i = 1; i <= x; i++) {
                        p = p * i;
                        q = p;
                        m = x;
                        sb.append(i + "*");
                    }
                    sb.delete(sb.length() - 1, sb.length());
                    System.out.println("the input " + x + "! factorial is " + sb + " = " + q + "\n");
                    q = 0 ;
                }
            } catch (Exception e){
                    System.out.println(e);

            }
        }
}
