package main.java.test;

import java.util.Arrays;
import java.util.Scanner;
//选择排序
public class SelectSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0;i<a.length;i++){
            if(scanner.hasNext()){
                a[i] = scanner.nextInt();
            }
        }

        for(int i = 0;i<a.length;i++){
            int min = a[i];
            int index = i;

            for(int j = i+1;j<a.length;j++){
                if(a[j]<min){
                    min = a[j];
                    index = j;
                }
            }

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
            System.out.println(Arrays.toString(a));
        }
    }
}
