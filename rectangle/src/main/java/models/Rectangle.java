package models;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
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
}
