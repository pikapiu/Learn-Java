package test;

/**
 * @Author: zs
 * @Date: 2019/8/5 16:25
 */
public class initialTest {
    public static void main(String[] args) {
        System.out.println(child.str1);
    }
}

class before {

    public static String str1 = "before";

    static {
        System.out.println("print before");
    }
}

class child extends before {

    public static String str = "hello";

    static {
        System.out.println("print hello");
    }
}
