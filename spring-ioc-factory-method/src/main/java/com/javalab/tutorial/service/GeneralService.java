package com.javalab.tutorial.service;

import com.javalab.tutorial.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralService.class);

    private CustomerService service;

    public CustomerService getService() {
        return service;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }

}
