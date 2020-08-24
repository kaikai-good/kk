package main.java.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String string = scanner.next();
        String string = null;
        if(scanner.hasNext()){
            string = scanner.next();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<string.length();i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                stringBuffer.append(string.charAt(i));
            }
        }
        System.out.println(stringBuffer.toString());

    }
}
