package com.xyz.zf.service.impl;

import com.xyz.zf.dao.SysUserDao;
import com.xyz.zf.pojo.SysUser;
import com.xyz.zf.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author: liuyang
 * @Date: 20180513 17:08
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser getUser(Integer id) {
        Optional<SysUser> optionalSysUser = sysUserDao.findById(id);
        return optionalSysUser.get();
    }
}
