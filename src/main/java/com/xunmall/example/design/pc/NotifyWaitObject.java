package com.xunmall.example.design.pc;

import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: WangYanjing
 * @Date: 2019/9/16 10:46
 * @Description:
 * 1、生产者和消费者都继承了线程Thread，因为wait、notify本身就是线程间通信使用
 * 2、生产者和消费者都有两层while，外层的while是用来判断是否运行生产者和消费者。内层的while用来判断队列queue是否已满或者为空，如果满足条件，则使得当前线程变成等待状态（等待notify）。
 * 3、内层的条件判断为什么用while不用if，原因是当线程被wait之后，会释放对象锁。当等待的线程被notify之后，必须再次尝试去获取对象锁，如果没有获取到对象锁，那还必须等待，直到拿到对象锁之后才能向后执行。
 * 4、当生产者生产了一个数据或者消费者消费了一个数据之后，使用notifyAll()方法来通知所有等待当前对象锁的线程，但是一次只会有一个等待的线程能拿到锁。
 * 5、我们使用queue作为锁的对象在不同线程之间进行通信
 */
public class NotifyWaitObject {
    /**
     * 控制是否生产和消费
     */
    private static Boolean run = true;
    /**
     *  缓冲区最大数量
     */
    private static final Integer MAX_CAPACITY = 5;
    /**
     *  缓冲队列
     */
    private static final LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

    /**
     * 生产者
     */
    class Producer extends Thread {
        @Override
        public void run() {
            while (run) {
                synchronized (queue) {
                    while (queue.size() >= MAX_CAPACITY * 2) {
                        try {
                            System.out.println("缓冲队列已满，等待消费");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        String string = UUID.randomUUID().toString();
                        queue.put(string);
                        System.out.println("生产:" + string);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    queue.notifyAll();//通知生产者和消费者
                }
            }
        }
    }

    /**
     * 消费者
     */
    class Consumer extends Thread {
        @Override
        public void run() {
            while (run) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            System.out.println("队列为空，等待生产");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        System.out.println("消费：" + queue.take());
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    queue.notifyAll();//通知生产者和消费者
                }
            }
        }
    }

    public static void main(String[] args) {
        NotifyWaitObject notifyWaitObject = new NotifyWaitObject();
        Producer producer = notifyWaitObject.new Producer();
        NotifyWaitObject.Consumer consumer = notifyWaitObject.new Consumer();
        producer.start();
        consumer.start();
    }
}
