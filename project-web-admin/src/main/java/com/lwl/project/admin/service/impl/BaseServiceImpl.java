package com.lwl.project.admin.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwl.project.admin.service.BaseService;

import java.util.List;
import java.util.Map;

/**
 * 通用基本curd方法
 *
 * 1.restful
 *
 * 1.查询 GET
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * @author lwl
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 获取基本mapper
     * @return BaseMapper
     */
    public abstract BaseMapper<T> getMapper();

    @Override
    public Integer selectCountByMap(Map<String, Object> paramMap) {
        // TODO 待处理
//        return getMapper().selectCount(null);
        return 100;
    }

    @Override
    public T selectById(Integer id) {
        return getMapper().selectById(id);
    }

    @Override
    public List<T> selectByMap(Map<String,Object> paramMap) {
        return getMapper().selectByMap(paramMap);
    }

    @Override
    public Integer add(T t) {
        return getMapper().insert(t);
    }

    @Override
    public Integer update(T t) {
        return getMapper().updateById(t);
    }

    @Override
    public Integer delById(Integer id) {
        return getMapper().deleteById(id);
    }
}