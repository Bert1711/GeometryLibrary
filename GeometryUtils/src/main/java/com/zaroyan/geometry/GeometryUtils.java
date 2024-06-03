package com.zaroyan.geometry;

import com.zaroyan.geometrylibrary.Shape;

public class GeometryUtils {
    public static <T extends Shape> boolean areEqual(T shape1, T shape2) {
        return shape1.getArea() == shape2.getArea();
    }
}