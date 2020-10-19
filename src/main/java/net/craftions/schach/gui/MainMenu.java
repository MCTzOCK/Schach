package net.craftions.schach.gui;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu {
    public static JFrame jf = new JFrame();

    public static JLabel jl = new JLabel("GAME MENU");

    public static JButton settings = new JButton("SETTINGS");
    public static JButton new_game = new JButton("NEW GAME");
    public static JButton resume = new JButton("RESUME");

    public static void create(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Integer width = (int) d.getWidth();
        Integer height = (int) d.getHeight();

        jf.setBounds(width /4, height /4, width /2, height /2);
        jf.setUndecorated(true);
        jf.getContentPane().setBackground(new Color(128, 128, 128));
        jf.setVisible(true);

        jl.setSize(jf.getWidth() /2, jf.getHeight() /5);
        jl.setLocation(jf.getWidth() /2 - jl.getWidth() /2, jf.getHeight() / 14);
        jl.setFont(new Font("X-Files", 0, 40));
        jl.setForeground(new Color(64, 64, 64));
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);

        settings.setSize(jf.getWidth() /4, jf.getHeight() /5);
        settings.setLocation(jf.getWidth() /2 - settings.getWidth() / 2, jf.getHeight() / 8 *2);
        settings.setBackground(new Color(64, 64, 64));
        settings.setVisible(true);
        settings.setFont(new Font("Arial", 0, 20));
        settings.setForeground(Color.white);
        settings.setFocusable(false);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingsMenu.create();
                jf.setVisible(false);
                jf = null;
                Thread clearMemory = new Thread(){
                    @Override
                    public void run() {
                        System.gc();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        super.run();
                    }
                };
                clearMemory.start();
            }
        });

        new_game.setSize(jf.getWidth() /4, jf.getHeight() /5);
        new_game.setLocation(jf.getWidth() /2 - new_game.getWidth() / 2, jf.getHeight() / 8 *4);
        new_game.setBackground(new Color(64, 64, 64));
        new_game.setVisible(true);
        new_game.setFont(new Font("Arial", 0, 20));
        new_game.setForeground(Color.white);
        new_game.setFocusable(false);

        resume.setSize(jf.getWidth() /4, jf.getHeight() /5);
        resume.setLocation(jf.getWidth() /2 - resume.getWidth() /2, jf.getHeight() /8 *6);
        resume.setBackground(new Color(64, 64, 64));
        resume.setVisible(true);
        resume.setFont(new Font("Arial", 0, 20));
        resume.setForeground(Color.white);
        resume.setFocusable(false);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setAlwaysOnTop(false);
        jf.add(jl);
        jf.add(settings);
        jf.add(new_game);
        jf.add(resume);
        jf.repaint();
    }
}
