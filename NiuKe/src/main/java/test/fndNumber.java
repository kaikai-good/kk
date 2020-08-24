package main.java.test;

import java.util.Scanner;
/*判断输入的一个字符串是不是表示数值
 */
public class fndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s ="";
//        if(scanner.hasNext()){
//            s = s+scanner.next();
//        }
//        System.out.println(s);
        StringBuffer stringBuffer = new StringBuffer();
        if(scanner.hasNext()){
            stringBuffer.append(scanner.next());

        }
        String s = stringBuffer.toString();
        try {
            double b = Double.parseDouble(s);
        }catch (Exception e){
           System.out.println(false);
        }
        System.out.println(true);

    }
}
