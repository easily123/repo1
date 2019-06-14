package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
   public void FindById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }

    @Test
    public void FimdById1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationComtext.xml");
        ItemsService itemsService = applicationContext.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }

}
