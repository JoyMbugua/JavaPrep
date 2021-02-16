package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {
    @Test
    public void newCube_instantiatesCorrectly() {

        Rectangle newRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(newRectangle);
        assertEquals(true, testCube instanceof Cube);
    }

    @Test
    public void newCube_savesRectangleInformation_rectangle() {
        Rectangle rectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(rectangle);
        assertEquals(rectangle, testCube.getFace());
    }

    @Test
    public void volume_determinesTheVolumeOfTheCube_27000() {
        Rectangle rectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(rectangle);
        assertEquals(27000, testCube.getVolume());
    }

    @Test
    public void surfaceArea_determinesTheSurfaceAreaOfCube_5400() {
        Rectangle rectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(rectangle);
        assertEquals(5400, testCube.getSurfaceArea());
    }
}