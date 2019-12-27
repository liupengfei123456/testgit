package com.aaa.sm.service;

import java.util.List;
import java.util.Map;

/**
 * fileName:DeptService
 * description:
 * author:**
 * createTime:2019-11-13 11:33
 * version:1.0.0
 */
public interface DeptService {
    List<Map> getList(Map map);
    int add(Map map);
    int update(Map map);
    int del(Map map);
}
