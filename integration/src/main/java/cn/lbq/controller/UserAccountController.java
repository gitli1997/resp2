package cn.lbq.controller;

import cn.lbq.entity.UserAccount;
import cn.lbq.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/userAccount")
public class UserAccountController {

    @Autowired
    @Qualifier("userAccountService")
    private UserAccountService userAccountService;


    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("查询所有的账户信息");

        List<UserAccount> list = userAccountService.findAll();
        model.addAttribute("userAccount", list);
//        调用service的方法
        return "success";
    }

    @RequestMapping("/saveUserAccount")
    public void saveUserAccount(UserAccount userAccount, HttpServletRequest request, HttpServletResponse response) {
        int result = userAccountService.saveAccount(userAccount);
        if (result > 0) {
            try {
                response.sendRedirect(request.getContextPath() + "/userAccount/findAll");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("失败");
        }

    }


}
