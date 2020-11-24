package algorithm.array;

import java.util.Objects;

/**
 * @Author: zs
 * @Date: 2020/11/24 16:40
 */
public class GenericArray<T> {
    private T[] data;
    private int size;

    public GenericArray() {
        this(10);
    }

    public GenericArray(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public int getCapacity() {
        return data.length;
    }

    public int count() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    private void checkIndex(int index) {
        if (index > size || index <= 0) {
            throw new IllegalArgumentException("require index >=0 and < size");
        }

    }


    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("remove failed! Require index >=0 and index <= size.");
        }

    }

    /**
     * 修改index位置的数
     */
  public void set(int index,T e){
    checkIndex(index);
    data[index] = e;
  }


    /**
     * 查看该数组是否包含某个数
     */

    public boolean contains(T e){
        for (T t : data) {
            if(e == t){
                return true;
            }
        }
        return false;
    }

    /**
     * // 获取对应元素的下标, 未找到，返回 -1
     */

    public int find(T e){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }


    /**
     *  // 在 index 位置，插入元素e, 时间复杂度 O(m+n)
     */

    public void add(int index,T e){
        checkIndexForAdd(index);
        if(size == data.length){
            resize(data.length << 1);
        }

        for(int end = size - 1;end >= index; end--){
            data[end + 1] = data[end];
        }
        data[index] = e;
        size ++;
    }

    public void addFirst(T e){
        add(0,e);
    }

    public void addLast(T e){
        add(size,e);
    }

    /**
     *
     * 删除指定位置的元素，并返回
     */
    public T remove(int index){
        checkIndex(index);
        T ret = data[index];
        for (int i = index + 1; i < index; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if(size == data.length << 2 && data.length << 1 !=0){
            resize(data.length << 1);
        }

        return ret;
    }


    // 从数组中删除指定元素
    public void removeElement(T e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }


    public void resize(int capacity){
        System.arraycopy(data, 0,  new Object[capacity], 0, data.length);
    }




}