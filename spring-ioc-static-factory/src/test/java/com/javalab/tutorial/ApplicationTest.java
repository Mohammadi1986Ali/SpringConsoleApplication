package com.javalab.tutorial;

import com.javalab.tutorial.service.GeneralService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ApplicationTest {

    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);
    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        LOGGER.info("Setting test environment");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenGeneralServiceObjectCreatedBySpringContext_thenGeneralServiceObjectMustBeCreated() {
        LOGGER.info("ApplicationTest#whenGeneralServiceObjectCreatedBySpringContext_thenGeneralServiceObjectMustBeCreated");
        GeneralService generalService = context.getBean("generalService", GeneralService.class);
        Assertions.assertThat(generalService.getService()).isNotNull();
    }
}