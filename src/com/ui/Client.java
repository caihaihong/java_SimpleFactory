package com.ui;

import com.dao.ICustomerDao;
import com.factory.BeanFactory;
import com.service.ICustomerService;
import com.service.imple.CustomerServiceImpl;

/**
 * 模拟表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
//        ICustomerService customerService = new CustomerServiceImpl();
        ICustomerService customerService = BeanFactory.getCustomerService();
        customerService.saveCustomer();
    }
}