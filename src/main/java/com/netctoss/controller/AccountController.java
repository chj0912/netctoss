package com.netctoss.controller;


import com.netctoss.pojo.AccountExample;
import com.netctoss.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountExample accountExample;


    @RequestMapping("/login")

    public void login(String name,String password){
        System.out.println(name);
        System.out.println(password);
        System.out.println("1111");

    //    long count= accountService.countByExample(accountExample);

    }

}
