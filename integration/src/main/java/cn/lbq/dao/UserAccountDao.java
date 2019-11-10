package cn.lbq.dao;

import cn.lbq.entity.UserAccount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAccountDao {

    @Select("select * from userAccount")
    List<UserAccount> findAll();

    @Insert("insert into userAccount (name,money) values (#{name},#{money})")
    int saveAccount(UserAccount userAccount);

}
