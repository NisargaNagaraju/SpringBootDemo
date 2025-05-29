package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//created the spring container and configuration for that container is maintained in spring.xml , now the container knows what are the objects to be created from Spring container
        Alien obj=(Alien)context.getBean("Alien");//container not able to find alien, using xml to talk to container // getbean gives the object
        obj.code();
    }
}
