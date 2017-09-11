package com.none.algorithm.basic;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 背包数据结构实现
 *         Bag()             无参构造
 * void    add(Item item)    添加一个元素
 * boolean isEmpty()         背包是否为空
 * int     size()            背包中的元素数量
 */
public class Bag<Item> implements Iterable<Item> {
    public Bag() {
    }

    public void add() {
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
