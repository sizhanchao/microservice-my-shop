package com.zhan.myshop.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhan.myshop.commons.domain.TbUser;
import com.zhan.myshop.service.user.api.TbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author zhan
 * @since 2019-05-09 10:54
 */
@Controller
@RequestMapping(value = "user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String list(Model model) {
        List<TbUser> tbUsers = tbUserService.selectAll();
        TbUser tbUser = tbUsers.get(0);
        System.out.println(tbUser.toString());
        model.addAttribute("tbUsers", tbUsers);
        return "user/list";
    }
}
