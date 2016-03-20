package com.mo.retailstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vijaybj on 20/03/16.
 */
public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");
        cart.checkout();
    }
}
