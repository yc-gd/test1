package cn.mavenDemo.ssm.dao;

import cn.mavenDemo.ssm.pojo.Account;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface AccountMapper {
     List<Account> findAllAccounts() throws Exception;
}
