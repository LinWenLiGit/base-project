package com.lwl.project.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwl.project.admin.dao.SysUserMapper;
import com.lwl.project.admin.pojo.entity.SysUser;
import com.lwl.project.admin.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public BaseMapper<SysUser> getMapper() {
        return sysUserMapper;
    }

    @Override
    public SysUser selectByName(String userName) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", userName);
        wrapper.or().eq("phone", userName);
        wrapper.or().eq("email", userName);
        return sysUserMapper.selectOne(wrapper);
    }
}
