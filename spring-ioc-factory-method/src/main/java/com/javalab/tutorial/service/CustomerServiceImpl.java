package com.javalab.tutorial.service;

import com.javalab.tutorial.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public void welcomeCustomer(String customerName) {
        LOGGER.info("CustomerServiceImpl#welcomeCustomer");
        LOGGER.info("Welcome {}", customerName);
    }
}