package com.costaroot.vertex;

public class Vertex3D extends Vertex2D{
    private final double z;

    public Vertex3D(double x,double y, double z ){
        super( x,y );
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double getDistance(Vertex3D point){
        return Math.sqrt( Math.pow(getX() - point.getX(),2) + Math.pow(getY()- point.getY(),2)+
                Math.pow(getZ()- point.getZ(),2) );
    }

    @Override
    public String toString() {
        return "Vertex3D{" +"x"+getX()+" y "+getY()+
                "z=" + z +
                '}';
    }
}
