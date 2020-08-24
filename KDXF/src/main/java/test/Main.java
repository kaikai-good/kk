package main.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
    public static void sort(int arr[]){
        int bucket[][] = new int[10][arr.length];
        int bucketconut[] = new int[10];
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int legthindex = (max+"").length();
        for(int i = 0,n = 1;i<legthindex;i++,n*=10){
            for(int j = 0;j<arr.length;j++){
                bucket[arr[j]/n%10][bucketconut[arr[j]/n%10]] = arr[j];
                bucketconut[arr[j]/n%10]++;
            }
            int count = 0;
            for(int k = 0;k<bucketconut.length;k++){
                if(bucketconut[k] != 0){
                    for(int x = 0;x<bucketconut[k];x++){
                        arr[count] = bucket[k][x];
                        count++;
                    }
                }
                bucketconut[k] = 0;
            }
        }
    }

}
