package com.example.Autharizang.java_Interview;
import java.util.Scanner;

public class Resverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
