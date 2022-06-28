package xyx.mxue.java.basic;

import java.util.Scanner;

/**
 * <h2> Subject2 AcWing 608. 差 </h2>
 *
 * @author mxuexxmy
 * @date 2022/6/28 23:28
 */
public class Subject2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Integer d = scanner.nextInt();

        System.out.printf("DIFERENCA = %d%n", a * b - c * d);

    }

}
