package com.kai.controller;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = 4;
        int[] nums1 = new int[4];
        int[] nums2 = new int[4];
        for(int i= 0;i<len;i++){
            if(scanner.hasNext()){
                nums1[i] = scanner.nextInt();
            }
        }
        for(int i= 0;i<len;i++){
            if(scanner.hasNext()){
                nums2[i] = scanner.nextInt();
            }
        }
        if(!(nums1[2]<=nums2[0]) || nums1[3] <= nums2[1] || nums1[0] >= nums2[2] || nums1[1]>=nums2[3]){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
