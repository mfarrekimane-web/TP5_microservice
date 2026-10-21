package com.microservice.product;

import com.microservice.product.config.AppConfig;
import com.microservice.product.dao.IDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHibernate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.microservice.product");
        IDao dao = ctx.getBean(IDao.class);
        System.out.println("Produits en base : " + dao.findAll().size());
        ctx.close();
    }
}