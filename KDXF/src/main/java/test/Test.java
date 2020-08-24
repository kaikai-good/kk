package main.java.test;



import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] nums = new int[n];
        int[] store = new int[n];
        nums[0] = 1;
        nums[1] = 5;
        nums[2] = 10;
        nums[3] =50;
        nums[4] = 100;
        for(int i = 0;i<n;i++){
            store[i] = scanner.nextInt();
        }
        int pay = scanner.nextInt();
        int result = 0;
        for(int i = 0;i<n;i++){
            int need = 0;
            //int need = (int)((pay/nums[nums.length-i-1]-store[nums.length-i-1]) >0 ? (store[nums.length-i-1]>0):(pay/nums[nums.length-i-1]));
            result = result+need;
            pay=pay-need*nums[nums.length-i-1];
        }
        System.out.println(result);




    }


}
