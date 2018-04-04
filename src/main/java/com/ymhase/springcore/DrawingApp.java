package com.ymhase.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ymhase.springcore.model.*;

public class DrawingApp {

    public static void main(String[] args) {

	int videoNo = 4;

	switch (videoNo) {
	case 1:
	    ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
	    Triangle1 t1 = (Triangle1) factory.getBean("Triangle");
	    t1.draw();
	    break;

	case 2:
	    ApplicationContext factory2 = new ClassPathXmlApplicationContext("spring2.xml");
	    Triangle2 t2 = (Triangle2) factory2.getBean("Triangle");
	    t2.draw();
	    break;

	case 3:
	    ApplicationContext factory3 = new ClassPathXmlApplicationContext("spring3.xml");
	    Triangle3 t3 = (Triangle3) factory3.getBean("Triangle");
	    t3.draw();
	    break;
	    
	case 4:
	    ApplicationContext factory4 = new ClassPathXmlApplicationContext("spring4.xml");
	    Triangle4 t4 = (Triangle4) factory4.getBean("Triangle");
	    t4.print();
	    break;


	default:
	    break;
	}

    }

}
