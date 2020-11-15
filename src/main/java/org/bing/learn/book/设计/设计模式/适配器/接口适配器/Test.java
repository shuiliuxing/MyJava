package org.bing.learn.book.设计.设计模式.适配器.接口适配器;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test {
    public static void main(String[] args){
        JFrame jf=new JFrame();
        jf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("按键事件");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("按键事件");
            }
        });
    }
}
