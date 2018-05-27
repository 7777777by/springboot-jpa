package com.xyz.zf.dao;

import com.xyz.zf.pojo.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: liuyang
 * @Date: 20180513 16:57
 */
public interface SysUserDao extends JpaRepository<SysUser, Integer> {
}
