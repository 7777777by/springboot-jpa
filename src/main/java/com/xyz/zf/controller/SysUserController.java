package com.xyz.zf.controller;

import com.xyz.zf.dao.SysUserDao;
import com.xyz.zf.pojo.SysUser;
import com.xyz.zf.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: liuyang
 * @Date: 20180513 17:00
 */
@RestController
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/index")
    public SysUser index(Integer id) {
        return sysUserService.getUser(id);
    }
}
