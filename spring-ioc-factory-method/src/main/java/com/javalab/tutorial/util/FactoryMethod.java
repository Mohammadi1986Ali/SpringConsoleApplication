package com.javalab.tutorial.util;

import com.javalab.tutorial.api.CustomerService;
import com.javalab.tutorial.service.CustomerServiceImpl;

public class FactoryMethod {

    public CustomerService getService() {
        return new CustomerServiceImpl();
    }
}
