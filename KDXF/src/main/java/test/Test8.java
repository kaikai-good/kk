package main.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
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
    public static void sort(int[] arr){
        for(int i = arr.length/2-1;i>=0;i--){
            adjust(arr,i);
        }
    }
    public static void adjust(int arr[],int i){
        int temp = arr[i];
        for(int j = 2*i+1;j<arr.length;j=2*j+1){
            if(j+1<arr.length&&arr[j]<arr[j+1]){
                j = j+1;
            }
            if(temp<arr[j]){
                arr[i] = arr[j];
                i = j;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }
}
