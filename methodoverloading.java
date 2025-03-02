package com.example.Autharizang.java_Interview;
import java.util.Scanner;

public class methodoverloading {
    Scanner sc = new Scanner(System.in);
    static int d ; static int e ; static int f ;

    public static void main(String[] args) {

        methodoverloading m = new methodoverloading();
        m.menu();
    }
    public void menu() {

        try {

            System.out.println("watch film count and add the age \n");
            System.out.println("1.watch the movie one people age :\n2.watch the two people add the age :\n3.watch tree people add the age : ");
            System.out.println("\nEnter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter age : ");
                int a = sc.nextInt();
                this.d = a;
                watchmovie(a);
            } else if (choice == 2) {
                System.out.println("Enter age : ");
                int a = sc.nextInt();
                System.out.println("Enter age : ");
                int b = sc.nextInt();
                this.d = a;
                this.e = b;
                watchmovie(a, b);
            } else if (choice == 3) {
                System.out.println("Enter age : ");
                int a = sc.nextInt();
                System.out.println("Enter age : ");
                int b = sc.nextInt();
                System.out.println("Enter age : ");
                int c = sc.nextInt();
                this.d = a;
                this.e = b;
                this.f = c;
                watchmovie(a, b, c);
            }


        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public void watchmovie(int a){

        System.out.println("The age is : " + a);
    }
    public void watchmovie(int a,int b){
        System.out.println("The one persion age is : " + a + "\n" + "The two persion age is : " + b);
    }
    public void watchmovie(int a,int b,int c){
        System.out.println("The one persion age is :" + a + "\n" + "The two persion age is : " + b + "\n" + "The tree persion age is :" + c );
    }
}
