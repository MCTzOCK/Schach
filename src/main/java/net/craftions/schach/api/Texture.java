package net.craftions.schach.api;

import javax.swing.*;

public class Texture {

    public String path;
    public Integer x;
    public Integer y;
    public Integer width;

    public Integer height;

    public Texture(String path, Integer x, Integer y, Integer width, Integer height) {
        this.path = "/assets/" + path;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ImageIcon getImage(){
        return new ImageIcon(Texture.class.getResource(this.path));
    }
}
