/*
 * Copyright (c) 2020 Ben Siebert. All rights reserved.
 */

package net.craftions.schach.api;

import java.util.ArrayList;
import java.util.UUID;

public class Player {

    private Texture texture;
    private Type type;
    private UUID uuid;

    protected static ArrayList<Player> players = new ArrayList<Player>();

    public static Player getPlayerByUUID(UUID uuid){
        for(Player player : players){
            if(player.getUUID() == uuid){
                return player;
            }
        }
        return new EmptyPlayer(null, null);
    }

    public Player(Texture texture,Type type) {
        this.texture = texture;
        this.type = type;
        this.uuid = UUID.randomUUID();
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UUID getUUID() {
        return uuid;
    }

    public enum Type {
        KING,
        LADY,
        TOWER,
        WALKER,
        JUMPER,
        FARMER
    }

    public enum Team {
        BLACK,
        WHITE
    }

    public static String getPathByTeam(Player.Team team){
        return "";
    }
}
