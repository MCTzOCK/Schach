/*
 * Copyright (c) 2020 Ben Siebert. All rights reserved.
 */

package net.craftions.schach.api;

import net.craftions.schach.gui.GameGUI;

import javax.swing.*;

public class Util {

    public static void click(JLabel l, Player p, JFrame f){
        Player.Type type = p.getType();
        Texture texture = p.getTexture();
        Integer x = p.getTexture().x;
        Integer y = p.getTexture().y;
        if(!isPlayerAbove(p)){
            GameGUI.players.remove(p);
            f.remove(l);
            f.repaint();
        }
    }

    public static Boolean isPlayerAbove(Player p){
        Integer x = p.getTexture().x;
        Integer y = p.getTexture().y - 100;
        for(Player player : GameGUI.players){
            System.out.println(player.getType().toString());
            if(player.getTexture().y.equals(y) && player.getTexture().x.equals(x)){
                return true;
            }
        }
        return false;
    }
}
