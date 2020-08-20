package cn.mavenDemo.ssm.service;

import cn.mavenDemo.ssm.pojo.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAllAccounts() throws Exception;
}
