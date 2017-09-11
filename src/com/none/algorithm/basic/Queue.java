package com.none.algorithm.basic;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 队列数据结构(先进先出，FIFO队列)
 *         Queue()             无参构造
 * void    enqueue(Item item)  添加一个元素
 * Item    dequeue()           删除最早添加的元素
 * boolean isEmpty()           队列是否为空
 * int     size()              队列中的元素数量
 */
public class Queue<Item> implements Iterable<Item> {
    public Queue() {
    }

    public void enqueue() {
    }

    public Item enqueue(Item item) {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
