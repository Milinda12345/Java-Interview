package com.example.Autharizang.java_Interview;
import java.util.Scanner ;

public class Switch {
    String result [] ; int choose []; int time ; String SubjectStore [] ;

public static void main(String[] args) {
    Switch sw = new Switch();
    sw.example();
}

    public void example() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        time = sc.nextInt();
        sc.nextLine();
        result = new String[time];
        choose = new int[time];
        SubjectStore = new String[time];

        for (int i = 0; i < time; i++) {
            System.out.println("Please Enter your Subject : ");
            SubjectStore[i] = sc.nextLine();

            System.out.println("Enter the Marks : ");
            choose[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int j = 0; j < choose.length; j++) {
            switch (choose[j]) {
                case 1:
                    if (choose[j] < 35) {
                        result[j] = "Fail";
                        break;
                    }
                case 2:
                    if (choose[j] >= 35) {
                        result[j] = "S";
                        break;
                    }
                    case 3 :
                        if (choose[j] >= 55) {
                            result[j] = "C";
                            break;
                        }
                case 4:
                    if (choose[j] >= 65) {
                        result[j] = "B";
                        break;
                    }
                case 5:
                    if (choose[j] >= 75) {
                        result[j] = "A";
                        break;
                    }
            }
        }
        for (int i = 0; i < choose.length; i++) {
            System.out.println("Subject : " + SubjectStore[i]  + "Marks is : "+ choose[i]  +  " Result : " + result[i]);

    }
    }
}
