package com.lwl.project.admin.controller;

import com.lwl.project.admin.pojo.entity.SysRole;
import com.lwl.project.admin.service.BaseService;
import com.lwl.project.admin.service.SysRoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lwl
 */
@Slf4j
@Api(tags = "角色管理")
@RestController
@RequestMapping("/roles")
public class SysRoleController extends BaseController<SysRole> {

    @Autowired
    private SysRoleService roleService;

    @Override
    public BaseService<SysRole> getBaseService() {
        return roleService;
    }
}
