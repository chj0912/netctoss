package com.netctoss;

import com.netctoss.pojo.Account;
import com.netctoss.service.AccountService;
import com.netctoss.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class AccountTest {

    @Test
    public void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
        AccountService accountService= context.getBean(AccountServiceImpl.class);
        Account account=new Account();
        account.setAccountLoginName("dgbf70");
        List<Account> list=accountService.selectByExample(account);
        System.out.println(list.get(0).toString());
    }


    @Test
    public void run1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
     //   AccountService accountService= (AccountService) context.getBean("accountService");
        AccountService accountService= (AccountService) context.getBean("accountService");
        Account account=accountService.selectByPrimaryKey(1010);
        System.out.println(account.toString());
    }



}
