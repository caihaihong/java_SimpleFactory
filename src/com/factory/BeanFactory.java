package com.factory;
/**
 * 一个工厂类
 */

import com.dao.ICustomerDao;
import com.service.ICustomerService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class BeanFactory {
    public static ICustomerService getCustomerService() {
        try {
            return (ICustomerService) Class.forName("com.service.imple.CustomerServiceImpl").newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ICustomerDao getCustomerDao() {
        try {
            return (ICustomerDao) Class.forName("com.dao.impl.CustomerDaoImpl").newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
