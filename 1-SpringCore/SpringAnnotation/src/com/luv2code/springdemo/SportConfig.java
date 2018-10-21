package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*Spring config with java Code
*
*
* */

//Step1. Create a java class and annotate as @Configuration
@Configuration
//ste2: Add component scanning support @ComponentScan
@ComponentScan("com.luv2code.springdemo")

@PropertySource("classpath:sport.properties")
public class SportConfig {

    //1. Define method to expose the bean
    //define bean for our sad fortune

    @Bean
    public FortuneService SadFortuneService() {
        return  new SadFortuneService();
    }

    // defiene bean for our swim coach and inject dependencies

    @Bean
    public Coach swimCoach(){
        return  new SwimCoach(SadFortuneService());
    }

}
