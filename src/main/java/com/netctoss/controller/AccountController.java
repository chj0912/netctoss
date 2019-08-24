package com.netctoss.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.netctoss.pojo.Account;
import com.netctoss.pojo.AccountExample;
import com.netctoss.service.AccountService;

import com.netctoss.vo.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountExample accountExample;



    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody User user)throws IOException {
        JSONObject jsonObject = new JSONObject();
        System.out.println(user.toString());
        System.out.println("111");
        jsonObject.put("status",0);
        jsonObject.put("msg","465454");
        String obj=jsonObject.toString();
        System.out.println(jsonObject.toString());
        return obj;

    //    long count= accountService.countByExample(accountExample);

    }

}
