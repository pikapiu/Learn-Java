package test;

/**
 * @Author: zs
 * @Date: 2019/8/5 16:47
 */
public class testFinal {
    public static void main(String[] args) {
        System.out.println(one.str);
    }
}

class one{
    public final static String str = "hello";

    static {
        System.out.println("print hello");
    }
}
