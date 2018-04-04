package com.ymhase.springcore.model;

public class Triangle {

    private Point A;
    private Point B;
    private Point C;

    public Point getA() {
	return A;
    }

    public void setA(Point a) {
	A = a;
    }

    public Point getB() {
	return B;
    }

    public void setB(Point b) {
	B = b;
    }

    public Point getC() {
	return C;
    }

    public void setC(Point c) {
	C = c;
    }

    public void print() {
	System.out.println("Point A" + A.getX() + "--" + A.getY());
	System.out.println("Point B" + B.getX() + "--" + B.getY());
	System.out.println("Point C" + C.getX() + "--" + C.getY());

    }

    /*
     * private String type; private int height;
     * 
     * public Triangle(String type) { this.type = type; } public Triangle(int
     * height) { this.height = height; }
     * 
     * public Triangle(String type, int height){ this.type = type; this.height =
     * height;
     * 
     * } public String getType() { return type; }
     * 
     * 
     * public int getHeight() { return height; } public void setHeight(int height) {
     * this.height = height; }
     * 
     * public void setType(String type) { this.type = type; }
     * 
     * public void draw() { System.out.println(getType() + "Draw Triangle" +
     * "Height - "+ getHeight());
     * 
     * }
     */
}
