package com.zaroyan.threedimensional;

public class Cube {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

