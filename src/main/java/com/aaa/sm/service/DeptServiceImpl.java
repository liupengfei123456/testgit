package com.aaa.sm.service;

import com.aaa.sm.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * fileName:DeptServiceImpl
 * description:
 * author:**
 * createTime:2019-11-13 11:34
 * version:1.0.0
 */
@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    /**
     * 查询
     * @param map
     * @return
     */
    @Override
    public List<Map> getList(Map map) {
        return deptDao.getList(map);
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @Override
    public int add(Map map) {
        return deptDao.add(map);
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @Override
    public int update(Map map) {
        return deptDao.update(map);
    }

    /**
     * 删除
     * @param map
     * @return
     */
    @Override
    public int del(Map map) {
        return deptDao.del(map);
    }
}
