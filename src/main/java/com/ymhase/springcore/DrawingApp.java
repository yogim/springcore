package com.ymhase.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ymhase.springcore.model.*;

public class DrawingApp {

    public static void main(String[] args) {

	int videoNo = 2;

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

	case 5:
	    ApplicationContext factory5 = new ClassPathXmlApplicationContext("spring7.xml");
	    Triangle5 t5 = (Triangle5) factory5.getBean("Triangle");
	    t5.print();
	    break;

	case 6:
	    ApplicationContext factory6 = new ClassPathXmlApplicationContext("spring7.xml");
	    Triangle6 t6 = (Triangle6) factory6.getBean("Triangle");
	    t6.draw();
	    break;

	case 7:
	    ApplicationContext factory7 = new ClassPathXmlApplicationContext("spring8.xml");
	    Triangle7 t7 = (Triangle7) factory7.getBean("Triangle");
	    t7.draw();
	    break;

	default:
	    break;
	}

    }

}
