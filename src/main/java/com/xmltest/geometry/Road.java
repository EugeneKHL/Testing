package com.xmltest.geometry;

public class Road {
    public final Point start;
    public final Point end;
    public final int speedLimit;
    //public final double length;

    public Road(Point start, Point end, int speedLimit) {
        this.start = start;
        this.end = end;
        //this.length = function(...);
        this.speedLimit = speedLimit;
    }
}
