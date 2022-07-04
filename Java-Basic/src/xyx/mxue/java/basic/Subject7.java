package xyx.mxue.java.basic;

import java.util.Scanner;

/**
 * <h2> Subject7 AcWing 660. 零食 </h2>
 *
 * @author mxuexxmy
 * @date 2022/7/3 22:42
 */
public class Subject7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 1) {
            System.out.printf("Total: R$ %.2f\n", y * 4.00);
        } else if (x == 2) {
            System.out.printf("Total: R$ %.2f\n", y * 4.50);
        } else if (x == 3) {
            System.out.printf("Total: R$ %.2f\n", y * 5.00);
        } else if (x == 4) {
            System.out.printf("Total: R$ %.2f\n", y * 2.00);
        } else {
            System.out.printf("Total: R$ %.2f\n", y * 1.50);
        }

    }

}
