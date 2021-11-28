package com.costaroot.shapes;
import com.costaroot.metricks.PerimeterMerasuable;
import com.costaroot.metricks.AreaMeasurable;
import com.costaroot.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shapes implements AreaMeasurable,PerimeterMerasuable{
    public PlaneShape (List <Vertex2D> vertex2D, String name){
        super(name,vertex2D);
    }

    @Override
    public String toString() {
        return "PlaneShape name: "+getName()+" Area "+getArea()+
                "Per: "+getPerimeter()+ " "+ super.getVertices();
    }
}
