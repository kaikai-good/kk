package main.java.test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
//插入排序
public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0;i<a.length;i++){
            if(scanner.hasNext()){
                a[i] = scanner.nextInt();
            }
        }
        for(int i =1;i<a.length;i++){
            for(int j =i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }else{
                    break;
                }
                System.out.println(Arrays.toString(a));
            }

        }

    }
}
