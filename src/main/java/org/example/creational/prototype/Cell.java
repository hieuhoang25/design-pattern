package org.example.creational.prototype;

import java.util.concurrent.TimeUnit;

/**
 * Tế bào
 * */
public class Cell implements Cloneable{
    private String color;
    private String coordinate;

    public Cell(String color) {
        this.color = color;
        try {
            // More time to create an cell
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cell [color=" + color + "]";
    }
    @Override
    protected Cell clone() {
        try {
            return (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
