package net.craftions.schach.gui;

import net.craftions.schach.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsMenu {
    public static JFrame jf = new JFrame();

    public static JLabel jl = new JLabel("SETTINGS");
    public static JLabel music = new JLabel("MUSIC");
    public static JLabel sound = new JLabel("SOUNDS");

    public static JCheckBox music_on = new JCheckBox();
    public static JCheckBox sound_on = new JCheckBox();

    public static JButton back = new JButton("BACK");

    public static void create(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Integer width = (int) d.getWidth();
        Integer height = (int) d.getHeight();

        jf.setBounds(width /4, height /4, width /2, height /2);
        jf.setUndecorated(true);
        jf.getContentPane().setBackground(new Color(128, 128, 128));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setAlwaysOnTop(false);
        jf.setLayout(null);
        jf.setVisible(true);

        jl.setSize(jf.getWidth() /2, jf.getHeight() /5);
        jl.setLocation(jf.getWidth() /2 - jl.getWidth() /2, jf.getHeight() / 14);
        jl.setFont(new Font("X-Files", 0, 40));
        jl.setForeground(new Color(64, 64, 64));
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);

        music.setSize(jf.getWidth() /4, jf.getHeight() /5);
        music.setLocation(jf.getWidth() /4 - music.getWidth(), jf.getHeight() /5);
        music.setFont(new Font("Arial", 0, 30));
        music.setForeground(new Color(64, 64, 64));
        music.setHorizontalAlignment(JLabel.CENTER);
        music.setVerticalAlignment(JLabel.CENTER);

        music_on.setBounds(jf.getWidth() /4, jf.getHeight() /5 + music.getWidth() /6, 20, 20);
        music_on.setBackground(new Color(128, 128, 128));
        music_on.setVisible(true);
        music_on.setSelected(true);
        music_on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!music_on.isSelected()) {
                    Main.music.stopPlay();
                } else if(music_on.isSelected()) {
                    Main.music.doPlay("/assets/1.wav");
                }
            }
        });

        sound.setSize(jf.getWidth() /4, jf.getHeight() /5);
        sound.setLocation((jf.getWidth() /4 * 3) - sound.getWidth() /2, jf.getHeight() /5);
        sound.setFont(new Font("Arial", 0, 30));
        sound.setForeground(new Color(64, 64, 64));
        sound.setHorizontalAlignment(JLabel.CENTER);
        sound.setVerticalAlignment(JLabel.CENTER);

        sound_on.setBounds((jf.getWidth() /4 * 3) + sound.getWidth() /2, jf.getHeight() /5 + sound.getWidth() /6, 20, 20);
        sound_on.setBackground(new Color(128, 128, 128));
        sound_on.setVisible(true);

        back.setSize(jf.getWidth() /6, jf.getHeight() /8);
        back.setLocation( jf.getWidth() /2 - back.getWidth() /2, jf.getHeight() /8 *6);
        back.setBackground(new Color(64, 64, 64));
        back.setVisible(true);
        back.setFont(new Font("Arial", 0, 20));
        back.setForeground(Color.white);
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf = new JFrame();
                MainMenu.jf = new JFrame();
                MainMenu.create();
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

        jf.add(jl);
        jf.add(music);
        jf.add(music_on);
        jf.add(sound);
        jf.add(sound_on);
        jf.add(back);
        jf.repaint();
    }
}
