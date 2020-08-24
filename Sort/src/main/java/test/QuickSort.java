package main.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            if(scanner.hasNext()){
                a[i] = scanner.nextInt();
            }
        }
        if(a.length>0){
            quickSort(a,0,a.length-1);
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }



    }
    private static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int k = arr[i];
        while (i<j){
            while(i<j&&arr[j]>k){
                j--;
            }
            while(i<j&&arr[i]<=k){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        k = arr[i];
        arr[i] = arr[low];
        arr[low] = k;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);


    }
}
