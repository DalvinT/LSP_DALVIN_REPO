package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeRendererTest {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("circle");
        assertNotNull(shape, "Circle should be created");
        assertTrue(shape instanceof Circle, "Shape should be an instance of Circle");
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape, "Rectangle should be created");
        assertTrue(shape instanceof Rectangle, "Shape should be an instance of Rectangle");
    }

    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape, "Triangle should be created");
        assertTrue(shape instanceof Triangle, "Shape should be an instance of Triangle");
    }

    @Test
    public void testUnknownShapeCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("hexagon");
        assertNull(shape, "Unknown shape should return null");
    }
}
