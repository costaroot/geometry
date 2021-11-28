package com.costaroot.shapes;

import com.costaroot.vertex.Vertex;

import java.util.List;

public class Shapes {
    private final String name;
    private final List vertices;

    public Shapes(String name, List vertices){
        this.name = name;
        this.vertices = vertices;
    }

    public String getName() {
        return name;
    }

    public List getVertices() {
        return vertices;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                ", vertines=" + vertices +
                '}';
    }
}
