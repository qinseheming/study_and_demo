package com.yangmao.array;

/**
 * 自定义数组
 */
public class Array<T> {

    private T[] data;

    private int size;

    public Array(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引越界");
        }
        if (size == data.length) {
            this.resize(data.length * 2);
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    public void addFirst(T e) {
        this.add(0, e);
    }

    public void addLast(T e) {
        this.add(size, e);
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }
        return data[index];
    }

    public T getFirst() {
        return this.get(0);
    }

    public T getLast() {
        return this.get(size - 1);
    }

    public int indexOf(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean exist(T e) {
        return this.indexOf(e) != -1;
    }

    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引越界");
        }
        T ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if (size == data.length / 4 && data.length / 2 != 0) {
            this.resize(data.length / 2);
        }
        return ret;
    }

    public T removeFirst() {
        return this.remove(0);
    }

    public T removeLast() {
        return this.remove(size - 1);
    }

    public void removeElement(T e) {
        int i = this.indexOf(e);
        remove(i);
    }

    public void set(int index, T e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }
        data[index] = e;
    }

    /**
     * 调整数组大小
     * @param newCapacity 新数组长度
     */
    private void resize(int newCapacity) {
        T[] newData = (T[]) new Object[newCapacity];
        if (size >= 0) {
            System.arraycopy(data, 0, newData, 0, size);
        }
        data = newData;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("Array: size = %d, capacity = %d\n", this.size, data.length));
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                sb.append(data[i]).append(", ");
            } else {
                sb.append(data[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }

}




















