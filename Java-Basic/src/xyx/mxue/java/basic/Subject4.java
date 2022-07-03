package xyx.mxue.java.basic;

import java.util.Scanner;

/**
 * <h2> Subject4 AcWing 653. 钞票 </h2>
 *
 * @author mxuexxmy
 * @date 2022/7/3 16:17
 */
public class Subject4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        System.out.printf("%d nota(s) de R$ 100,00\n", (n - (n % 100)) / 100);
        int result1 = n % 100 ;
        System.out.printf("%d nota(s) de R$ 50,00\n", (result1 - (result1 % 50)) / 50);
        int result2 = result1 % 50;
        System.out.printf("%d nota(s) de R$ 20,00\n", (result2 - (result2 % 20)) / 20);
        int result3 = result2 % 20;
        System.out.printf("%d nota(s) de R$ 10,00\n", (result3 - (result3 % 10)) / 10);
        int result4 = result3 % 10;
        System.out.printf("%d nota(s) de R$ 5,00\n", (result4  - (result4 % 5)) / 5);
        int result5 = result4 % 5;
        System.out.printf("%d nota(s) de R$ 2,00\n", (result5 - (result5 % 2)) / 2);
        int result6 = result5 % 2;
        System.out.printf("%d nota(s) de R$ 1,00\n", result6);

    }

}
