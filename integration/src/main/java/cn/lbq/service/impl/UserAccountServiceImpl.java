package cn.lbq.service.impl;

import cn.lbq.dao.UserAccountDao;
import cn.lbq.entity.UserAccount;
import cn.lbq.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountDao userAccountDao;



    @Override
    public List<UserAccount> findAll() {
        List<UserAccount> list = userAccountDao.findAll();
        return list;
    }

    @Override
    public int saveAccount(UserAccount userAccount) {
        return userAccountDao.saveAccount(userAccount);
    }
}
