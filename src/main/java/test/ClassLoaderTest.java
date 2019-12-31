package test;

/**
 * @Author: zs
 * @Date: 2019/8/6 11:12
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> c = Class.forName("test.AAA");
        System.out.println(c.getClassLoader());
    }
}

class AAA{
}

strictfp class fsd{ }
