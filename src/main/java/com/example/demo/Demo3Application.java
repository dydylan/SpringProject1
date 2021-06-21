package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {

    public static void main(String[] args) {SpringApplication.run(Demo3Application.class, args);}

    @Override
    public void run(String ... args) throws Exception {
        ApplicationContext cxt =
                new ClassPathXmlApplicationContext("spring-beans.xml");
        House house = (House) cxt.getBean("houseBean");
        Developper developper = (Developper) cxt.getBean("devBean");
        Company company = (Company) cxt.getBean("companyBean");

        System.out.println(house.toString());
        System.out.println(developper.toString());
        System.out.println(company.toString());
    }
}
