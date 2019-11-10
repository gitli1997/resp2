package cn.lbq.service;

import cn.lbq.entity.UserAccount;

import java.util.List;

public interface UserAccountService {

    List<UserAccount> findAll();

    int saveAccount(UserAccount userAccount);
}
