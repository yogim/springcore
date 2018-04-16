package com.ymhase.springcore.model;

import java.util.List;

public class Triangle6 {

    private List<Point> points;
    

    public void setPoints(List<Point> points) {
	this.points = points;
    }

    public void draw() {
	
	for (Point point : points) {
	    
	    System.out.println( "Value of X" + point.getX() + " Value of Y" + point.getY());
	}
	
    }
}
