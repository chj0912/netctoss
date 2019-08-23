package com.netctoss.service.impl;

import com.netctoss.dao.AccountMapper;
import com.netctoss.pojo.Account;
import com.netctoss.pojo.AccountExample;
import com.netctoss.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountExample accountExample;

    @Override
    public long countByExample(AccountExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AccountExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Account record) {
        return 0;
    }

    @Override
    public int insertSelective(Account record) {
        return 0;
    }

    /**
     * 根据用户名查询用户信息
     * @param example
     * @return
     */
    @Override
    public List<Account> selectByExample(Account example) {

        AccountExample.Criteria criteria=accountExample.createCriteria();
        criteria.andAccountLoginNameEqualTo(example.getAccountLoginName());
        List<Account> list=accountMapper.selectByExample(accountExample);
        System.out.println("业务层运行");
        return list;
    }

    /**
     * 根据主键查询用户
     * @param id
     * @return
     */
    @Override
    public Account selectByPrimaryKey(Integer id) {
        Account account=accountMapper.selectByPrimaryKey(id);
        System.out.println("业务层运行");
        return account;
    }

    @Override
    public int updateByExampleSelective(Account record, AccountExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Account record, AccountExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return 0;
    }
}
