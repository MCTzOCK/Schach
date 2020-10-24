package net.craftions.schach.gui;

import net.craftions.schach.api.Player;
import net.craftions.schach.api.Texture;
import net.craftions.schach.api.Util;
import net.craftions.schach.config.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GameGUI {
    public static JFrame jf = new JFrame("Schach v1.0");
    public static ArrayList<Texture> textures = new ArrayList<Texture>();
    public static ArrayList<Player> players = new ArrayList<Player>();

    public static void create(){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(816, 1000);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setLayout(null);

        JLabel onTurn = new JLabel("<html><body><h1>Am Zug ist:<span style='color: lime;'> " + Config.player1 + "</span></h1></body></html>");
        onTurn.setBounds(0, 800, 300, 50);
        onTurn.setFont(new Font("X-Files", 0, 40));
        jf.add(onTurn);

        JButton pause = new JButton("| |");
        pause.setSize(50, 50);
        pause.setLocation(jf.getWidth() - pause.getWidth() - 15, 0);
        pause.setBackground(new Color(64, 64, 64));
        pause.setVisible(true);
        pause.setFont(new Font("Arial", 0, 20));
        pause.setForeground(Color.white);
        pause.setFocusable(false);
        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                MainMenu.jf.setVisible(true);
            }
        });
        jf.add(pause);

        for(Player p : players){
            JLabel jl = new JLabel(p.getTexture().getImage());
            jl.setBounds(p.getTexture().x, p.getTexture().y, p.getTexture().width, p.getTexture().height);
            jl.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Util.click(jl, p, jf);
                    super.mouseClicked(e);
                }
            });
            jf.add(jl);
        }
        for(Texture t : textures) {
            JLabel jl = new JLabel(t.getImage());
            jl.setBounds(t.x, t.y, t.width, t.height);
            jl.setVisible(true);
            jf.add(jl);
        }
        jf.setVisible(true);
    }
}
