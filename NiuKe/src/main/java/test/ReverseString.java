package main.java.test;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        String s2 = "";
        String[] s1 = s.split(" ");
        for(int i = s1.length-1;i>=0;i--){
            s2 = s2 + s1[i]+" ";
        }
        System.out.println(s2);

    }
}
