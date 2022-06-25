package com.javalab.tutorial.service;

import com.javalab.tutorial.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralService.class);

    private CustomerService service;

    public GeneralService() {
        LOGGER.info("GeneralService#GeneralService");
    }

    public GeneralService(CustomerService service) {
        LOGGER.info("GeneralService#GeneralService {}", service.getClass());
        this.service = service;
    }

    public CustomerService getService() {
        return service;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }

    public void beanInitMethod() {
        LOGGER.info("GeneralService#beanInitMethod");
    }

    public void beanDestroyMethod() {
        LOGGER.info("GeneralService#beanDestroyMethod");
    }
}
