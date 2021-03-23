/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
package com.company;
import java.util.Objects;

public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    public Location()
    {
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (!(obj instanceof Location)) return false;
        Location loc = (Location) obj;
        return xCoord == loc.xCoord && yCoord == loc.yCoord;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(xCoord, yCoord);
    }

}