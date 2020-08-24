package main.java.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        s = scanner.nextLine();
        int n = scanner.nextInt();
        if(s.length() == 0||s.length() == 1){
            System.out.println(s);
        }
        n = n%s.length();
        String subl = s.substring(n);
        String subr = s.substring(0,n);
        String result = subl+subr;
        System.out.println(result);
    }
}
