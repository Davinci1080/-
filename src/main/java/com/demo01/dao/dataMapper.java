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

    //��ӹ���
    void addData(data da);

    //�޸Ĺ���
    void upfatedata(data da);

    //����ɾ��
    void deletemanydata(int id);

}