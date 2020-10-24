package net.craftions.schach;

import net.craftions.schach.api.Player;
import net.craftions.schach.api.Texture;
import net.craftions.schach.config.Config;
import net.craftions.schach.gui.GameGUI;
import net.craftions.schach.gui.MainMenu;
import net.craftions.schach.music.BackgroundMusic;

import javax.swing.*;

public class Main {

    public static BackgroundMusic music = null;

    // main
    public static void main(String[] args) {
        MainMenu.create();

        System.out.println("Welcome to Schach v1.0");
        // Chess Field
        {
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture white_square = new Texture("white_square.png", 0, 0, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }else {
                    Texture black_square = new Texture("black_square.png", 100, 0, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture black_square = new Texture("black_square.png", 100, 100, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }else {
                    Texture white_square = new Texture("white_square.png", 0, 100, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture white_square = new Texture("white_square.png", 0, 200, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }else {
                    Texture black_square = new Texture("black_square.png", 100, 200, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture black_square = new Texture("black_square.png", 100, 300, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }else {
                    Texture white_square = new Texture("white_square.png", 0, 300, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture white_square = new Texture("white_square.png", 0, 400, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }else {
                    Texture black_square = new Texture("black_square.png", 100, 400, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture black_square = new Texture("black_square.png", 100, 500, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }else {
                    Texture white_square = new Texture("white_square.png", 0, 500, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture white_square = new Texture("white_square.png", 0, 600, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }else {
                    Texture black_square = new Texture("black_square.png", 100, 600, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }
            }
            for(int i = 0; i < 8; i++){
                if(String.valueOf(i).endsWith("0") || String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("4") || String.valueOf(i).endsWith("6") || String.valueOf(i).endsWith("8")){
                    Texture black_square = new Texture("black_square.png", 100, 700, 100, 100);
                    black_square.setX(100 * i);
                    GameGUI.textures.add(black_square);
                }else {
                    Texture white_square = new Texture("white_square.png", 0, 700, 100, 100);
                    white_square.setX(100 * i);
                    GameGUI.textures.add(white_square);
                }
            }
        }
        // Player (top)
        {
            Player tower_left_top = new Player(new Texture("tower.png", 0, 0, 100, 100), Player.Type.TOWER);
            Player jumper_left_top = new Player(new Texture("jumper.png", 100, 0, 100, 100), Player.Type.JUMPER);
            Player walker_left_top = new Player(new Texture("walker.png", 200, 0, 100, 100), Player.Type.WALKER);
            Player lady_top = new Player(new Texture("lady.png", 300, 0, 100, 100), Player.Type.LADY);
            Player king_top = new Player(new Texture("king.png", 400, 0, 100, 100), Player.Type.KING);
            Player walker_right_top = new Player(new Texture("walker.png", 500, 0, 100, 100), Player.Type.WALKER);
            Player jumper_right_top = new Player(new Texture("jumper.png", 600, 0, 100, 100), Player.Type.JUMPER);
            Player tower_right_top = new Player(new Texture("tower.png", 700, 0, 100, 100), Player.Type.TOWER);
            for(int i = 0; i < 8; i++) {
                Player farmer = new Player(new Texture("farmer.png", 100 * i, 100, 100, 100), Player.Type.FARMER);
                GameGUI.players.add(farmer);
            }
            GameGUI.players.add(tower_left_top);
            GameGUI.players.add(jumper_left_top);
            GameGUI.players.add(walker_left_top);
            GameGUI.players.add(lady_top);
            GameGUI.players.add(king_top);
            GameGUI.players.add(walker_right_top);
            GameGUI.players.add(jumper_right_top);
            GameGUI.players.add(tower_right_top);
        }
        // Player (bottom)
        {
            Player tower_left_top = new Player(new Texture("tower.png", 0, 700, 100, 100), Player.Type.TOWER);
            Player jumper_left_top = new Player(new Texture("jumper.png", 100, 700, 100, 100), Player.Type.JUMPER);
            Player walker_left_top = new Player(new Texture("walker.png", 200, 700, 100, 100), Player.Type.WALKER);
            Player lady_top = new Player(new Texture("lady.png", 300, 700, 100, 100), Player.Type.LADY);
            Player king_top = new Player(new Texture("king.png", 400, 700, 100, 100), Player.Type.KING);
            Player walker_right_top = new Player(new Texture("walker.png", 500, 700, 100, 100), Player.Type.WALKER);
            Player jumper_right_top = new Player(new Texture("jumper.png", 600, 700, 100, 100), Player.Type.JUMPER);
            Player tower_right_top = new Player(new Texture("tower.png", 700, 700, 100, 100), Player.Type.TOWER);
            for(int i = 0; i < 8; i++) {
                Player farmer = new Player(new Texture("farmer.png", 100 * i, 600, 100, 100), Player.Type.FARMER);
                GameGUI.players.add(farmer);
            }
            GameGUI.players.add(tower_left_top);
            GameGUI.players.add(jumper_left_top);
            GameGUI.players.add(walker_left_top);
            GameGUI.players.add(lady_top);
            GameGUI.players.add(king_top);
            GameGUI.players.add(walker_right_top);
            GameGUI.players.add(jumper_right_top);
            GameGUI.players.add(tower_right_top);
        }
        Config.player1 = "Lukas";
        Config.player2 = "Ben";
        Config.currentPlayer = "Lukas";

        // GameGUI.create();
        // CreatePlayers.init();
        // MainMenu.create();
        music = new BackgroundMusic();
        music.start();
    }
}
