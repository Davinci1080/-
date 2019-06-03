package com.demo01.service.impl;

import com.demo01.dao.dataMapper;
import com.demo01.pojo.data;
import com.demo01.service.dataService;
import com.demo01.vo.ResultUtils;
import com.demo01.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class dataServiceImpl implements dataService {

    @Autowired
    private dataMapper dataDao;
    @Override
    public ResultVo insertdata(data da) {
        if (da != null){
            dataDao.addData(da);
            return ResultUtils.exec(true,"添加成功",null);
        }
        return ResultUtils.exec(false,"添加失败",null);
    }

    @Override
    public ResultVo updatedata(data da) {
        if (da != null){
            dataDao.upfatedata(da);
            return ResultUtils.exec(true,"修改成功",null);
        }
        return ResultUtils.exec(false,"修改失败",null);
    }

    @Override
    public ResultVo deletesome(int id) {
        if (id > 0){
            dataDao.deletemanydata(id);
            return ResultUtils.exec(true,"删除成功",null);
        }
        return ResultUtils.exec(false,"删除失败",null);
    }


}
