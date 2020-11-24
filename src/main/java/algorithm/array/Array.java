package algorithm.array;

import java.util.ArrayList;

/**
 * @Author: zs
 * @Date: 2020/11/17 16:48
 * 实现一个支持动态扩容的数组
 */
public class Array {
    /**
     * 存数据
     */
    public int[] data;
    /**
     * 数组长度
     */
    public int n;
    /**
     * 实际大小
     */
    public int size;


    public Array(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.size=0;
    }


    public int find(int index){
        if(index < 0 || index > size){
            return -1;
        }
        return data[index];
    }


    public boolean insert(int index, int value){
        if(size == n){
            System.out.println("数组已满");
            return false;
        }
        if(index < 0 || index > size){
            System.out.println("位置不合法");
            return false;
        }

        for (int i = size; i > index ; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
        return true;
    }


    public boolean delete(int index){
        if(index < 0 || index > size){
            return false;
        }

        if (n - index + 1 >= 0) {
            System.arraycopy(data, index + 1, data, index + 1 - 1, n - index + 1);
        }
        --size;
        return true;
    }

    public void printAll(){
        for (int i : data) {
            System.out.println(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Array array = new Array(3);
//        array.insert(0, 5);
//        array.insert(0, 9999);
//        array.insert(1, 111);
//        array.insert(2, 222);
//        array.insert(3, 333);

        array.printAll();
    }



}
