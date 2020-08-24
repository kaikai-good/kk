package main.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//围圈报数
public class ChildGift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(i);
        }
        System.out.println(list);
        int cur = -1;
        while(list.size()>1) {
            for (int i = 0; i < m; i++) {
                cur++;
                if (cur == list.size()) {
                    cur = 0;
                }
            }
            list.remove(cur);
            System.out.println(list);
            cur --;
        }
        System.out.println(list.get(0));


    }
}
