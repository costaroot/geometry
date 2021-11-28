package com.costaroot;

import com.costaroot.shapes.Shapes;
import com.costaroot.shapes.Triangle;
import com.costaroot.vertex.Vertex2D;

public class Main {

    public static void main(String[] args) {
        System.out.println("Geometry");
        Shapes shape = new Triangle(new Vertex2D(1,0),new Vertex2D(0,0),new Vertex2D(0,3));
        System.out.println(shape.toString());
    }
}
