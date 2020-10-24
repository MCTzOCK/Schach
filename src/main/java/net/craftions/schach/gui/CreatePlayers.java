/*
 * Copyright (c) 2020 Ben Siebert. All rights reserved.
 */

package net.craftions.schach.gui;

import net.craftions.schach.config.Config;

import javax.swing.*;

public class CreatePlayers {

    public static void init(){
        String player1 = JOptionPane.showInputDialog("Please enter the name of the first player!");
        String player2 = JOptionPane.showInputDialog("Please enter the name of the second player!");
        JOptionPane.showMessageDialog(null,"So " + player1 + " will start!");
        Config.player1 = player1;
        Config.player2 = player2;
        GameGUI.create();
    }
}
