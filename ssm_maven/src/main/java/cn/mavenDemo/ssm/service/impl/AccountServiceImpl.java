package cn.mavenDemo.ssm.service.impl;

import cn.mavenDemo.ssm.dao.AccountMapper;
import cn.mavenDemo.ssm.pojo.Account;
import cn.mavenDemo.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public List<Account> findAllAccounts() throws Exception {
        return accountMapper.findAllAccounts();
    }
}
