package com.javalab.tutorial;

import com.javalab.tutorial.service.GeneralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        LOGGER.info("Application#main");

        GeneralService generalService = context.getBean("generalService", GeneralService.class);
        generalService.getService().welcomeCustomer("Ali");
    }

}
