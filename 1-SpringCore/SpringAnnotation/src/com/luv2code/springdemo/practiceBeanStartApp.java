package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practiceBeanStartApp {


    public  static void main(String[] args)
    {
        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        // call a method  on the bean
        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        //check if the above classses are the same
        boolean result =(theCoach == alphaCoach);


        //print out results
        System.out.println("Pointing to the same Object "+ result);

        System.out.println("Pointing to thecoach "+ theCoach);

        System.out.println("Pointing to Alphacoach "+ alphaCoach);

        //call method to get the daily fortuner

        System.out.println(theCoach.getDailyFortune()) ;
        // close the context

        context.close();
    }
}
