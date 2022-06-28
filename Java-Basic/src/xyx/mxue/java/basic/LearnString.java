package xyx.mxue.java.basic;

/**
 * <h2> LearnString 学习String </h2>
 *
 * @author mxuexxmy
 * @date 2022/6/29 0:18
 */
public class LearnString {

    public static void main(String[] args) {

        String a = "Learn ";
        System.out.println(a.hashCode());
        a += "String";
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println("------");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Learn ");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("String");
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.hashCode());

    }

}
