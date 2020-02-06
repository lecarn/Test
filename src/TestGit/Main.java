package TestGit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1;
        int num2;
        int total;

        System.out.println("Give number 1");
        num1 = scn.nextInt();
        System.out.println("Give number 2");
        num2 = scn.nextInt();

        total = num1+num2;
        System.out.println("Your numbers are: "+num1 + " & "+ num2+ "\n Togheter they are: "+total);
    }
}
