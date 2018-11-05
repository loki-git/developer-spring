package com.loki.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author xujs
 */
public class SpringMain {

    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld = (HelloWorld) atx.getBean("helloWorld");
        helloWorld.hello();
    }

}
