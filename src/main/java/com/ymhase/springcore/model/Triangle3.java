package com.ymhase.springcore.model;

/**
 * @author Yogesh
 *
 */
public class Triangle3 {

    private String type;
    private int height;
    private int side;

    public Triangle3(String type, int height, int side) {

	this.type = type;
	this.height = height;
	this.side = side;

    }

    public String getType() {
	return type;
    }

    public int getHeight() {
	return height;
    }

    public int getSide() {
	return side;
    }

    public void setSide(int side) {
	this.side = side;
    }

    public void setType(String type) {
	this.type = type;
    }

    public void setHeight(int height) {
	this.height = height;
    }

    public void draw() {
	System.out.println("Type of triangle is " + getType() + "and its height is " + getHeight()
	+ "Side is"+getSide());
    }

}
