package xyx.mxue.java.basic;

import java.util.Scanner;

/**
 * <h2> Subject6 AcWing 665. 倍数  </h2>
 *
 * @author mxuexxmy
 * @date 2022/7/3 17:43
 */
public class Subject6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % b  == 0) || (b % a == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

}
