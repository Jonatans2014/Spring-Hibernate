package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {


    public static void main(String[] args)
    {
        //load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle.xml");


        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same coach and that they are pointing
         boolean result = (theCoach ==  alphaCoach);

         //print out the results
        System.out.println("\n Pointing to the same object"+ result);

        System.out.println("\n Memory location for the Coach"+ theCoach);

        System.out.println("\n Memory location for the AlphaCoach"+ alphaCoach +"\n");



    }

}
