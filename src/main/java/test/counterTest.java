package test;

/**
 * @Author: zs
 * @Date: 2019/8/6 8:18
 */
public class counterTest {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("counter1:" + SingleTon.counter1);
        System.out.println("counter2:" + SingleTon.counter2);

    }
}

class SingleTon {
    public static int counter1;
    private  SingleTon() {
        counter1++;
        counter2++;
    }

    private static SingleTon singleTon;
    public static int counter2 = 2;

    public static SingleTon getInstance(){
        singleTon = new SingleTon();
        return  singleTon;
    }

    }
