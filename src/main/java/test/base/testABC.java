package test.base;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * @Author: zs
 * @Date: 2020/11/18 9:56
 */
public class testABC {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c instanceof B);
    }
}
