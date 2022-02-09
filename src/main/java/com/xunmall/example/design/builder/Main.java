package com.xunmall.example.design.builder;

import javax.swing.*;
import java.awt.*;

import static java.awt.EventQueue.invokeLater;

/**
 * @author Eugene
 * @date 2018/9/14
 */
public class Main {

    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                // 创建窗口对象
                JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setTitle("画人");
                frame.setSize(250, 300);

                // 设置窗口关闭按钮的默认操作(点击关闭时退出进程)
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                // 把窗口位置设置到屏幕的中心
                frame.setLocationRelativeTo(null);
                frame.setContentPane(new JPanel(){
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        PersonFatBuilder thinBuilder = new PersonFatBuilder(g);
                        PersonDirector director = new PersonDirector(thinBuilder);
                        director.drawPerson();
                    }
                });
            }
        });
    }
}
