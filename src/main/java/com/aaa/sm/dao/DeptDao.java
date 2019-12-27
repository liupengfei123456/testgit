package com.aaa.sm.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * fileName:DeptDao
 * description:
 * author:**
 * createTime:2019-11-13 11:28
 * version:1.0.0
 */
public interface DeptDao {
    /**
     * 根据参数查询列表
     * @param map
     * @return
     */
    @Select("select * from dept")
    List<Map> getList(Map map);

    /**
     * 添加
     * @param map
     * @return
     */
    @Insert("insert into dept values(seq_dept_no.nextval,#{dName},#{loc})")
    int add(Map map);

    /**
     * 修改
     * @param map
     * @return
     */
    @Update("update dept set dname=#{dName},loc=#{loc} where deptno=#{deptNo}")
    int update(Map map);


    /**
     * 删除
     * @param map
     * @return
     */
    @Delete("delete from dept where deptno=#{deptNo}")
    int del(Map map);
}
