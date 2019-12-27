package com.aaa.sm.controller;

import com.aaa.sm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * fileName:DeptController
 * description:
 * author:**
 * createTime:2019-11-13 11:35
 * version:1.0.0
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 条件查询
     * @param map
     * @return
     */
    @RequestMapping("list")
    public Object list(@RequestParam Map map){
        return deptService.getList(map);
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping("add")
    public Object add(@RequestParam Map map){
        return  deptService.add(map);
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping("update")
    public Object update(@RequestParam Map map){
        return  deptService.update(map);
    }

    /**
     * 删除
     * @param map
     * @return
     */
    @RequestMapping("delete")
    public Object del(@RequestParam Map map){
        return deptService.del(map);
    }
}
