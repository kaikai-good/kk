package main.java.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        System.out.println(count);
    }
}
