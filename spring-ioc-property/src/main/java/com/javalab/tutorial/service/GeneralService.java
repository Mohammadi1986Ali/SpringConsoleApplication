package com.javalab.tutorial.service;

import com.javalab.tutorial.api.CustomerService;

public class GeneralService {

    private CustomerService service;

    public CustomerService getService() {
        return service;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }
}
