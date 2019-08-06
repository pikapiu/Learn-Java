package test;

import java.util.UUID;

/**
 * @Author: zs
 * @Date: 2019/8/5 17:24
 */
public class testRuntime {
    public static void main(String[] args) {
        System.out.println(create.str);
    }
}

class create{
    public static final String str = String.valueOf(UUID.randomUUID());

    static {
        System.out.println("print hello");
    }
}
