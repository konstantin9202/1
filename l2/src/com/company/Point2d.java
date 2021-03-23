package com.company;
public class Point2d{
    private double xCoord;
    private double yCoord;

    public Point2d (double x, double y){
        xCoord = x;
        yCoord = y;
    }

    public Point2d(){
        //call
        this(0.0, 0.0);
    }


    //берем значение
    public double getX(){
        return xCoord;
    }

    public double getY(){
        return yCoord;
    }


    //отдаем значение
    public void setX(double val){
        xCoord = val;
    }

    public void setY(double val){
        yCoord = val;
    }


    // расстояние между двумя точками
    public double distanceTo (Point2d p){
        double x2 = p.getX();
        double y2 = p.getY();

        double x = this.xCoord;
        double y = this.yCoord;

        double eq = Math.sqrt(Math.pow((x2-x), 2) + Math.pow((y2-y), 2));
        return eq;
    }

    public static boolean equalsPoints (Point2d p, Point2d p2){
        double x = p.getX();
        double y = p.getY();

        double x2 = p2.getX();
        double y2 = p2.getY();

        //if ((x+y) == (x2+y2))
        if ((x == x2) && (y == y2))
            return true;
        else return false;

    }

}