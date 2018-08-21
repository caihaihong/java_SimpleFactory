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
    //    1.定义一个properties对象
//    private static Properties props = new Properties();
//
//    // 使用静态代码块给对象赋值
//    static {
//        try {
//            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("com/bean.properties");
//// InputStream in = new FileInputStream("src/bean.properties"); //绝对不能使用，web工程一旦发布，就没有src
//            props.load(in);
//        } catch (Exception e) {
//            throw new ExceptionInInitializerError("读取配置文件失败");
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(props.get("CUSTOMERSERVICE"));
//    }

    /**
     * 根据bean的名称传建类对象
     *
     * @param beanName
     * @return
     */
//    public static Object getBean(String name) {
//        try {
//            //1.读取配置文件，跟BeanNam获取全限定类名
//            return Class.forName().newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    private static ResourceBundle bundle =null;









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
