package main.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            if(scanner.hasNext()){
                a[i] = scanner.nextInt();
            }
        }
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] arr) {
        for(int i = arr.length/2-1;i>=0;i--){
            adjust(arr,i);
        }
    }

    private static void adjust(int[] arr, int i) {
        int j;
        if(i>arr.length||(2*i+1)>=arr.length){
            return;
        }
        j=2*i+1;
        if((2*i+2)<arr.length&&arr[2*i+1]<arr[2*i+2]){
            j = 2*i+2;
        }
        if(arr[j]>arr[i]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            adjust(arr,j);
        }else {
            return;
        }
    }
}
