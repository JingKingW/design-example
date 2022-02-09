package com.xunmall.example.design.singleton;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 功能描述: 测试不同单例模式是否生效
 * @params:
 * @return:e
 * @Author: wangyanjing
 * @Date: 2019/5/6 11:51
**/
public class SingletonDemoTest {

    @Test
    public void testSingletonDemo1() {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDemo1 demo = SingletonDemo1.getInstance();
                    System.out.println(demo.hashCode());
                }
            });
            t.start();
        }
    }


    @Test
    public void testSingletonDemo2() {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDemo2 demo = SingletonDemo2.getInstance();
                    System.out.println(demo.hashCode());
                }
            });
            t.start();
        }
    }


    @Test
    public void testSingletonDemo3() {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDemo3 demo = SingletonDemo3.getInstance();
                    System.out.println(demo.hashCode());
                }
            });
            t.start();
        }
    }

    @Test
    public void testSingletonDemo4() {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDemo4 demo = SingletonDemo4.getInstance();
                    System.out.println(demo.hashCode());
                }
            });
            t.start();
        }
    }

    @Test
    public void testSingletonDemo5() {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDemo5 demo = SingletonDemo5.INSTANCE;
                    System.out.println(demo.hashCode());
                }
            });
            t.start();
        }
    }

    @Test
    public void testReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo3 singletonDemo = SingletonDemo3.getInstance();
        Constructor<SingletonDemo3> demo3Constructor = SingletonDemo3.class.getDeclaredConstructor();
        demo3Constructor.setAccessible(true);
        SingletonDemo3 newSingletonDemo = demo3Constructor.newInstance();
        System.out.println(singletonDemo == newSingletonDemo);
    }

    @Test
    public void testSerialize(){
        SingletonDemo3 instance = SingletonDemo3.getInstance();
        byte[] serialize = SerializationUtils.serialize(instance);
        SingletonDemo3 newInstance = SerializationUtils.deserialize(serialize);
        System.out.println(instance == newInstance);
    }



}
