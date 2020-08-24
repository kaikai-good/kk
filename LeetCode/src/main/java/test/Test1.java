package main.java.test;

public class Test1 {
    public static void main(String[] args) {
        long l1 = 1L;
        long l2 = 2147483647L;
        long l3 = 9876543210L;
        long l4 = 123456789123456789L;
        int i = (int)l1;
        int i2 = (int)l2;
        int i3 = (int)l3;
        int i4 = (int)l4;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
