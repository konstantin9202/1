package com.company;
public class Point3d{
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z){//конструктор по умолчанию
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d(){//конструктор по умолчанию

        this(0.0, 0.0, 0.0);
    }

    //берем значение
    public double getX(){
        return xCoord;
    }

    public double getY(){
        return yCoord;
    }

    public double getZ(){
        return zCoord;
    }

    //отдаем значение
    public void setX(double val){
        xCoord = val;
    }

    public void setY(double val){
        yCoord = val;
    }

    public void setZ(double val){
        zCoord = val;
    }

    // расстояние между двумя точками
    public double distanceTo (Point3d p){
        double x2 = p.getX();
        double y2 = p.getY();
        double z2 = p.getZ();

        double x = this.xCoord;
        double y = this.yCoord;
        double z = this.zCoord;

        double eq = Math.sqrt(Math.pow((x2-x), 2) +
                Math.pow((y2-y), 2) +
                Math.pow((z2-z), 2));
        return eq;
    }

    public static boolean equalsPoints (Point3d p, Point3d p2){
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();

        double x2 = p2.getX();
        double y2 = p2.getY();
        double z2 = p2.getZ();

        if ((x == x2) && (y == y2) && (z == z2))
            return true;
        else return false;

    }

}