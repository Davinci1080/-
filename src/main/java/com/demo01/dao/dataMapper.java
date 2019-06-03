package com.demo01.dao;

import com.demo01.pojo.data;

import java.util.List;

public interface dataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(data record);

    int insertSelective(data record);

    data selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(data record);

    int updateByPrimaryKey(data record);

    //添加功能
    void addData(data da);

    //修改功能
    void upfatedata(data da);

    //批量删除
    void deletemanydata(int id);

}