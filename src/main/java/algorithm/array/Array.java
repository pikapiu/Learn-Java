package algorithm.array;

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
     * 存储数据个数
     */
    public int count;


    public Array(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.count=0;
    }


    public int find(int index){
        if(index < 0 || index > count){
            return -1;
        }
        return data[index];
    }


    public boolean insert(){
        return false;
    }


    public boolean delete(int index){
        if(index < 0 || index > count){
            return false;
        }

        for(int i = index + 1;i < n;i++){
            data[i-1] = data[i];
        }
        --count;
        return true;
    }





    public void printAll(){
        for (int i : data) {
            System.out.println(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

    }



}
