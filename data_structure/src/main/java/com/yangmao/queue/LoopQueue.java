package com.yangmao.queue;

/**
 * 基于循环数组的队列
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] array;

    /**
     * 存储第一个有效元素在数组中的下标
     */
    private int front;

    /**
     * 存储最后一个有效元素的后一位置在数组中的下标
     */
    private int tail;

    private int size;

    public LoopQueue(int capacity) {
        this.array = (E[]) new Object[capacity + 1];
        this.front = 0;
        this.tail = 0;
        this.size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return array.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % array.length == front) {
            this.resize(this.getCapacity() * 2);
        }
        array[tail] = e;
        tail = (tail + 1) % array.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        E result = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        if (this.getSize() == this.getCapacity() / 4 && this.getCapacity() / 2 != 0) {
            this.resize(this.getCapacity() / 2);
        }
        return result;
    }

    @Override
    public E getFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return array[front];
    }

    private void resize(int newCapacity) {
        E[] newArray = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < this.getSize(); i++) {
            newArray[i] = array[(i + front) % array.length];
        }
        array = newArray;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("循环队列：")
                .append("size = ").append(this.getSize())
                .append(" capacity = ").append(this.getCapacity())
                .append("\n");
        builder.append("front [");
        for (int i = front; i != tail; i = (i + 1) % array.length ) {
            builder.append(array[i]);
            if (i != tail - 1) {
                builder.append(", ");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }

}
