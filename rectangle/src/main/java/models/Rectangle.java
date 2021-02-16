package models;

import java.util.ArrayList;

public class Rectangle {
    private int height;
    private int width;
    private static ArrayList<Rectangle> instances = new ArrayList<>();
    private Boolean shape;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
        instances.add(this);
        this.shape = isSquare();
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
    return this.width;
    }

    public boolean isSquare(){
        return this.height == this.width;
    }

    public int getArea(){
        return getHeight() * getWidth();
    }

    public static ArrayList<Rectangle> getAll(){
        return instances;
    }

    public boolean getShape(){
        return shape;
    }
}
