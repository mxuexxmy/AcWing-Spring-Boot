package xyx.mxue.java.basic;

import java.util.Scanner;

/**
 * <h2> Subject3 AcWing 616. 两点间的距离  </h2>
 *
 * @author mxuexxmy
 * @date 2022/7/2 17:05
 */
public class Subject3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double result = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        System.out.printf("%.4f\n", Math.sqrt(result));
    }

}
