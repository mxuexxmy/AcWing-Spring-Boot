package xyx.mxue.java.basic;

import java.util.Scanner;

/**
 * <h2> Subject5 AcWing 654. 时间转换  </h2>
 *
 * @author mxuexxmy
 * @date 2022/7/3 17:30
 */
public class Subject5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("%d:%d:%d\n", n / 3600  , n % 3600  / 60, n % 60);
    }

}
