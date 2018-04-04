package com.ymhase.springcore.model;

public class Triangle2 {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public void draw() {
	System.out.println("Type of triangle is "+ getType());
    }

}
