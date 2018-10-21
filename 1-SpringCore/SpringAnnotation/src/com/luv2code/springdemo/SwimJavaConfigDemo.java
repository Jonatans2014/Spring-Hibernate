package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {



    public  static void main(String[] args)
    {
        // read spring config Java Class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
        // call a method  on the bean

        System.out.println(theCoach.getDailyWorkout());


        //call method to get the daily fortuner

     System.out.println(theCoach.getDailyFortune()) ;
        // close the context



        System.out.println("email "+theCoach.getEmail()) ;
        System.out.println("team "+theCoach.getTeam()) ;

        context.close();
    }
}
