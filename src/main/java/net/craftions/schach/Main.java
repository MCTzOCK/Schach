package net.craftions.schach;

import net.craftions.schach.api.Texture;
import net.craftions.schach.gui.GameGUI;
import net.craftions.schach.gui.MainMenu;

public class Main {

    // main
    public static void main(String[] args) {
        System.out.println("Welcome to Schach v1.0");
        Texture texture = new Texture("BlackPoint.jpg", 100, 100, 100, 100);
        GameGUI.textures.add(texture);
        //GameGUI.create();

        MainMenu.create();
    }
}
