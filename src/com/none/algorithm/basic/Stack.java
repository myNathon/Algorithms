package com.none.algorithm.basic;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 栈数据结构(后进先出，LIFO)
 *         Stack()          无参构造
 * void    push(Item item)  添加一个元素
 * Item    pop()            删除最近添加的元素
 * boolean isEmpty()        栈是否为空
 * int     size()           栈中的元素数量
 */
public class Stack<Item> implements Iterable<Item> {
    public Stack() {
    }

    public void push(Item item) {
    }

    public Item pop() {
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
