package cn.mavenDemo.ssm.web;

import cn.mavenDemo.ssm.pojo.Account;
import cn.mavenDemo.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("AccountViewAction")
public class AccountViewAction {
    @Autowired
    AccountService accountService;

    @RequestMapping("/AccountView")
    public ModelAndView findAllAccounts() throws Exception{
        ModelAndView mv=new ModelAndView();
        List<Account> list=accountService.findAllAccounts();
        mv.addObject("accounts", list);
        mv.setViewName("AccountList");
        return mv;
    }
}
