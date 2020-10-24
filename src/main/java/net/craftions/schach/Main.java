package net.craftions.schach;

import net.craftions.schach.api.Texture;
import net.craftions.schach.gui.GameGUI;
import net.craftions.schach.gui.MainMenu;
import net.craftions.schach.gui.SettingsMenu;
import net.craftions.schach.music.BackgroundMusic;
import net.craftions.schach.music.Moderator;

public class Main {

    public static BackgroundMusic music;

    public static void main(String[] args) {
        System.out.println("Welcome to Schach v1.0");
        Texture texture = new Texture("BlackPoint.jpg", 100, 100, 100, 100);
        GameGUI.textures.add(texture);
        //GameGUI.create();

        MainMenu.create();
        SettingsMenu.create();
        SettingsMenu.jf.setVisible(false);
        BackgroundMusic bm = new BackgroundMusic();
        music = bm;
        bm.start();
        Moderator m = new Moderator();
        m.start();
    }
}
