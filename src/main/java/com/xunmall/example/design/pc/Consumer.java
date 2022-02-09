package com.xunmall.example.design.pc;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author wangyanjing
 * @date 2020/6/18 21:58
 */
public class Consumer implements Runnable {
    private BlockingQueue<PCData> queue;
    private static final int SLEEP_TIME = 1000;

    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start Consumer id =" + Thread.currentThread().getId());
        Random random = new Random();

        try {
            while (true) {
                // 提取任务
                PCData data = queue.take();
                if (null != data) {
                    // 计算平方
                    int re = data.getIniData() * data.getIniData();
                    System.out.println(MessageFormat.format("{0} * {1} = {2}", data.getIniData(), data.getIniData(), re));
                    Thread.sleep(random.nextInt(SLEEP_TIME));
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }
}
