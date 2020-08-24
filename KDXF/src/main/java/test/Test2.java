package com.kai.controller;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        if(scanner.hasNext()) {
            for (int i = 0; i < len; i++) {
                nums[i] = scanner.nextInt();
            }
        }
        int min = 0;
        for(int j = 0;j<len;j++){
            min = nums[j];
            for(int m = j+1;m<len;m++){
                if(nums[m]<min){

                }
            }
        }

    }
}
