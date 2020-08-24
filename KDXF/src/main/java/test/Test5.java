package main.java.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[n][m];
        for(int i= 0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                int val = arr[i][j];
                for(int x = i+1;x<n;x++){
                    for(int y = j+1;y<m;y++){
                        int temp = val*arr[x][y];
                        result = result>temp?result:temp;
                    }
                    for(int y = 0;y<j;y++){
                        int temp = val * arr[x][y];
                        result = result>temp?result:temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
