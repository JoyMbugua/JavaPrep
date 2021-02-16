package models;

public class Cube {
    private Rectangle face;

    public Cube(Rectangle rectangle){
       this.face = rectangle;
    }

    public Rectangle getFace(){
        return face;
    }

    public int getVolume(){
        int length = face.getWidth();
        return length * length * length;
    }

    public int getSurfaceArea(){
        return face.getArea() * 6;
    }
}
