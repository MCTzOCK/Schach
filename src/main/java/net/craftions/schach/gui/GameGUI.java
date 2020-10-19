package net.craftions.schach.gui;

import net.craftions.schach.api.Texture;
import javax.swing.*;
import java.util.ArrayList;

public class GameGUI {
    public static JFrame jf = new JFrame("Schach v1.0");
    public static ArrayList<Texture> textures = new ArrayList<Texture>();

    public static void create(){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1000, 1000);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.removeAll();
        for(Texture t : textures){
            JLabel jl = new JLabel(t.getImage());
            jl.setBounds(t.x, t.y, t.width, t.height);
            jf.add(jl);
        }
        jf.setVisible(true);
    }
/*
    protected static void render(){
        Thread renderer = new Thread(){
            @Override
            public void run() {
                while(jf.isVisible()){
                    jf.removeAll();
                    for(Texture t : textures){
                        JLabel l = new JLabel(t.getImage());
                        l.setBounds(t.x, t.y, t.width, t.height);
                        jf.add(l);
                    }
                    jf.repaint();
                    System.out.println(Math.random() / 1000);
                }
                super.run();
            }
        };
        renderer.start();
    }
    */
}
