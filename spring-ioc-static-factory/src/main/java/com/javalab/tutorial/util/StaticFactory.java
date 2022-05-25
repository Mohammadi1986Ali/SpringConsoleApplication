package com.javalab.tutorial.util;

import com.javalab.tutorial.api.CustomerService;
import com.javalab.tutorial.service.CustomerServiceImpl;

public class StaticFactory {

    public static CustomerService getCustomerService() {
        return new CustomerServiceImpl();
    }
}
