package collection;

import java.util.ArrayDeque;

/**
 * Deque 是Queue的子接口 ，ArrayDeque是双端队列，
 *
 *
 */
public class ArrayDequeStack {
    public static void main(String[] args) {
        //TODO:栈操作 避免使用，性能差
        var stack = new ArrayDeque();
        stack.push("疯狂java讲义");
        stack.push("轻量级javaEE企业引用开发");
        stack.push("疯狂Android讲义");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        //集合
        ArrayDeque deque = new ArrayDeque<>();
        deque.offer("疯狂java讲义");
        deque.offer("轻量级javaEE企业引用开发");
        deque.offer("疯狂Android讲义");
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
    }
}
