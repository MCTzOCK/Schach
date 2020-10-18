package net.craftions.schach.gui;

import net.craftions.schach.api.Texture;

import javax.swing.*;
import java.util.ArrayList;

public class GameGUI {
    public static JFrame jf = new JFrame("Schach v1.0");
    public static ArrayList<Texture> textures = new ArrayList<Texture>();

    public static void create(){
        render();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1000, 900);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setVisible(true);
    }

    protected static void render(){
        Thread renderer = new Thread(){
            @Override
            public void run() {
                while(jf.isVisible()){
                    jf.repaint();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                super.run();
            }
        };
        renderer.start();
    }
}
